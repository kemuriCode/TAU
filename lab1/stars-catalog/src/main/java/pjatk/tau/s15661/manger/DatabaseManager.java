package pjatk.tau.s15661.manger;

import pjatk.tau.s15661.domain.models.*;
import pjatk.tau.s15661.service.*;

import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
 private List < Model > collection;

 public DatabaseManager() {
  this.collection = new ArrayList < Model > ();
 }

 public void create(Model model) throws AlreadyExist {
  if (this.collection != null && !this.collection.isEmpty()) {
   for (Model element: this.collection) {
    if (element.getId() == model.getId()) {
     throw new AlreadyExist();
    }
   }
  }
  this.collection.add(model);
 }

 public List < Model > readAll() {
  return this.collection;
 }

 public Model read(int id) {
  return this.collection.get(id);
 }

 public void update(Model model) throws NotExist {
  int modelId = model.getId();
  try {
   this.collection.get(modelId);
  } catch (IndexOutOfBoundsException e) {
   throw new NotExist();
  }
  this.collection.set(modelId, model);
 }

 public void delete(Model model) {
  this.collection.remove(model.getId());
 }
}