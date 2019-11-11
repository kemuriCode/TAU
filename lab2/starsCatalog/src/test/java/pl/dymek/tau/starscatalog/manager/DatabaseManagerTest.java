package pl.dymek.tau.starscatalog.manager;

import org.mockito.Mockito;
import pl.dymek.tau.starscatalog.domain.models.RedGigantStar;
import pl.dymek.tau.starscatalog.service.exceptions.ObjectAlreadyExistException;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseManagerTest {
    private DatabaseManager database;

    DatabaseManagerTest() {
        database = new DatabaseManager();
    }

    @org.junit.jupiter.api.Test
    public void setsCreatedAtDateOnObjectCreateInDb() throws ObjectAlreadyExistException {
        long createdAt = 40L;
        Date dateMock = Mockito.mock(Date.class);
        Mockito.when(dateMock.getTime()).thenReturn(createdAt);
        RedGigantStar redGigantStar = new RedGigantStar(0);
        redGigantStar.setCreatedAt(dateMock.getTime());
        assertEquals(createdAt, redGigantStar.createdAt);
    }

    @org.junit.jupiter.api.Test
    public void setsUpdatedAtDateOnObjectUpdateInDb() throws ObjectAlreadyExistException {
        long updatedAt = 40L;
        Date dateMock = Mockito.mock(Date.class);
        Mockito.when(dateMock.getTime()).thenReturn(updatedAt);
        RedGigantStar redGigantStar = new RedGigantStar(0);
        redGigantStar.setUpdatedAt(dateMock.getTime());
        assertEquals(updatedAt, redGigantStar.updatedAt);
    }

    @org.junit.jupiter.api.Test
    public void setsReadedAtDateOnObjectReadInDb() throws ObjectAlreadyExistException {
        long readedAt = 40L;
        Date dateMock = Mockito.mock(Date.class);
        Mockito.when(dateMock.getTime()).thenReturn(readedAt);
        RedGigantStar redGigantStar = new RedGigantStar(0);
        redGigantStar.setReadedAt(dateMock.getTime());
        assertEquals(readedAt, redGigantStar.readedAt);
    }
}
