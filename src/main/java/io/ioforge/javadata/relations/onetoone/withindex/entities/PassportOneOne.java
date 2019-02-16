package io.ioforge.javadata.relations.onetoone.withindex.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
public class PassportOneOne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nationality;
    private Timestamp creationDate;
    private Timestamp expirationDate;

    @OneToOne(mappedBy = "passport", cascade = CascadeType.ALL)
    @JsonBackReference
    private CitizenOneOne citizen;
}