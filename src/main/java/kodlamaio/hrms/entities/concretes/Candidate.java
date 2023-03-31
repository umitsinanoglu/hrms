package kodlamaio.hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="candidates")
public class Candidate {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String  first_name;
    @Column(name="last_name")
    private String last_name;
    @Column(name="identity_number")
    private String identity_number;
    @Column(name="birth_year")
    private int birth_year;

    public Candidate() {
        super();
    }

    public Candidate(int id, String first_name, String last_name, String identity_number, int birth_year) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.identity_number = identity_number;
        this.birth_year = birth_year;
    }
}
