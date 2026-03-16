package bw.bocra.ironclad_backend.auth;

import bw.bocra.ironclad_backend.user.User;
import bw.bocra.ironclad_backend.user.UserRepository;
import bw.bocra.ironclad_backend.user.UserRole;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

      private final UserRepository userRepository;
      private final PasswordEncoder passwordEncoder;
      private final JwtUtil jwtUtil;

      public AuthResponse register(RegisterRequest request) {
            if (userRepository.existsByEmail(request.getEmail())) {
                  throw new RuntimeException("Email already registered");
            }

            User user = User.builder()
                        .name(request.getName())
                        .email(request.getEmail())
                        .password(passwordEncoder.encode(request.getPassword()))
                        .role(UserRole.CITIZEN)
                        .build();

            userRepository.save(user);

            String token = jwtUtil.generateToken(user.getEmail());

            return new AuthResponse(
                        token,
                        user.getEmail(),
                        user.getName(),
                        user.getRole().name());
      }

      public AuthResponse login(AuthRequest request) {
            User user = userRepository.findByEmail(request.getEmail())
                        .orElseThrow(() -> new RuntimeException("Invalid email or password"));

            if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
                  throw new RuntimeException("Invalid email or password");
            }

            String token = jwtUtil.generateToken(user.getEmail());

            return new AuthResponse(
                        token,
                        user.getEmail(),
                        user.getName(),
                        user.getRole().name());
      }
}