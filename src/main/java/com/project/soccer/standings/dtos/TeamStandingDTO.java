package com.project.soccer.standings.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TeamStandingDTO {
    private String stage;
    private String type;
    private String group;
    @JsonProperty("table")
    private List<TeamTableDTO> table;

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<TeamTableDTO> getTable() {
        return table;
    }

    public void setTable(List<TeamTableDTO> table) {
        this.table = table;
    }
}
