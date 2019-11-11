package pl.dymek.tau.starscatalog.service;

import pl.dymek.tau.starscatalog.domain.models.RedGigantStar;
import pl.dymek.tau.starscatalog.domain.models.Model;
import pl.dymek.tau.starscatalog.service.exceptions.ObjectAlreadyExistException;
import pl.dymek.tau.starscatalog.service.exceptions.ObjectDoesNotExistException;

import java.util.List;

public interface RedGigantStarService {
    public void create(RedGigantStar model) throws ObjectAlreadyExistException;
    public List<RedGigantStar> readAll();
    public RedGigantStar read(int id);
    public void update(RedGigantStar model) throws ObjectDoesNotExistException;
    public void delete(RedGigantStar model);
}