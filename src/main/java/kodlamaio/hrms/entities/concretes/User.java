package kodlamaio.hrms.entities.concretes;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

    @Column(name = "email")
    @NotBlank
    @NotNull
    @Email
    private String email;

    @Column(name = "password")
    @NotBlank
    @NotNull
    private String password;

    @NotBlank
    @NotNull
    @Column(name = "birth_year")
    private int birthYear;

    @NotBlank
    @NotNull
    @Column(name = "first_name")
    private String firstName;

    @NotBlank
    @NotNull
    @Column(name = "last_name")
    private String lastName;

    @NotBlank
    @NotNull
    @Column(name = "identity_number")
    private String identityNumber;

    @NotBlank
    @NotNull
    @Column(name = "phone_number")
    private String phoneNumber;



}
