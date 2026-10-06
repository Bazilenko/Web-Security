package chnu.edu.websecurity.config;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

/*
  @author   kifuk
  @project   web-security
  @class  AuditorAwareImpl
  @version  1.0.0 
  @since 10/6/2026 - 15.08
*/
public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        //   return Optional.of(System.getProperty("user.name"));
        return Optional.of("Admin");
    }
}
