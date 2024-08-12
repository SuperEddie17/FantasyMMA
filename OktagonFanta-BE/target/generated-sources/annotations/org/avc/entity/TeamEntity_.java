package org.avc.entity;

import jakarta.persistence.metamodel.MapAttribute;
import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TeamEntity.class)
public abstract class TeamEntity_ {

	public static volatile SetAttribute<TeamEntity, FighterAssignmentEntity> activeFighters;
	public static volatile MapAttribute<TeamEntity, Long, String> fighterBonuses;
	public static volatile SingularAttribute<TeamEntity, Long> id;
	public static volatile SetAttribute<TeamEntity, FighterAssignmentEntity> benchFighters;
	public static volatile SingularAttribute<TeamEntity, UserEntity> user;

	public static final String ACTIVE_FIGHTERS = "activeFighters";
	public static final String FIGHTER_BONUSES = "fighterBonuses";
	public static final String ID = "id";
	public static final String BENCH_FIGHTERS = "benchFighters";
	public static final String USER = "user";

}

