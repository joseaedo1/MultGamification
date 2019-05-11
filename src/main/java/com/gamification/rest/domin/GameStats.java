package com.gamification.rest.domin;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode

public final class GameStats {

	private final Long userID;
	private final int score;
	private final List<Badge> badge;
	
	//Empty constructor for JSON / JPA
	public GameStats () {
		this.userID =0L;
		this.score =0;
		this.badge = new ArrayList<>();
			
	}
	
	public static GameStats emptyStats (final Long userID) {
		return new GameStats(userID, 0, Collections.emptyList());
	}
	
	public List<Badge> getBadges(){
		return Collections.unmodifiableList(badge);
	}
}

