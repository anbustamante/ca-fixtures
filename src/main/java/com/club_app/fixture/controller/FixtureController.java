package com.club_app.fixture.controller;

import com.club_app.fixture.dto.PartidoDto;
import jakarta.servlet.http.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.club_app.fixture.service.FixtureService;

import java.util.ArrayList;

@RestController
@RequestMapping("/fixture")
public class FixtureController {

    FixtureService fixtureService;

    @Autowired
    public FixtureController(FixtureService fixtureService) {
        this.fixtureService = fixtureService;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<PartidoDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(fixtureService.getById(id));
    }

    @GetMapping("/fecha/{date}")
    public ResponseEntity<ArrayList<PartidoDto>> getByDate(@PathVariable String date){
        return ResponseEntity.ok(fixtureService.getByDate(date));
    }
    //TODO: getByDate()

    //TODO: getAll()

    //TODO: getByCategory

    //TODO:
}
