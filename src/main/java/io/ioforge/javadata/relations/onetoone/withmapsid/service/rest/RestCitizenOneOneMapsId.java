package io.ioforge.javadata.relations.onetoone.withmapsid.service.rest;

import io.ioforge.javadata.relations.onetoone.withmapsid.entities.CitizenOneOneMapsId;
import io.ioforge.javadata.relations.onetoone.withmapsid.repos.CitizenOneOneRepoMapsId;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/onetoone/citizen", produces = "application/json")
@RequiredArgsConstructor
public class RestCitizenOneOneMapsId {
    private final CitizenOneOneRepoMapsId repositoryMapsId;

    @PostMapping(path = "/insertMapsId")
    private void insertMapsId(@RequestBody CitizenOneOneMapsId citizenOneOneMapsId) {
        repositoryMapsId.save(citizenOneOneMapsId);
    }

    @GetMapping(path = "/findallMapsId")
    private List<CitizenOneOneMapsId> findAllMapsId() throws Exception {
        return repositoryMapsId.findAll();
    }

    @GetMapping(path = "/findMapsId/{id}", produces = "application/json")
    private CitizenOneOneMapsId findByIdMapsId(@PathVariable int id) {
        return repositoryMapsId.findById(id).orElse(null);
    }
}
