package pl.dymek.tau.starscatalog.pl.dymek.tau.starscatalog.bdd.impl.PlanetList;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pl.dymek.tau.starscatalog.domain.models.RedGigantStar;
import pl.dymek.tau.starscatalog.manager.DatabaseManager;
import pl.dymek.tau.starscatalog.repository.RedGigantStarRepository;
import pl.dymek.tau.starscatalog.service.RedGigantStarService;
import pl.dymek.tau.starscatalog.service.RedGigantStarServiceImpl;
import pl.dymek.tau.starscatalog.service.exceptions.ObjectAlreadyExistException;

import static org.junit.Assert.*;

public class AddPlanetToAStarTest {
    private RedGigantStar redGigantStar;
    private RedGigantStar planetRedGigantStar;
    private RedGigantStarRepository redGigantStarRepository;
    private RedGigantStarService redGigantStarService;
    private DatabaseManager databaseManager;
    private RedGigantStar searchedPlanet;

    @Given("^I am as a redGigantStar$")
    public void iAmAsARedGigantStar() throws ObjectAlreadyExistException {
        this.redGigantStar = new RedGigantStar(0);
        this.planetRedGigantStar = new RedGigantStar(1);
        this.redGigantStar.setName("unique");
        this.planetRedGigantStar.setName("test");
        this.databaseManager = new DatabaseManager();
        this.redGigantStarService = new RedGigantStarServiceImpl(this.databaseManager);
        this.redGigantStarRepository = new RedGigantStarRepository(this.redGigantStarService);
        this.redGigantStarService.create(this.redGigantStar);
        this.redGigantStarService.create(this.planetRedGigantStar);
    }

    @And("^I don't have a planet on a planets list$")
    public void iDonTHaveAPlanetOnAPlanetsList() {
        assertFalse(this.redGigantStar.getPlanetList().contains(this.planetRedGigantStar.getId()));
    }

    @When("^I search for a \"([^\"]*)\" on add planets list search box$")
    public void iSearchForAOnAddPlanetsListSearchBox(String name) {
        this.searchedPlanet = this.redGigantStarRepository.getRedGigantStarsByNameRegex(name).get(0);
    }

    @Then("^I should have a new palent on a planets list$")
    public void iShouldHaveAOnAPlanetsList() {
        assertTrue(this.redGigantStar.getPlanetList().contains(this.planetRedGigantStar.getId()));
    }

    @And("^I add planet as a plant$")
    public void iAddRedGigantStarAsAPlanet() throws Exception {
        this.redGigantStar.addPlanetToPlanetList(this.searchedPlanet.getId());
    }

    @And("^I have a planet on a planets list$")
    public void iHaveAPlanetOnAPlanetList() throws Exception {
        this.redGigantStar.addPlanetToPlanetList(this.planetRedGigantStar.getId());
    }

    @Then("^I should got an error when add existing planet as a planet$")
    public void iShouldGotAnErrorWhenAddExistingPlanetAsAPlanet() throws Exception {
        assertThrows(Exception.class, () -> {
            this.redGigantStar.addPlanetToPlanetList(this.planetRedGigantStar.getId());
        });
    }
}
