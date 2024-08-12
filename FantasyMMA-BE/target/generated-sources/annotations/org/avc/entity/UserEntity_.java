package org.avc.entity;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserEntity.class)
public abstract class UserEntity_ {

	public static volatile ListAttribute<UserEntity, TeamEntity> teams;
	public static volatile SingularAttribute<UserEntity, String> nickname;
	public static volatile SingularAttribute<UserEntity, Long> id;
	public static volatile SingularAttribute<UserEntity, String> email;
	public static volatile SingularAttribute<UserEntity, Double> budget;

	public static final String TEAMS = "teams";
	public static final String NICKNAME = "nickname";
	public static final String ID = "id";
	public static final String EMAIL = "email";
	public static final String BUDGET = "budget";

}

