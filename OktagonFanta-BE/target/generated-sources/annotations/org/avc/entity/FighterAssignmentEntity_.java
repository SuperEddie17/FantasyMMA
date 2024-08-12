package org.avc.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FighterAssignmentEntity.class)
public abstract class FighterAssignmentEntity_ {

	public static volatile SingularAttribute<FighterAssignmentEntity, FighterEntity> fighter;
	public static volatile SingularAttribute<FighterAssignmentEntity, Long> id;
	public static volatile SingularAttribute<FighterAssignmentEntity, TeamEntity> team;
	public static volatile SingularAttribute<FighterAssignmentEntity, Boolean> isActive;

	public static final String FIGHTER = "fighter";
	public static final String ID = "id";
	public static final String TEAM = "team";
	public static final String IS_ACTIVE = "isActive";

}

