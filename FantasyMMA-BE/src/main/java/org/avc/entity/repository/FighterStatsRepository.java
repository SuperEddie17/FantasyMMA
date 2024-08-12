package org.avc.entity.repository;

import org.avc.entity.FighterStatsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FighterStatsRepository extends JpaRepository<FighterStatsEntity, Long> {
}
