package hello;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Emp {


    @Id
    @GeneratedValue
    public int id;
    public String name;
    public String age;
    public String password;
    public String role;



}
