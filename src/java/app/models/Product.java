package app.models;

import java.io.InputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "products")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
    , @NamedQuery(name = "Product.findByIdProduct", query = "SELECT p FROM Product p WHERE p.idProduct = :idProduct")
    , @NamedQuery(name = "Product.findByName", query = "SELECT p FROM Product p WHERE p.name = :name")
    , @NamedQuery(name = "Product.findByInformation", query = "SELECT p FROM Product p WHERE p.information = :information")
    , @NamedQuery(name = "Product.findByUnitCost", query = "SELECT p FROM Product p WHERE p.unitCost = :unitCost")
    , @NamedQuery(name = "Product.findByStock", query = "SELECT p FROM Product p WHERE p.stock = :stock")
    , @NamedQuery(name = "Product.findByDepartament", query = "SELECT p FROM Product p WHERE p.departament = :departament")})
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_product")
    private Integer idProduct;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "image_path")
    private String imagePath;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "information")
    private String information;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "unit_cost")
    private BigDecimal unitCost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stock")
    private int stock;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "departament")
    private String departament;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduct")
    private Collection<SaleDetail> saleDetailCollection;

    public Product() {
    }

    public Product(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Product(Integer idProduct, String name, String imagePath, String information, BigDecimal unitCost, int stock, String departament) {
        this.idProduct = idProduct;
        this.name = name;
        this.imagePath = imagePath;
        this.information = information;
        this.unitCost = unitCost;
        this.stock = stock;
        this.departament = departament;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @XmlTransient
    public Collection<SaleDetail> getSaleDetailCollection() {
        return saleDetailCollection;
    }

    public void setSaleDetailCollection(Collection<SaleDetail> saleDetailCollection) {
        this.saleDetailCollection = saleDetailCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduct != null ? idProduct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.idProduct == null && other.idProduct != null) || (this.idProduct != null && !this.idProduct.equals(other.idProduct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "app.models.Product[ idProduct=" + idProduct + " ]";
    }
    
}
