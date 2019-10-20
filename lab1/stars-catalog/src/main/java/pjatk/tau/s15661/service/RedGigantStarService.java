package pjatk.tau.s15661.service;
import java.util.List;

import pjatk.tau.s15661.domain.models.RedGigantStar;

public interface RedGigantStarService {
    public void create(RedGigantStar model) throws AlreadyExist;
    public List<RedGigantStar> readAll();
    public RedGigantStar read(int id);
    public void update(RedGigantStar model) throws NotExist;
    public void delete(RedGigantStar model);
}