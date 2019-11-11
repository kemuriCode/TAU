package pl.dymek.tau.starscatalog.repository;

import pl.dymek.tau.starscatalog.domain.models.RedGigantStar;
import pl.dymek.tau.starscatalog.service.RedGigantStarService;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RedGigantStarRepository {
    private RedGigantStarService redGigantStarService;

    public RedGigantStarRepository(RedGigantStarService redGigantStarService) {
        this.redGigantStarService = redGigantStarService;
    }

    public List<RedGigantStar> getRedGigantStarsByNameRegex(String name) {
        Pattern pattern = Pattern.compile(".*" + name + ".*");
        List<RedGigantStar> redGigantStars;
        redGigantStars = this.redGigantStarService.readAll();
        return redGigantStars.stream().filter(redGigantStar -> pattern.matcher(redGigantStar.getName()).matches()).collect(Collectors.toList());
    }
}
