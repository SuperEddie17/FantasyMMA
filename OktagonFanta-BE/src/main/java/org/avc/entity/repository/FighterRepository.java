package org.avc.entity.repository;

import org.avc.entity.FighterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FighterRepository extends JpaRepository<FighterEntity, Long> {
}
