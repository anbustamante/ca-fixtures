package com.club_app.fixture.dao;

import com.club_app.fixture.dto.PartidoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FixtureDao extends JpaRepository<PartidoDto,Long> {


    List<PartidoDto> findByCategoria(String categoria);

    @Query(value = "SELECT * FROM partidos WHERE fecha BETWEEN :fechaInicial AND :fechaFinal",nativeQuery = true)
    List<PartidoDto> findByDate(String fechaInicial, String fechaFinal);
}
