package com.project.soccer.standings.services;

import com.project.soccer.standings.dtos.LaLigaStandingsDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class LaligaStandingsService {
    @Value("${api.football-data.token}")
    private String footballDataToken;

    private final WebClient webClient;
    private static final String BASE_URL =
            "http://api.football-data.org/v4/competitions/PD/standings";

    public LaligaStandingsService(WebClient.Builder webClient) {
        this.webClient = webClient.build();
    }

    public LaLigaStandingsDTO getLaligaStandingsService() {
        return getLaligaStandingsService(null);
    }

    public LaLigaStandingsDTO getLaligaStandingsService(String season) {
        String url = BASE_URL;
        if (season != null && !season.isEmpty()) {
            url += "?season=" + season;
        }

        return webClient
                .get()
                .uri(url)
                .header("X-Auth-Token", footballDataToken)
                .retrieve()
                .bodyToMono(LaLigaStandingsDTO.class)
                .doOnError(
                        error ->
                                System.out.println(
                                        "Error fetching LaLiga standings for season "
                                                + season
                                                + ": "
                                                + error.getMessage()))
                .block();
    }
}
