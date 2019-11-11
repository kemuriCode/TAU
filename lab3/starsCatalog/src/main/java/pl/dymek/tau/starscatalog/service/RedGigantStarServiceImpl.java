package pl.dymek.tau.starscatalog.service;

import pl.dymek.tau.starscatalog.domain.models.RedGigantStar;
import pl.dymek.tau.starscatalog.manager.DatabaseManager;
import pl.dymek.tau.starscatalog.service.exceptions.ObjectAlreadyExistException;
import pl.dymek.tau.starscatalog.service.exceptions.ObjectDoesNotExistException;

import java.util.List;
import java.util.stream.Collectors;

public class RedGigantStarServiceImpl implements RedGigantStarService {
    private DatabaseManager databaseManager;

    public RedGigantStarServiceImpl(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    @Override
    public void create(RedGigantStar model) throws ObjectAlreadyExistException {
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
    public void update(RedGigantStar model) throws ObjectDoesNotExistException {
        this.databaseManager.update(model);
    }

    @Override
    public void delete(RedGigantStar model) {
        this.databaseManager.delete(model);
    }
}
