package com.club_app.fixture.controller;

import com.club_app.fixture.dto.PartidoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.club_app.fixture.service.FixtureService;

import java.util.List;

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

    @GetMapping("/fecha")
    public ResponseEntity<List<PartidoDto>> getByDate(String fecha){
        return ResponseEntity.ok(fixtureService.getByDate(fecha));
    }

    @GetMapping("/cat/{category}")
    public ResponseEntity<List<PartidoDto>> getByCategory(@PathVariable String category){
        return ResponseEntity.ok(fixtureService.getByCategory(category));
    }

    @GetMapping("/nextWeekend")
    public ResponseEntity<List<PartidoDto>> getNextWeekend(){
        return ResponseEntity.ok(fixtureService.getNextWeekend());
    }

    @GetMapping
    public ResponseEntity<List<PartidoDto>> getAll(){
        return ResponseEntity.ok(fixtureService.getAll());
    }

    @PostMapping
    public ResponseEntity<PartidoDto> crearPartido(@RequestBody PartidoDto partido){
        return ResponseEntity.ok(fixtureService.crearPartido(partido));
    }

    @PostMapping("/multiple")
    public ResponseEntity<List<PartidoDto>> crearPartidos(@RequestBody List<PartidoDto> partidos){
        return ResponseEntity.ok(fixtureService.crearPartidos(partidos));
    }

    @PutMapping
    public ResponseEntity<PartidoDto> putPartido(@RequestBody PartidoDto partido){
        return ResponseEntity.ok(fixtureService.putPartido(partido));
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<Void> deletePartido(@PathVariable Long id){
        fixtureService.deletePartido(id);
        return ResponseEntity.noContent().build();
    }

}
