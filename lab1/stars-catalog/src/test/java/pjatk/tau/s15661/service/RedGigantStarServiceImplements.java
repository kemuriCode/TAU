package pjatk.tau.s15661.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import pjatk.tau.s15661.domain.models.RedGigantStar;
import pjatk.tau.s15661.manger.DatabaseManager;
import pjatk.tau.s15661.service.AlreadyExist;
import pjatk.tau.s15661.service.NotExist;

public class RedGigantStarServiceImplements {
    private RedGigantStarServiceImplements redGigantStarService;

	@BeforeEach
    public void before() {
        DatabaseManager databaseManager = new DatabaseManager();
        this.redGigantStarService = new RedGigantStarServiceImplements(databaseManager);
    }

    @AfterEach
    public void after() {
        this.redGigantStarService = null;
    }

    @org.junit.jupiter.api.Test
    public void throwsWhenAlreadyExist() throws AlreadyExist {
        RedGigantStar redGigantStar = new RedGigantStar(1);
        this.redGigantStarService.create(redGigantStar);
        assertThrows(AlreadyExist.class, () -> {
            this.redGigantStarService.create(redGigantStar);
        });
    }

    @org.junit.jupiter.api.Test
    public void createRedGigantStar() throws AlreadyExist {
        int objectId = 1;
        RedGigantStar redGigantStar = new RedGigantStar(objectId);
        this.redGigantStarService.create(redGigantStar);
        assertEquals(this.redGigantStarService.read(0), redGigantStar);
    }

    @org.junit.jupiter.api.Test
    public void readsAllRedGigantStars() throws AlreadyExist {
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
    public void readRedGigantStar() throws AlreadyExist {
        RedGigantStar redGigantStar = new RedGigantStar(0);
        this.redGigantStarService.create(redGigantStar);
        assertEquals(this.redGigantStarService.read(redGigantStar.getId()), redGigantStar);
    }


 @org.junit.jupiter.api.Test
    public void updatesRedGigantStar() throws AlreadyExist, NotExist {
        RedGigantStar redGigantStar = new RedGigantStar(0);
        this.redGigantStarService.create(redGigantStar);
        redGigantStar.setName("test");
        this.redGigantStarService.update(redGigantStar);
        assertEquals(this.redGigantStarService.read(redGigantStar.getId()), redGigantStar);
    }

    @org.junit.jupiter.api.Test
    public void throwsNotExist() throws AlreadyExist, NotExist {
        RedGigantStar redGigantStar = new RedGigantStar(0);
        RedGigantStar otherRedGigantStar = new RedGigantStar(1);
        this.redGigantStarService.create(redGigantStar);
        assertThrows(NotExist.class, () -> {
            this.redGigantStar.update(otherRedGigantStar);
        });
    }

    @org.junit.jupiter.api.Test
    public void deletesRedGigantStar() throws AlreadyExist {
        RedGigantStar redGigantStar = new RedGigantStar(0);
        this.redGigantStarService.create(redGigantStar);
        this.redGigantStarService.delete(redGigantStar);
        ArrayList emptyList = new ArrayList();
        assertEquals(this.redGigantStarService.readAll(), emptyList);
    }
}