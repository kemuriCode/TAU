package pl.dymek.tau.starscatalog.manager;

import pl.dymek.tau.starscatalog.domain.models.Model;
import pl.dymek.tau.starscatalog.service.exceptions.ObjectDoesNotExistException;
import pl.dymek.tau.starscatalog.service.exceptions.ObjectAlreadyExistException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DatabaseManager {
    private List<Model> collection;

    public DatabaseManager() {
        this.collection = new ArrayList<Model>();
    }

    public enum Datetime {
        CREATED_AT(true), UPDATED_AT(true), READED_AT(true);
        boolean isEnabled;

        Datetime(boolean b) {
            isEnabled = b;
        }
    }


    public void create(Model model) throws ObjectAlreadyExistException {
        if (this.collection != null && !this.collection.isEmpty()) {
            for (Model element : this.collection) {
                if (element.getId() == model.getId()) {
                    throw new ObjectAlreadyExistException();
                }
            }
        }
        this.collection.add(model);
    }

    public List<Model> readAll() {
        return this.collection;
    }

    public Model read(int id) {
        return this.collection.get(id);
    }

    public void update(Model model) throws ObjectDoesNotExistException {
        int modelId = model.getId();
        try {
            this.collection.get(modelId);
        } catch ( IndexOutOfBoundsException e ) {
            throw new ObjectDoesNotExistException();
        }
        this.collection.set(modelId, model);
    }

    public void delete(Model model) {
        this.collection.remove(model.getId());
    }
}
