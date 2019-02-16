package io.ioforge.javadata.relations.onetoone.withindex.service.rest;

import io.ioforge.javadata.relations.onetoone.withindex.entities.PassportOneOne;
import io.ioforge.javadata.relations.onetoone.withindex.repos.PassportOneOneRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/onetoone/passport", produces = "application/json")
@RequiredArgsConstructor
public class RestPassportOneOne {
    private final PassportOneOneRepo repository;

    @PostMapping(path = "/insert")
    private void insert(@RequestBody PassportOneOne passportOneOne) {
        repository.save(passportOneOne);
    }

    @GetMapping(path = "/findall")
    private List<PassportOneOne> findAll() throws Exception {
        return repository.findAll();
    }

    @RequestMapping(path = "/find/{id}", method = RequestMethod.GET)
    private PassportOneOne findById(@PathVariable int id) {
        return repository.findById(id).orElse(null);
    }
}