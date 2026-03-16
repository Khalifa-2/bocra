package bw.bocra.ironclad_backend.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

      @Bean
      public OpenAPI ironcladOpenAPI() {
            return new OpenAPI()
                        .info(new Info()
                                    .title("Ironclad Systems — BOCRA API")
                                    .description("REST API for the BOCRA Website Development Hackathon")
                                    .version("1.0.0")
                                    .contact(new Contact()
                                                .name("Ironclad Systems")
                                                .email("hackathon@bih.co.bw")));
      }
}