package com.club_app.fixture.service;

import com.club_app.fixture.dao.FixtureDao;
import com.club_app.fixture.dto.PartidoDto;
import com.club_app.fixture.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class FixtureService {

    FixtureDao fixturedao;
    @Autowired
    public FixtureService(FixtureDao fixturedao) {
        this.fixturedao = fixturedao;
    }

    public PartidoDto getById(Long id) {
        if (fixturedao.findById(id).isPresent()){
            return fixturedao.findById(id).get();
        }else {
            throw new NotFoundException("No se encontro partido con id: " + id);
        }

    }

    public List<PartidoDto> getByDate(String fechaObjetivo) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate fecha = LocalDate.parse(fechaObjetivo,formatter);
        LocalDate fechaInicial = fecha.minusDays(1);
        LocalDate fechaFinal = fecha.plusDays(1);

        String fechaInicialString = fechaInicial.toString();
        String fechaFinalString = fechaFinal.toString();

        return fixturedao.findByDate(fechaInicialString,fechaFinalString);

    }

    public List<PartidoDto> getByCategory(String categoria) {
        return fixturedao.findByCategoria(categoria.toUpperCase());
    }

    public List<PartidoDto> getAll() {
        return fixturedao.findAll();
    }

    public PartidoDto crearPartido(PartidoDto partido) {
        partido.setCategoria(partido.getCategoria().toUpperCase());
        return fixturedao.save(partido);
    }

    public List<PartidoDto> crearPartidos(List<PartidoDto> partidos) {
        for (PartidoDto partido : partidos) {
            partido.setCategoria(partido.getCategoria().toUpperCase());
        }
        return fixturedao.saveAll(partidos);
    }

    public PartidoDto putPartido(PartidoDto partido) {
        if (fixturedao.findById(partido.getId()).isPresent()){
            return fixturedao.save(partido);
        } else {
            throw new NotFoundException("No se encontro partido con id: " + partido.getId());
        }
    }


    public void deletePartido(Long id) {
        if (fixturedao.findById(id).isPresent()){
            fixturedao.deleteById(id);
        } else {
            throw new NotFoundException("No se encontro partido con id: " + id);
        }
    }
}
