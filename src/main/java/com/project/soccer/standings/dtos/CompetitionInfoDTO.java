package com.project.soccer.standings.dtos;

import lombok.Data;

@Data
public class CompetitionInfoDTO {
    private int id;
    private String name;
    private String code;
    private String type;
    private String emblem;
}
