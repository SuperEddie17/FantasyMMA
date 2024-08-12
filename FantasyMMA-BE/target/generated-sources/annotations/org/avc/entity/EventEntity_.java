package org.avc.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EventEntity.class)
public abstract class EventEntity_ {

	public static volatile SingularAttribute<EventEntity, LocalDate> date;
	public static volatile SingularAttribute<EventEntity, String> name;
	public static volatile SingularAttribute<EventEntity, Long> id;

	public static final String DATE = "date";
	public static final String NAME = "name";
	public static final String ID = "id";

}

