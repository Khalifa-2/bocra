package bw.bocra.ironclad_backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

      @Bean
      public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            http
                        .csrf(AbstractHttpConfigurer::disable)
                        .sessionManagement(session -> session
                                    .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                        .authorizeHttpRequests(auth -> auth
                                    .requestMatchers(
                                                "/api/auth/**",
                                                "/api/complaints/submit",
                                                "/api/complaints/track/**",
                                                "/api/licenses/apply",
                                                "/api/licenses/{licenseNumber}",
                                                "/swagger-ui.html",
                                                "/swagger-ui/**",
                                                "/swagger-ui/index.html",
                                                "/v3/api-docs",
                                                "/v3/api-docs/**",
                                                "/webjars/**",
                                                "/api/publications/**",
                                                "/api/domains/**")
                                    .permitAll()
                                    .anyRequest().authenticated());

            return http.build();
      }

      @Bean
      public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
      }
}
