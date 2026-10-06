package chnu.edu.websecurity.model;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*
  @author   kifuk
  @project   web-security
  @class  Item
  @version  1.0.0 
  @since 9/8/2026 - 13.02
*/
@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@Document
public class Restaurant extends Auditable {
    @Id
    private String id;
    private String name;
    private String description;

    public Restaurant(String name, String description){
        this.name = name;
        this.description = description;
    }


}
