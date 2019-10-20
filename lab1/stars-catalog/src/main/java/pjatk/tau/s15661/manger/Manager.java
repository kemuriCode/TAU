package pjatk.tau.s15661.manger;

import java.util.List;

import pjatk.tau.s15661.domain.models.Model;
import pjatk.tau.s15661.service.AlreadyExist;
import pjatk.tau.s15661.service.NotExist;


public interface Manager {
 public void create(Model model) throws AlreadyExist;
 public void update(Model model) throws NotExist;
 public List < Model > readAll();
 public Model read(int id);
 public void delete(Model model);
}