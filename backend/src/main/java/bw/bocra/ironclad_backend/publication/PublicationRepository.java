package bw.bocra.ironclad_backend.publication;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationRepository extends JpaRepository<Publication, Long> {

      List<Publication> findByCategory(PublicationCategory category);

      List<Publication> findByActiveTrue();

      List<Publication> findByCategoryAndActiveTrue(PublicationCategory category);

      @Query("SELECT p FROM Publication p WHERE " +
                  "LOWER(p.title) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
                  "LOWER(p.description) LIKE LOWER(CONCAT('%', :keyword, '%'))")
      List<Publication> searchByKeyword(@Param("keyword") String keyword);

      Long countByCategory(PublicationCategory category);
}
