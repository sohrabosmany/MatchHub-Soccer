package com.project.soccer.standings.dtos;

import lombok.Data;

@Data
public class LeagueSeasonDTO {
    private int id;
    private String startDate;
    private String endDate;
    private int currentMatchday;
    private String winner;
}
