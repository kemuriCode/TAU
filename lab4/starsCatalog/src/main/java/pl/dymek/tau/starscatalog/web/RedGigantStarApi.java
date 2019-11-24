package pl.dymek.tau.starscatalog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.dymek.tau.starscatalog.domain.models.RedGigantStar;
import pl.dymek.tau.starscatalog.service.RedGigantStarService;
import pl.dymek.tau.starscatalog.service.exceptions.ObjectAlreadyExistException;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

@RestController
public class RedGigantStarApi {
    @Autowired
    RedGigantStarService redGigantStarService;

    @RequestMapping(value = "/redGigantStar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public RedGigantStar getRedGigantStar(@PathVariable("id") int id) throws SQLException {
        return this.redGigantStarService.read(id);
    }

    @RequestMapping(value = "/redGigantStars", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<RedGigantStar> getRedGigantStars(@RequestParam(value = "filter", required = false) String f) throws SQLException {
        List<RedGigantStar> redGigantStars = new LinkedList<RedGigantStar>();
        for (RedGigantStar c : this.redGigantStarService.readAll()) {
            if (f == null) {
                redGigantStars.add(c);
            } else if (c.getName().contains(f)) {
                redGigantStars.add(c);
            }
        }
        return redGigantStars;
    }

    @RequestMapping(value = "/redGigantStar",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public RedGigantStar addRedGigantStar(@RequestBody RedGigantStar c) throws ObjectAlreadyExistException {
        try {
            this.redGigantStarService.create((c));
            return c;
        } catch (ObjectAlreadyExistException e) {
            return null;
        }
    }

    @RequestMapping(value = "/redGigantStar/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public int deleteRedGigantStar(@PathVariable("id") int id) throws SQLException {
        this.redGigantStarService.delete(this.redGigantStarService.read(id));
        return id;
    }
}
