package com.gamification.rest.repository;

import org.springframework.data.repository.CrudRepository;
import com.gamification.rest.domin.BadgeCard;
import java.util.List;

public interface BadgeCardRepository extends CrudRepository<BadgeCard, Long> {

	List<BadgeCard>  findByUserIdOrderByBadgeTimeStampDesc(final Long userID);
}
