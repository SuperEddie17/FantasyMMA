package org.avc.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TransferEntity.class)
public abstract class TransferEntity_ {

	public static volatile SingularAttribute<TransferEntity, Boolean> isBuy;
	public static volatile SingularAttribute<TransferEntity, LocalDateTime> date;
	public static volatile SingularAttribute<TransferEntity, Double> price;
	public static volatile SingularAttribute<TransferEntity, FighterEntity> fighter;
	public static volatile SingularAttribute<TransferEntity, Long> id;
	public static volatile SingularAttribute<TransferEntity, UserEntity> user;

	public static final String IS_BUY = "isBuy";
	public static final String DATE = "date";
	public static final String PRICE = "price";
	public static final String FIGHTER = "fighter";
	public static final String ID = "id";
	public static final String USER = "user";

}

