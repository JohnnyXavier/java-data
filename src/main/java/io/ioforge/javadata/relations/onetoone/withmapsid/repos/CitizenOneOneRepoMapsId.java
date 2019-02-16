package io.ioforge.javadata.relations.onetoone.withmapsid.repos;

import io.ioforge.javadata.relations.onetoone.withmapsid.entities.CitizenOneOneMapsId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenOneOneRepoMapsId extends JpaRepository<CitizenOneOneMapsId, Integer> {
}
