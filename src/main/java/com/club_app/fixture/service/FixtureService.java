package com.club_app.fixture.service;

import com.club_app.fixture.dao.FixtureDao;
import com.club_app.fixture.dto.PartidoDto;
import com.club_app.fixture.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

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

    public ArrayList<PartidoDto> getByDate(Date date) {
        //TODO: implementar que se busquen los partidos a partir de esa fecha 2 dias antes y 2 dias despues.

    }
}
