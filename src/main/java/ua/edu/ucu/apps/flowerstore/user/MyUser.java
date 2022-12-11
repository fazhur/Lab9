package ua.edu.ucu.apps.flowerstore.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

@Entity @Table
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class MyUser {
    @Id
    @GeneratedValue
    private int id;
    @Column(unique = true)
    private String email;
    private LocalDate dob;
    @Transient
    private int age;
    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }
//    Optional<User> findUserByEmail(String email) {
//
//    };
}
