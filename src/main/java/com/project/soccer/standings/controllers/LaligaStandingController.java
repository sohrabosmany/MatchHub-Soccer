package com.project.soccer.standings.controllers;

import com.project.soccer.standings.dtos.LaLigaStandingsDTO;
import com.project.soccer.standings.dtos.TeamStandingDTO;
import com.project.soccer.standings.dtos.TeamTableDTO;
import com.project.soccer.standings.services.LaligaStandingsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;


@RestController
@RequestMapping("/standings")
public class LaligaStandingController {

    private final LaligaStandingsService laligaStandingsService;

    public LaligaStandingController(LaligaStandingsService laligaStandingsService) {
        this.laligaStandingsService = laligaStandingsService;
    }

    @GetMapping("/laliga")
    public Map<String, Integer> getLaligaStandingsController() {
        LaLigaStandingsDTO laLigaStandingsDTO = laligaStandingsService.getLaligaStandingsService();

        Map<String, Integer> leaguePoints = new HashMap<>();

        if (laLigaStandingsDTO.getTeamStanding() != null) {
            List<TeamStandingDTO> teamStandingDTOS = laLigaStandingsDTO.getTeamStanding();

            if (!teamStandingDTOS.isEmpty()) {
                List<TeamTableDTO> teamTableDTOS = teamStandingDTOS.get(0).getTable();
                for (TeamTableDTO teamTableDTO : teamTableDTOS) {
                    String key = teamTableDTO.getPosition() +", "+ teamTableDTO.getTeam().getName()
                            +", Games Played: "+ teamTableDTO.getPlayedGames() + ", Points: ";
                    leaguePoints.put(key, teamTableDTO.getPoints());
                }
            }
        }

        return leaguePoints.entrySet()
                .stream()
                .sorted((i2, i1)
                        -> i1.getValue().compareTo(
                                i2.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue
                , (e1, e2) -> e1, LinkedHashMap::new));
    }
}
