package app.models;

import app.models.Product;
import app.models.Sale;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-15T05:55:09")
@StaticMetamodel(SaleDetail.class)
public class SaleDetail_ { 

    public static volatile SingularAttribute<SaleDetail, Integer> quantity;
    public static volatile SingularAttribute<SaleDetail, Integer> idDetail;
    public static volatile SingularAttribute<SaleDetail, Sale> idSale;
    public static volatile SingularAttribute<SaleDetail, Product> idProduct;
    public static volatile SingularAttribute<SaleDetail, Double> productTotal;

}