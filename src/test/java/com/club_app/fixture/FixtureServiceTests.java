package com.club_app.fixture;

import com.club_app.fixture.dao.FixtureDao;
import com.club_app.fixture.exceptions.NotFoundException;
import com.club_app.fixture.service.FixtureService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class FixtureServiceTests {

    @Mock
    private FixtureDao fixtureDao;

    @InjectMocks
    private FixtureService fixtureService;

    @Test
    void getById_ThrowsNotFoundException_WhenIdDoesNotExist() {
        Long nonExistentId = 1L;
        when(fixtureDao.findById(nonExistentId)).thenReturn(Optional.empty());

        assertThrows(NotFoundException.class, () -> fixtureService.getById(nonExistentId));
    }
}
