package com.chris.legends.hof.local.api.repository;

import com.chris.legends.hof.local.api.model.entity.Matchup;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MatchupRepository extends PagingAndSortingRepository <Matchup, Integer> {

    Iterable<Matchup> findBySeason(String season);
    Iterable<Matchup> findByHomeOwner_NicknameOrAwayOwner_Nickname(String nickname, String sameNickname);
    Iterable<Matchup> findBySeasonAndHomeOwner_NicknameOrAwayOwner_Nickname(String season, String nickname, String sameNickname);

}
