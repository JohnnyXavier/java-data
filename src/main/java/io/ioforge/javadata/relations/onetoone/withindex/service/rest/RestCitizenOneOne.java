package io.ioforge.javadata.relations.onetoone.withindex.service.rest;

import io.ioforge.javadata.relations.onetoone.withindex.entities.CitizenOneOne;
import io.ioforge.javadata.relations.onetoone.withindex.repos.CitizenOneOneRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/onetoone/citizen", produces = "application/json")
@RequiredArgsConstructor
public class RestCitizenOneOne {
    private final CitizenOneOneRepo repository;

    @PostMapping(path = "/insert")
    private void insert(@RequestBody CitizenOneOne citizenOneOne) {
        repository.save(citizenOneOne);
    }

    @GetMapping(path = "/findall")
    private List<CitizenOneOne> findAll() throws Exception {
        return repository.findAll();
    }

    @GetMapping(path = "/find/{id}", produces = "application/json")
    private CitizenOneOne findById(@PathVariable int id) {
        return repository.findById(id).orElse(null);
    }
}
