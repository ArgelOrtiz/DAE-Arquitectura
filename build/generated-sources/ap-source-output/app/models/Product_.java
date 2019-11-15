package app.models;

import app.models.SaleDetail;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-15T02:25:52")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile CollectionAttribute<Product, SaleDetail> saleDetailCollection;
    public static volatile SingularAttribute<Product, String> imagePath;
    public static volatile SingularAttribute<Product, BigDecimal> unitCost;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, Integer> idProduct;
    public static volatile SingularAttribute<Product, String> information;
    public static volatile SingularAttribute<Product, Integer> stock;
    public static volatile SingularAttribute<Product, String> departament;

}