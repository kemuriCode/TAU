package pjatk.tau.s15661.service;
import java.util.List;
import java.util.stream.Collectors;

import pjatk.tau.s15661.domain.models.RedGigantStar;
import pjatk.tau.s15661.manger.DatabaseManager;

public class RedGigantStarServiceImplements implements RedGigantStarService {
    private DatabaseManager databaseManager;

    RedGigantStarServiceImplements(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    @Override
    public void create(RedGigantStar model) throws AlreadyExist {
        this.databaseManager.create(model);
    }

    @Override
    public List<RedGigantStar> readAll() {
        return this.databaseManager.readAll().stream().filter(model -> model instanceof RedGigantStar).map(model -> (RedGigantStar) model).collect(Collectors.toList());
    }

    @Override
    public RedGigantStar read(int id) {
        return (RedGigantStar) this.databaseManager.read(id);
    }

    @Override
    public void update(RedGigantStar model) throws NotExist {
        this.databaseManager.update(model);
    }

    @Override
    public void delete(RedGigantStar model) {
        this.databaseManager.delete(model);
    }
}