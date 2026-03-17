package bw.bocra.ironclad_backend.complaint;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ComplaintService {

    private final ComplaintRepository complaintRepository;

    public ComplaintResponse submitComplaint(ComplaintRequest request) {
        String referenceNumber = generateReferenceNumber();

        Complaint complaint = Complaint.builder()
                .referenceNumber(referenceNumber)
                .subject(request.getSubject())
                .description(request.getDescription())
                .category(request.getCategory())
                .complainantName(request.getComplainantName())
                .complainantEmail(request.getComplainantEmail())
                .complainantPhone(request.getComplainantPhone())
                .build();

        Complaint saved = complaintRepository.save(complaint);
        return mapToResponse(saved);
    }

    public ComplaintResponse trackComplaint(String referenceNumber) {
        Complaint complaint = complaintRepository
                .findByReferenceNumber(referenceNumber)
                .orElseThrow(() -> new RuntimeException(
                        "No complaint found with reference number: " + referenceNumber));
        return mapToResponse(complaint);
    }

    public List<ComplaintResponse> getAllComplaints() {
        return complaintRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    public ComplaintResponse updateStatus(String referenceNumber, ComplaintStatus newStatus) {
        Complaint complaint = complaintRepository
                .findByReferenceNumber(referenceNumber)
                .orElseThrow(() -> new RuntimeException(
                        "No complaint found with reference number: " + referenceNumber));
        complaint.setStatus(newStatus);
        Complaint updated = complaintRepository.save(complaint);
        return mapToResponse(updated);
    }

    public List<ComplaintResponse> getComplaintsByStatus(ComplaintStatus status) {
        return complaintRepository.findByStatus(status)
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    private String generateReferenceNumber() {
        String datePart = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String randomPart = String.format("%04d", new Random().nextInt(9999));
        return "BOCRA-" + datePart + "-" + randomPart;
    }

    private ComplaintResponse mapToResponse(Complaint complaint) {
        return ComplaintResponse.builder()
                .id(complaint.getId())
                .referenceNumber(complaint.getReferenceNumber())
                .subject(complaint.getSubject())
                .description(complaint.getDescription())
                .category(complaint.getCategory())
                .status(complaint.getStatus().name())
                .complainantName(complaint.getComplainantName())
                .complainantEmail(complaint.getComplainantEmail())
                .complainantPhone(complaint.getComplainantPhone())
                .createdAt(complaint.getCreatedAt())
                .updatedAt(complaint.getUpdatedAt())
                .build();
    }
}