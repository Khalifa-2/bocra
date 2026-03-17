package bw.bocra.ironclad_backend.complaint;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/complaints")
@RequiredArgsConstructor
public class ComplaintController {

      private final ComplaintService complaintService;

      @PostMapping("/submit")
      public ResponseEntity<ComplaintResponse> submitComplaint(@Valid @RequestBody ComplaintRequest request) {
            return ResponseEntity.ok(complaintService.submitComplaint(request));
      }

      @GetMapping("/track/{referenceNumber}")
      public ResponseEntity<ComplaintResponse> trackComplaint(@PathVariable String referenceNumber) {
            return ResponseEntity.ok(complaintService.trackComplaint(referenceNumber));
      }

      @GetMapping("/all")
      public ResponseEntity<List<ComplaintResponse>> getAllComplaints() {
            return ResponseEntity.ok(complaintService.getAllComplaints());
      }

      @PutMapping("/{referenceNumber}/status")
      public ResponseEntity<ComplaintResponse> updateStatus(
                  @PathVariable String referenceNumber,
                  @RequestParam ComplaintStatus status) {
            return ResponseEntity.ok(complaintService.updateStatus(referenceNumber, status));
      }

      @GetMapping("/by-status")
      public ResponseEntity<List<ComplaintResponse>> getByStatus(@RequestParam ComplaintStatus status) {
            return ResponseEntity.ok(complaintService.getComplaintsByStatus(status));
      }
}
