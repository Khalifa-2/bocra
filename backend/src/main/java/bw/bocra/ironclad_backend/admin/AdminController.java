package bw.bocra.ironclad_backend.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {

      private final AdminService adminService;

      @GetMapping("/stats")
      public ResponseEntity<AdminStatsResponse> getStats() {
            return ResponseEntity.ok(adminService.getStats());
      }
}