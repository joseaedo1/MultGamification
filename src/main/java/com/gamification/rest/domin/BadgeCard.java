package com.gamification.rest.domin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * 
 * @author FELIPE
 * This class links a Badge to a user.
 */
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Entity
public final class BadgeCard {
	
	@Id
	@GeneratedValue
	@Column(name = "BADGE_ID")
	private final Long badgeId;
	
	private final Long userId;
	private final Long badgeTimestamp;
	private final Badge badge;
	
	// Empty constructor for JSON/JPA
	public BadgeCard() {
		this(null, null, null, null);
	}
	
	
	public BadgeCard(final Long userId, final Badge badge) {
		this(null, userId, System.currentTimeMillis(), badge);
	}

}

