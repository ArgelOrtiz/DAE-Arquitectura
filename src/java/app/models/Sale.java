/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.models;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jessi
 */
@Entity
@Table(name = "sales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sale.findAll", query = "SELECT s FROM Sale s")
    , @NamedQuery(name = "Sale.findByIdSale", query = "SELECT s FROM Sale s WHERE s.idSale = :idSale")
    , @NamedQuery(name = "Sale.findBySubtotal", query = "SELECT s FROM Sale s WHERE s.subtotal = :subtotal")
    , @NamedQuery(name = "Sale.findByIva", query = "SELECT s FROM Sale s WHERE s.iva = :iva")
    , @NamedQuery(name = "Sale.findByTotal", query = "SELECT s FROM Sale s WHERE s.total = :total")
    , @NamedQuery(name = "Sale.findByAddress", query = "SELECT s FROM Sale s WHERE s.address = :address")
    , @NamedQuery(name = "Sale.findByPostalCode", query = "SELECT s FROM Sale s WHERE s.postalCode = :postalCode")
    , @NamedQuery(name = "Sale.findByStatus", query = "SELECT s FROM Sale s WHERE s.status = :status")})
public class Sale implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sale")
    private Integer idSale;
    @Basic(optional = false)
    @NotNull
    @Column(name = "subtotal")
    private double subtotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iva")
    private double iva;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private double total;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "address")
    private String address;
    @Size(max = 5)
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "status")
    private Short status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSale")
    private Collection<SaleDetail> saleDetailCollection;
    @JoinColumn(name = "id_payment", referencedColumnName = "id_payment")
    @ManyToOne(optional = false)
    private Payment idPayment;
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    @ManyToOne(optional = false)
    private User idUser;

    public Sale() {
    }

    public Sale(Integer idSale) {
        this.idSale = idSale;
    }

    public Sale(Integer idSale, double subtotal, double iva, double total, String address) {
        this.idSale = idSale;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.address = address;
    }

    public Integer getIdSale() {
        return idSale;
    }

    public void setIdSale(Integer idSale) {
        this.idSale = idSale;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @XmlTransient
    public Collection<SaleDetail> getSaleDetailCollection() {
        return saleDetailCollection;
    }

    public void setSaleDetailCollection(Collection<SaleDetail> saleDetailCollection) {
        this.saleDetailCollection = saleDetailCollection;
    }

    public Payment getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(Payment idPayment) {
        this.idPayment = idPayment;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSale != null ? idSale.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sale)) {
            return false;
        }
        Sale other = (Sale) object;
        if ((this.idSale == null && other.idSale != null) || (this.idSale != null && !this.idSale.equals(other.idSale))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "app.models.Sale[ idSale=" + idSale + " ]";
    }
    
}
