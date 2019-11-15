package app.models;

import app.models.Information;
import app.models.Sale;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-15T05:55:09")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Integer> idUser;
    public static volatile SingularAttribute<User, String> firstName;
    public static volatile SingularAttribute<User, String> lastName;
    public static volatile SingularAttribute<User, String> password;
    public static volatile CollectionAttribute<User, Information> informationCollection;
    public static volatile CollectionAttribute<User, Information> informationCollection1;
    public static volatile SingularAttribute<User, String> nickname;
    public static volatile SingularAttribute<User, String> cellphone;
    public static volatile SingularAttribute<User, String> userType;
    public static volatile SingularAttribute<User, String> email;
    public static volatile CollectionAttribute<User, Sale> saleCollection;

}