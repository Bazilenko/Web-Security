package chnu.edu.websecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

/*
  @author   kifuk
  @project   web-security
  @class  AuditionConfiguration
  @version  1.0.0 
  @since 10/6/2026 - 15.37
*/
@EnableMongoAuditing
@Configuration
public class AuditionConfiguration {
    @Bean
    public AuditorAware<String> auditorAware(){
        return new AuditorAwareImpl();
    }
}
