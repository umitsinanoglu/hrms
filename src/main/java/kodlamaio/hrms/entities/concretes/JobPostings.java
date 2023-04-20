package kodlamaio.hrms.entities.concretes;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name = "job_postings")
@NoArgsConstructor
@AllArgsConstructor
public class JobPostings {

    @Id
    @Column(name="id")
    private int jobPostingId;

    @NotBlank
    @NotNull
    @Column(name="description")
    private String jobDescription;

    @NotBlank
    @NotNull
    @Column(name="start_date")
    private Date startDate;

    @NotBlank
    @NotNull
    @Column(name="end_date")
    private Date endDate;

    @NotBlank
    @NotNull
    @Column(name="free_position_amount")
    private int availableJobs;

    @NotBlank
    @NotNull
    @Column(name="min_salary")
    private Double minSalary;

    @NotBlank
    @NotNull
    @Column(name="max_salary")
    private Double maxSalary;

    @NotBlank
    @NotNull
    @Column(name="status")
    private boolean status;

    @NotBlank
    @NotNull
    @Column(name="city_id")
    private int jobCity;

    @NotBlank
    @NotNull
    @Column(name="employer_id")
    private int employerId;

    //@NotBlank
    //@NotNull
    //@Column(name="job_id")
    //private int jobId;

    @ManyToOne()
    @JoinColumn(name = "job_id")
    private Job job;

}
