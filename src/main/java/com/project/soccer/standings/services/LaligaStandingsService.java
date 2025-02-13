package com.project.soccer.standings.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.soccer.standings.dtos.LaLigaStandingsDTO;
import com.project.soccer.standings.dtos.TeamStandingDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class LaligaStandingsService {
    @Value("${api.laliga-standings-data.url}")
    private String laligaStandingsUrl;

    @Value("${api.football-data.token}")
    private String footballDataToken;

    private final WebClient webClient;
    public LaligaStandingsService(WebClient.Builder webClient) {
        this.webClient = webClient.build();
    }

    public LaLigaStandingsDTO getLaligaStandingsService() {

        return webClient.get()
                .uri(laligaStandingsUrl)
                .header("X-Auth-Token", footballDataToken)
                .retrieve()
                .bodyToMono(LaLigaStandingsDTO.class)
                .doOnError(error -> System.out.println("Error fetching LaLiga standings: " + error.getMessage()))
                .block();
    }
}
