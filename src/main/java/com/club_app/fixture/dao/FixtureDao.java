package com.club_app.fixture.dao;

import com.club_app.fixture.dto.PartidoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FixtureDao extends JpaRepository<PartidoDto,Long> {

}
