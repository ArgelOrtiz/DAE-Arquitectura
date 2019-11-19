package app.models;

import app.models.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-15T12:49:45")
@StaticMetamodel(Information.class)
public class Information_ { 

    public static volatile SingularAttribute<Information, Date> updateDate;
    public static volatile SingularAttribute<Information, User> idUpdatingUser;
    public static volatile SingularAttribute<Information, Integer> idInformation;
    public static volatile SingularAttribute<Information, String> registerType;
    public static volatile SingularAttribute<Information, Integer> idRegister;
    public static volatile SingularAttribute<Information, Date> createDate;
    public static volatile SingularAttribute<Information, User> idCreationUser;

}