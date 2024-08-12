package org.avc.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FighterEntity.class)
public abstract class FighterEntity_ {

	public static volatile SingularAttribute<FighterEntity, String> weightClass;
	public static volatile SingularAttribute<FighterEntity, String> surname;
	public static volatile SingularAttribute<FighterEntity, Double> price;
	public static volatile SingularAttribute<FighterEntity, String> name;
	public static volatile SingularAttribute<FighterEntity, Long> id;
	public static volatile SingularAttribute<FighterEntity, Integer> points;

	public static final String WEIGHT_CLASS = "weightClass";
	public static final String SURNAME = "surname";
	public static final String PRICE = "price";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String POINTS = "points";

}

