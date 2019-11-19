package app.models;

import app.models.Sale;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-15T12:49:45")
@StaticMetamodel(Payment.class)
public class Payment_ { 

    public static volatile SingularAttribute<Payment, Integer> idPayment;
    public static volatile SingularAttribute<Payment, String> cvv;
    public static volatile SingularAttribute<Payment, String> month;
    public static volatile SingularAttribute<Payment, String> year;
    public static volatile SingularAttribute<Payment, String> cardNumber;
    public static volatile CollectionAttribute<Payment, Sale> saleCollection;

}