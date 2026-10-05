package chnu.edu.websecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WebSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSecurityApplication.class, args);
    }

}
