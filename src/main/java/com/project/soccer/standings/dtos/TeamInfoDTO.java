package com.project.soccer.standings.dtos;

import lombok.Data;

@Data
public class TeamInfoDTO {
    private int id;
    private String name;
    private String shortName;
    private String tla;
    private String crest;
}
