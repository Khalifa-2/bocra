package bw.bocra.ironclad_backend.publication;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/publications")
@RequiredArgsConstructor
public class PublicationController {

      private final PublicationService publicationService;

      @PostMapping
      public ResponseEntity<PublicationResponse> createPublication(
                  @Valid @RequestBody PublicationRequest request) {
            return ResponseEntity.ok(publicationService.createPublication(request));
      }

      @GetMapping("/{id}")
      public ResponseEntity<PublicationResponse> getPublication(
                  @PathVariable Long id) {
            return ResponseEntity.ok(publicationService.getPublicationById(id));
      }

      @GetMapping
      public ResponseEntity<List<PublicationResponse>> getAllPublications() {
            return ResponseEntity.ok(publicationService.getAllPublications());
      }

      @GetMapping("/category/{category}")
      public ResponseEntity<List<PublicationResponse>> getByCategory(
                  @PathVariable PublicationCategory category) {
            return ResponseEntity.ok(publicationService.getByCategory(category));
      }

      @GetMapping("/search")
      public ResponseEntity<List<PublicationResponse>> search(
                  @RequestParam String keyword) {
            return ResponseEntity.ok(publicationService.searchPublications(keyword));
      }

      @PutMapping("/{id}")
      public ResponseEntity<PublicationResponse> updatePublication(
                  @PathVariable Long id,
                  @Valid @RequestBody PublicationRequest request) {
            return ResponseEntity.ok(publicationService.updatePublication(id, request));
      }

      @DeleteMapping("/{id}")
      public ResponseEntity<Void> deletePublication(
                  @PathVariable Long id) {
            publicationService.deletePublication(id);
            return ResponseEntity.noContent().build();
      }
}