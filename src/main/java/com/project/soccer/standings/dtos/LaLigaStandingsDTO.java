package com.project.soccer.standings.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

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

    public FiltersDTO getFilters() {
        return filters;
    }

    public void setFilters(FiltersDTO filters) {
        this.filters = filters;
    }

    public CountryInfoDTO getCountryInfo() {
        return countryInfo;
    }

    public void setCountryInfo(CountryInfoDTO countryInfo) {
        this.countryInfo = countryInfo;
    }

    public CompetitionInfoDTO getCompetitionInfo() {
        return competitionInfo;
    }

    public void setCompetitionInfo(CompetitionInfoDTO competitionInfo) {
        this.competitionInfo = competitionInfo;
    }

    public LeagueSeasonDTO getLeagueSeason() {
        return leagueSeason;
    }

    public void setLeagueSeason(LeagueSeasonDTO leagueSeason) {
        this.leagueSeason = leagueSeason;
    }

    public List<TeamStandingDTO> getTeamStanding() {
        return teamStanding;
    }

    public void setTeamStanding(List<TeamStandingDTO> teamStanding) {
        this.teamStanding = teamStanding;
    }
}
