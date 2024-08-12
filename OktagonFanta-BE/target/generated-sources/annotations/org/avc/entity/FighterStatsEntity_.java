package org.avc.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FighterStatsEntity.class)
public abstract class FighterStatsEntity_ {

	public static volatile SingularAttribute<FighterStatsEntity, Integer> attendedSubmissions;
	public static volatile SingularAttribute<FighterStatsEntity, Boolean> underdog;
	public static volatile SingularAttribute<FighterStatsEntity, Integer> strikes;
	public static volatile SingularAttribute<FighterStatsEntity, Integer> significantStrikes;
	public static volatile SingularAttribute<FighterStatsEntity, Integer> takedowns;
	public static volatile SingularAttribute<FighterStatsEntity, Boolean> subWin;
	public static volatile SingularAttribute<FighterStatsEntity, Boolean> decWin;
	public static volatile SingularAttribute<FighterStatsEntity, FighterEntity> fighter;
	public static volatile SingularAttribute<FighterStatsEntity, Long> id;
	public static volatile SingularAttribute<FighterStatsEntity, EventEntity> event;
	public static volatile SingularAttribute<FighterStatsEntity, Boolean> tkoWin;
	public static volatile SingularAttribute<FighterStatsEntity, Long> points;

	public static final String ATTENDED_SUBMISSIONS = "attendedSubmissions";
	public static final String UNDERDOG = "underdog";
	public static final String STRIKES = "strikes";
	public static final String SIGNIFICANT_STRIKES = "significantStrikes";
	public static final String TAKEDOWNS = "takedowns";
	public static final String SUB_WIN = "subWin";
	public static final String DEC_WIN = "decWin";
	public static final String FIGHTER = "fighter";
	public static final String ID = "id";
	public static final String EVENT = "event";
	public static final String TKO_WIN = "tkoWin";
	public static final String POINTS = "points";

}

