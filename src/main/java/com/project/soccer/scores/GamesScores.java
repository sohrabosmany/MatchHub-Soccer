package com.project.soccer.scores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/score")
public class GamesScores {

    //    String URL = "https://catfact.ninja/fact?max_length=200";
    //    http://api.football-data.org/v4/competitions/PD/standings
    //    WebClient.Builder webClientBuilder = WebClient.builder();
    //
    //    CatTest cat = webClientBuilder.build()
    //            .get()
    //            .uri(URL)
    //            .retrieve()
    //            .bodyToMono(CatTest.class)
    //            .block();

    //        System.out.println("This is Cat Fact");
    //        System.out.println(cat.fact);
    //
    //        System.out.println("This is Cat Length");
    //        System.out.println(cat.length);

    @GetMapping("/game/{gameId}")
    public String getGame(@PathVariable(name = "gameId") String gameId) {
        return "9 - 0 Real Madrid";
        //        return cat.getFact();
    }

    @GetMapping("/player/{playerId}")
    public String getPlayer(@PathVariable(name = "playerId") String playerId) {
        return "The player id is: " + playerId;
        //        return cat.getLength();
    }
}
