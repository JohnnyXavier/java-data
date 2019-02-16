package io.ioforge.javadata.relations.onetoone.withmapsid.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class CitizenOneOneMapsId {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    @JsonManagedReference
    private PassportOneOneMapsId passport;
}
