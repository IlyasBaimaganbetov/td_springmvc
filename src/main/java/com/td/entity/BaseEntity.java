package com.td.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ilias
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable{

    private static final long serialVersionUID = -7988799579036225137L;
    
    //@Column//(length = 36)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id; //String
    
    @Column
    private Date sysCreateTime;
    
    public BaseEntity(){}
    
    
    
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {//String
        this.id = id;
    }

    /**
     * @return the sysCreateTime
     */
    public Date getSysCreateTime() {
        return sysCreateTime;
    }

    /**
     * @param sysCreateTime the sysCreateTime to set
     */
    public void setSysCreateTime(Date sysCreateTime) {
        this.sysCreateTime = sysCreateTime;
    }
}
