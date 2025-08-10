package com.project.soccer.standings.controllers;

import com.project.soccer.standings.dtos.LaLigaStandingsDTO;
import com.project.soccer.standings.dtos.TeamStandingDTO;
import com.project.soccer.standings.dtos.TeamTableDTO;
import com.project.soccer.standings.services.LaligaStandingsService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/standings")
@CrossOrigin(origins = "http://localhost:3000")
public class LaligaStandingController {

    private final LaligaStandingsService laligaStandingsService;

    public LaligaStandingController(LaligaStandingsService laligaStandingsService) {
        this.laligaStandingsService = laligaStandingsService;
    }

    @GetMapping("/laliga")
    public List<TeamTableDTO> getLaligaStandingsController(
            @RequestParam(value = "season", required = false) String season) {
        LaLigaStandingsDTO laLigaStandingsDTO =
                laligaStandingsService.getLaligaStandingsService(season);

        if (laLigaStandingsDTO.getTeamStanding() != null) {
            List<TeamStandingDTO> teamStandingDTOS = laLigaStandingsDTO.getTeamStanding();

            if (!teamStandingDTOS.isEmpty()) {
                List<TeamTableDTO> teamTableDTOS = teamStandingDTOS.get(0).getTable();
                return teamTableDTOS.stream()
                        .sorted((t1, t2) -> Integer.compare(t1.getPosition(), t2.getPosition()))
                        .collect(Collectors.toList());
            }
        }

        return List.of();
    }
}
