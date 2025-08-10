package com.project.soccer.standings.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class LaLigaStandingsDTO {
    @JsonProperty("filters")
    private FiltersDTO filters;

    @JsonProperty("area")
    private CountryInfoDTO countryInfo;

    @JsonProperty("competition")
    private CompetitionInfoDTO competitionInfo;

    @JsonProperty("season")
    private LeagueSeasonDTO leagueSeason;

    @JsonProperty("standings")
    private List<TeamStandingDTO> teamStanding;
}
