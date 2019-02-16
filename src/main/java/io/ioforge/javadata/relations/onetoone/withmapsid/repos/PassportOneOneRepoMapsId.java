package io.ioforge.javadata.relations.onetoone.withmapsid.repos;

import io.ioforge.javadata.relations.onetoone.withmapsid.entities.PassportOneOneMapsId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportOneOneRepoMapsId extends JpaRepository<PassportOneOneMapsId, Integer> {
}
