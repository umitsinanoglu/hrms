package kodlamaio.hrms.entities.concretes;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "employers")
@NoArgsConstructor
@AllArgsConstructor
public class Employer extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employer_id")
    private int employerId;

    @NotBlank
    @NotNull
    @Column(name = "company_name")
    private String companyName;

    @NotBlank
    @NotNull
    @Column(name = "web_address")
    private String webAddress;

    @NotBlank
    @NotNull
    @Column(name = "phone_number")
    private String phoneNumber;

    @NotBlank
    @NotNull
    @Column(name = "is_approved")
    private boolean isApproved;


}
