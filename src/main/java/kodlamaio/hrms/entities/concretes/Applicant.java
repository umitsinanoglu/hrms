package kodlamaio.hrms.entities.concretes;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "applicants")
@NoArgsConstructor
@AllArgsConstructor
public class Applicant extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "applicant_id")
    private int id;

    @Column(name = "resume")
    private String resume;

    @NotBlank
    @NotNull
    @Column(name = "is_approved")
    private boolean isApproved;

}
