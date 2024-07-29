package airballcup.cup;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenAPIConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Beer Pong API")
                        .version("1.0")
                        .description("API documentation for Beer Pong application")
                        .contact(new Contact()
                                .name("John Doe")
                                .email("johndoe@example.com")))
                .servers(List.of(new Server()
                        .url("http://localhost:8080")
                        .description("Development server")));
    }
}
