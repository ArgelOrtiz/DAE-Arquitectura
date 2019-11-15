package app.models;

import app.models.Payment;
import app.models.SaleDetail;
import app.models.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-15T05:55:09")
@StaticMetamodel(Sale.class)
public class Sale_ { 

    public static volatile CollectionAttribute<Sale, SaleDetail> saleDetailCollection;
    public static volatile SingularAttribute<Sale, Payment> idPayment;
    public static volatile SingularAttribute<Sale, User> idUser;
    public static volatile SingularAttribute<Sale, Double> total;
    public static volatile SingularAttribute<Sale, String> address;
    public static volatile SingularAttribute<Sale, Double> iva;
    public static volatile SingularAttribute<Sale, Double> subtotal;
    public static volatile SingularAttribute<Sale, Integer> idSale;
    public static volatile SingularAttribute<Sale, String> postalCode;
    public static volatile SingularAttribute<Sale, Short> status;

}