/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jessi
 */
@Entity
@Table(name = "sales_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SaleDetail.findAll", query = "SELECT s FROM SaleDetail s")
    , @NamedQuery(name = "SaleDetail.findByIdDetail", query = "SELECT s FROM SaleDetail s WHERE s.idDetail = :idDetail")
    , @NamedQuery(name = "SaleDetail.findByQuantity", query = "SELECT s FROM SaleDetail s WHERE s.quantity = :quantity")
    , @NamedQuery(name = "SaleDetail.findByProductTotal", query = "SELECT s FROM SaleDetail s WHERE s.productTotal = :productTotal")})
public class SaleDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detail")
    private Integer idDetail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_total")
    private double productTotal;
    @JoinColumn(name = "id_product", referencedColumnName = "id_product")
    @ManyToOne(optional = false)
    private Product idProduct;
    @JoinColumn(name = "id_sale", referencedColumnName = "id_sale")
    @ManyToOne(optional = false)
    private Sale idSale;

    public SaleDetail() {
    }

    public SaleDetail(Integer idDetail) {
        this.idDetail = idDetail;
    }

    public SaleDetail(Integer idDetail, int quantity, double productTotal) {
        this.idDetail = idDetail;
        this.quantity = quantity;
        this.productTotal = productTotal;
    }

    public Integer getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(Integer idDetail) {
        this.idDetail = idDetail;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getProductTotal() {
        return productTotal;
    }

    public void setProductTotal(double productTotal) {
        this.productTotal = productTotal;
    }

    public Product getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Product idProduct) {
        this.idProduct = idProduct;
    }

    public Sale getIdSale() {
        return idSale;
    }

    public void setIdSale(Sale idSale) {
        this.idSale = idSale;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetail != null ? idDetail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SaleDetail)) {
            return false;
        }
        SaleDetail other = (SaleDetail) object;
        if ((this.idDetail == null && other.idDetail != null) || (this.idDetail != null && !this.idDetail.equals(other.idDetail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "app.models.SaleDetail[ idDetail=" + idDetail + " ]";
    }
    
}
