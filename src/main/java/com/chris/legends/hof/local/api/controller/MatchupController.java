package com.chris.legends.hof.local.api.controller;

import com.chris.legends.hof.local.api.model.entity.Matchup;
import com.chris.legends.hof.local.api.repository.MatchupRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@CrossOrigin
@RestController
@RequestMapping("/matchups")
@Slf4j
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

    @GetMapping("owner/{nickname}/{season}")
    @ResponseBody
    public List<Matchup> getMatchupsByOwnerNicknameAndSeason(@PathVariable String nickname,
                                                             @PathVariable String season){
       Iterable<Matchup> allMatchups = matchupRepository.findByHomeOwner_NicknameOrAwayOwner_Nickname(nickname, nickname);
      List<Matchup> matchups = StreamSupport.stream(allMatchups.spliterator(), false)
                            .filter(matchup -> matchup.getSeason().equals(season))
                            .collect(Collectors.toList());
      log.info("matchups for [season={}], [owner={}], [size={}]", season, nickname, matchups.size());
      return matchups;
    }

}
