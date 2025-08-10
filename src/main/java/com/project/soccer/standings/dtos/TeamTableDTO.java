package com.project.soccer.standings.dtos;

import lombok.Data;

@Data
public class TeamTableDTO {
    private int position;
    private TeamInfoDTO team;
    private int playedGames;
    private String form;
    private int won;
    private int draw;
    private int lost;
    private int points;
    private int goalsFor;
    private int goalsAgainst;
    private int goalDifference;
}
