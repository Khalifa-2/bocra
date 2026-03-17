package bw.bocra.ironclad_backend.publication;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PublicationService {

      private final PublicationRepository publicationRepository;

      public PublicationResponse createPublication(PublicationRequest request) {
            Publication publication = Publication.builder()
                        .title(request.getTitle())
                        .description(request.getDescription())
                        .category(request.getCategory())
                        .fileUrl(request.getFileUrl())
                        .fileType(request.getFileType())
                        .publishedDate(request.getPublishedDate())
                        .build();

            Publication saved = publicationRepository.save(publication);
            return mapToResponse(saved);
      }

      public PublicationResponse getPublicationById(Long id) {
            Publication publication = publicationRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException(
                                    "No publication found with id: " + id));
            return mapToResponse(publication);
      }

      public List<PublicationResponse> getAllPublications() {
            return publicationRepository.findByActiveTrue()
                        .stream()
                        .map(this::mapToResponse)
                        .collect(Collectors.toList());
      }

      public List<PublicationResponse> getByCategory(PublicationCategory category) {
            return publicationRepository.findByCategoryAndActiveTrue(category)
                        .stream()
                        .map(this::mapToResponse)
                        .collect(Collectors.toList());
      }

      public List<PublicationResponse> searchPublications(String keyword) {
            return publicationRepository.searchByKeyword(keyword)
                        .stream()
                        .map(this::mapToResponse)
                        .collect(Collectors.toList());
      }

      public PublicationResponse updatePublication(Long id, PublicationRequest request) {
            Publication publication = publicationRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException(
                                    "No publication found with id: " + id));

            publication.setTitle(request.getTitle());
            publication.setDescription(request.getDescription());
            publication.setCategory(request.getCategory());
            publication.setFileUrl(request.getFileUrl());
            publication.setFileType(request.getFileType());
            publication.setPublishedDate(request.getPublishedDate());

            Publication updated = publicationRepository.save(publication);
            return mapToResponse(updated);
      }

      public void deletePublication(Long id) {
            Publication publication = publicationRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException(
                                    "No publication found with id: " + id));
            publication.setActive(false);
            publicationRepository.save(publication);
      }

      private PublicationResponse mapToResponse(Publication publication) {
            return PublicationResponse.builder()
                        .id(publication.getId())
                        .title(publication.getTitle())
                        .description(publication.getDescription())
                        .category(publication.getCategory().name())
                        .fileUrl(publication.getFileUrl())
                        .fileType(publication.getFileType())
                        .publishedDate(publication.getPublishedDate())
                        .active(publication.getActive())
                        .createdAt(publication.getCreatedAt())
                        .updatedAt(publication.getUpdatedAt())
                        .build();
      }
}