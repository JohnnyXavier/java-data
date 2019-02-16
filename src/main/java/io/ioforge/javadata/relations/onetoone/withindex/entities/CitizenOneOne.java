package io.ioforge.javadata.relations.onetoone.withindex.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(indexes = {
        @Index(columnList = "passport_id", name = "passport_id_idx")
})
public class CitizenOneOne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private PassportOneOne passport;
}