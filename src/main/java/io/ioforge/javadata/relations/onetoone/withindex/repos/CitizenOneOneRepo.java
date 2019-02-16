package io.ioforge.javadata.relations.onetoone.withindex.repos;

import io.ioforge.javadata.relations.onetoone.withindex.entities.CitizenOneOne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenOneOneRepo extends JpaRepository<CitizenOneOne, Integer> {
}
