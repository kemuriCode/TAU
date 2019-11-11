package pl.dymek.tau.starscatalog.domain.models;

public class RedGigantStar implements Model {
    private int id;
    private String name;

    public RedGigantStar(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
