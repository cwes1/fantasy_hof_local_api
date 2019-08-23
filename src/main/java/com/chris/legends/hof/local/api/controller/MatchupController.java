package com.chris.legends.hof.local.api.controller;

import com.chris.legends.hof.local.api.model.entity.Matchup;
import com.chris.legends.hof.local.api.repository.MatchupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/matchups")
public class MatchupController {

   private MatchupRepository matchupRepository;

   @Autowired
   public MatchupController(MatchupRepository matchupRepository){
       this.matchupRepository = matchupRepository;
   }

    @GetMapping("/seasons/{season}")
    @ResponseBody
    public Iterable<Matchup> getMatchupsBySeason(@PathVariable String season){
        return matchupRepository.findBySeason(season);
    }

    @GetMapping("/owner/{nickname}")
    @ResponseBody
    public Iterable<Matchup> getMatchupsByOwnerNickname(@PathVariable String nickname){
       return matchupRepository.findByHomeOwner_NicknameOrAwayOwner_Nickname(nickname, nickname);
    }

}
