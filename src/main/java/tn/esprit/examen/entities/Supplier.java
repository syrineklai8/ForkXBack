package tn.esprit.examen.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "suppliers")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Supplier {
  @Id
  private String idSupplier;
  private String nameSupplier;
  private Integer numberSupplier;
  private String email;
  private String productSupplied;
  private String address;

}
