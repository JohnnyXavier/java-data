package io.ioforge.javadata.relations.onetoone.withindex.repos;

import io.ioforge.javadata.relations.onetoone.withindex.entities.PassportOneOne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportOneOneRepo extends JpaRepository<PassportOneOne, Integer> {
}
