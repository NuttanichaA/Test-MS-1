package testbe.enttity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb1")
@Data
public class Tb1 {
    @Id
    @Column(name = "StudentID", nullable = false, length = 11)
    private String studentID;

    @Column(name = "FullName", length = 50)
    private String fullName;

    @Column(name = "University", length = 20)
    private String university;

}