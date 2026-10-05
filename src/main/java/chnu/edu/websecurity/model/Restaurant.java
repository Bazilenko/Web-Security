package chnu.edu.websecurity.model;
import lombok.*;
import org.springframework.data.annotation.Id;

/*
  @author   kifuk
  @project   web-security
  @class  Item
  @version  1.0.0 
  @since 9/8/2026 - 13.02
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Restaurant {
    @Id
    private String id;
    private String name;
    private String description;
}
