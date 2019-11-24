package pl.dymek.tau.starscatalog.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pl.dymek.tau.starscatalog.domain.models.RedGigantStar;
import pl.dymek.tau.starscatalog.manager.DatabaseManager;
import pl.dymek.tau.starscatalog.service.exceptions.ObjectAlreadyExistException;
import pl.dymek.tau.starscatalog.service.exceptions.ObjectDoesNotExistException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RedGigantStarServiceImplTest {
    private RedGigantStarServiceImpl redGigantStarService;

    @BeforeEach
    public void before() {
        DatabaseManager databaseManager = new DatabaseManager();
        this.redGigantStarService = new RedGigantStarServiceImpl(databaseManager);
    }

    @AfterEach
    public void after() {
        this.redGigantStarService = null;
    }

    @org.junit.jupiter.api.Test
    public void throwsExceptionWhenObjectAlreadyExist() throws ObjectAlreadyExistException {
        RedGigantStar redGigantStar = new RedGigantStar(1);
        this.redGigantStarService.create(redGigantStar);
        assertThrows(ObjectAlreadyExistException.class, () -> {
            this.redGigantStarService.create(redGigantStar);
        });
    }

    @org.junit.jupiter.api.Test
    public void createsRedGigantStarInTheDatabase() throws ObjectAlreadyExistException {
        int objectId = 1;
        RedGigantStar redGigantStar = new RedGigantStar(objectId);
        this.redGigantStarService.create(redGigantStar);
        assertEquals(this.redGigantStarService.read(0), redGigantStar);
    }

    @org.junit.jupiter.api.Test
    public void readsAllTheRedGigantStarsFromTheDatabase() throws ObjectAlreadyExistException {
        RedGigantStar redGigantStar = new RedGigantStar(0);
        RedGigantStar otherRedGigantStar = new RedGigantStar(1);
        this.redGigantStarService.create(redGigantStar);
        this.redGigantStarService.create(otherRedGigantStar);
        List<RedGigantStar> listOfRedGigantStars = new ArrayList<>();
        listOfRedGigantStars.add(redGigantStar);
        listOfRedGigantStars.add(otherRedGigantStar);
        assertEquals(this.redGigantStarService.readAll(), listOfRedGigantStars);
    }

    @org.junit.jupiter.api.Test
    public void readRedGigantStarFromTheDatabase() throws ObjectAlreadyExistException {
        RedGigantStar redGigantStar = new RedGigantStar(0);
        this.redGigantStarService.create(redGigantStar);
        assertEquals(this.redGigantStarService.read(redGigantStar.getId()), redGigantStar);
    }

    @org.junit.jupiter.api.Test
    public void updatesRedGigantStarInTheDatabase() throws ObjectAlreadyExistException, ObjectDoesNotExistException {
        RedGigantStar redGigantStar = new RedGigantStar(0);
        this.redGigantStarService.create(redGigantStar);
        redGigantStar.setName("test");
        this.redGigantStarService.update(redGigantStar);
        assertEquals(this.redGigantStarService.read(redGigantStar.getId()), redGigantStar);
    }

    @org.junit.jupiter.api.Test
    public void throwsExceptionIfObjectDoesNotExistInTheDatabase() throws ObjectAlreadyExistException, ObjectDoesNotExistException {
        RedGigantStar redGigantStar = new RedGigantStar(0);
        RedGigantStar otherRedGigantStar = new RedGigantStar(1);
        this.redGigantStarService.create(redGigantStar);
        assertThrows(ObjectDoesNotExistException.class, () -> {
            this.redGigantStarService.update(otherRedGigantStar);
        });
    }

    @org.junit.jupiter.api.Test
    public void deletesRedGigantStarFromTheDatabase() throws ObjectAlreadyExistException {
        RedGigantStar redGigantStar = new RedGigantStar(0);
        this.redGigantStarService.create(redGigantStar);
        this.redGigantStarService.delete(redGigantStar);
        ArrayList emptyList = new ArrayList();
        assertEquals(this.redGigantStarService.readAll(), emptyList);
    }
}
