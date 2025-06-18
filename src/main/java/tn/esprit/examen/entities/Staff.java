package tn.esprit.examen.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "staffs")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
  @Id
  private String idStaff;
  private String NameStaff;
  private String Email;
  private LocalDate birthdate;
  private String address;
  private Integer phoneNumber;
  private RoleStaff roleStaff;
  private String password;
  private List<Order> orders; // Embedded
  private List<Product> products; // Embedded


}
