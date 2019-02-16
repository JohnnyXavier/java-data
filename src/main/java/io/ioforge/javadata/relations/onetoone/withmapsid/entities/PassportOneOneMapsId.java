package io.ioforge.javadata.relations.onetoone.withmapsid.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
public class PassportOneOneMapsId {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nationality;
    private Timestamp creationDate;
    private Timestamp expirationDate;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "passport")
    @JsonBackReference
    private CitizenOneOneMapsId citizen;
}