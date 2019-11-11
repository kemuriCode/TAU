package pl.dymek.tau.starscatalog.domain.models;

import java.util.ArrayList;
import java.util.List;

public class RedGigantStar extends BaseModel implements Model {
    private int id;
    private String name;
    private List<Integer> starsList;

    public RedGigantStar(int id) {
        this.starsList = new ArrayList<Integer>();
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

    public void addFriendToFriendList(int id) throws Exception {
        if (this.starsList.contains(id)) {
            throw new Exception("You have already this star in catalog");
        }
        this.starsList.add(id);
    }

    public List<Integer> getStarList() {
        return this.starsList;
    }
}
