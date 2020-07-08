/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.crud.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yosef Febrianes
 */
@Entity
@Table(name = "public_holiday")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PublicHoliday.findAll", query = "SELECT p FROM PublicHoliday p")
    , @NamedQuery(name = "PublicHoliday.findById", query = "SELECT p FROM PublicHoliday p WHERE p.id = :id")
    , @NamedQuery(name = "PublicHoliday.findByName", query = "SELECT p FROM PublicHoliday p WHERE p.name = :name")
    , @NamedQuery(name = "PublicHoliday.findByHolidayDate", query = "SELECT p FROM PublicHoliday p WHERE p.holidayDate = :holidayDate")})
public class PublicHoliday implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "holiday_date")
    @Temporal(TemporalType.DATE)
    private Date holidayDate;

    public PublicHoliday() {
    }

    public PublicHoliday(String id) {
        this.id = id;
    }

    public PublicHoliday(String id, String name, Date holidayDate) {
        this.id = id;
        this.name = name;
        this.holidayDate = holidayDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHolidayDate() {
        return holidayDate;
    }

    public void setHolidayDate(Date holidayDate) {
        this.holidayDate = holidayDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PublicHoliday)) {
            return false;
        }
        PublicHoliday other = (PublicHoliday) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kp.crud.entities.PublicHoliday[ id=" + id + " ]";
    }
    
}
