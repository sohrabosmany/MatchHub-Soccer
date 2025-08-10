package com.project.soccer.standings.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class TeamStandingDTO {
    private String stage;
    private String type;
    private String group;

    @JsonProperty("table")
    private List<TeamTableDTO> table;
}
