package io.ioforge.javadata.relations.onetoone.withmapsid.service.rest;

import io.ioforge.javadata.relations.onetoone.withmapsid.entities.PassportOneOneMapsId;
import io.ioforge.javadata.relations.onetoone.withmapsid.repos.PassportOneOneRepoMapsId;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/onetoone/passport", produces = "application/json")
@RequiredArgsConstructor
public class RestPassportOneOneMapsId {
    private final PassportOneOneRepoMapsId repoMapsId;

    @PostMapping(path = "/insertMapsId")
    private void insertMapsId(@RequestBody PassportOneOneMapsId passportOneOneMapsId) {
        repoMapsId.save(passportOneOneMapsId);
    }

    @GetMapping(path = "/findallMapsId")
    private List<PassportOneOneMapsId> findAllMapsId() throws Exception {
        return repoMapsId.findAll();
    }

    @GetMapping(path = "/findMapsId/{id}")
    private PassportOneOneMapsId findByIdMapsId(@PathVariable int id) {
        return repoMapsId.findById(id).orElse(null);
    }
}
