package pl.dymek.tau.starscatalog.manager;

import pl.dymek.tau.starscatalog.domain.models.Model;
import pl.dymek.tau.starscatalog.service.exceptions.ObjectAlreadyExistException;
import pl.dymek.tau.starscatalog.service.exceptions.ObjectDoesNotExistException;

import java.sql.Connection;
import java.util.List;

public interface Manager {
    public void create(Model model) throws ObjectAlreadyExistException;
    public List<Model> readAll();
    public Model read(int id);
    public void update(Model model) throws ObjectDoesNotExistException;
    public void delete(Model model);
}
