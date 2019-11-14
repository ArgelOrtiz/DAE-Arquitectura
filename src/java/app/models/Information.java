/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.models;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jessi
 */
@Entity
@Table(name = "information")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Information.findAll", query = "SELECT i FROM Information i")
    , @NamedQuery(name = "Information.findByIdInformation", query = "SELECT i FROM Information i WHERE i.idInformation = :idInformation")
    , @NamedQuery(name = "Information.findByRegisterType", query = "SELECT i FROM Information i WHERE i.registerType = :registerType")
    , @NamedQuery(name = "Information.findByIdRegister", query = "SELECT i FROM Information i WHERE i.idRegister = :idRegister")
    , @NamedQuery(name = "Information.findByCreateDate", query = "SELECT i FROM Information i WHERE i.createDate = :createDate")
    , @NamedQuery(name = "Information.findByUpdateDate", query = "SELECT i FROM Information i WHERE i.updateDate = :updateDate")})
public class Information implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_information")
    private Integer idInformation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "register_type")
    private String registerType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_register")
    private int idRegister;
    @Basic(optional = false)
    @NotNull
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @JoinColumn(name = "id_creation_user", referencedColumnName = "id_user")
    @ManyToOne(optional = false)
    private User idCreationUser;
    @JoinColumn(name = "id_updating_user", referencedColumnName = "id_user")
    @ManyToOne(optional = false)
    private User idUpdatingUser;

    public Information() {
    }

    public Information(Integer idInformation) {
        this.idInformation = idInformation;
    }

    public Information(Integer idInformation, String registerType, int idRegister, Date createDate, Date updateDate) {
        this.idInformation = idInformation;
        this.registerType = registerType;
        this.idRegister = idRegister;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public Integer getIdInformation() {
        return idInformation;
    }

    public void setIdInformation(Integer idInformation) {
        this.idInformation = idInformation;
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    public int getIdRegister() {
        return idRegister;
    }

    public void setIdRegister(int idRegister) {
        this.idRegister = idRegister;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public User getIdCreationUser() {
        return idCreationUser;
    }

    public void setIdCreationUser(User idCreationUser) {
        this.idCreationUser = idCreationUser;
    }

    public User getIdUpdatingUser() {
        return idUpdatingUser;
    }

    public void setIdUpdatingUser(User idUpdatingUser) {
        this.idUpdatingUser = idUpdatingUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInformation != null ? idInformation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Information)) {
            return false;
        }
        Information other = (Information) object;
        if ((this.idInformation == null && other.idInformation != null) || (this.idInformation != null && !this.idInformation.equals(other.idInformation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "app.models.Information[ idInformation=" + idInformation + " ]";
    }
    
}
