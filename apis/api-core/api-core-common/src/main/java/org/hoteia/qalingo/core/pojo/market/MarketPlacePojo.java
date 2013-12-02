package org.hoteia.qalingo.core.pojo.market;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class MarketPlacePojo {

    private Long id;
    private int version;
    private String code;
    private String name;
    private String description;
    private boolean isDefault = false;
    private String theme;
    
    private Set<MarketPojo> markets = new HashSet<MarketPojo>();

    private Date dateCreate;
    private Date dateUpdate;

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Set<MarketPojo> getMarkets() {
        return markets;
    }
    
    public void setMarkets(Set<MarketPojo> markets) {
        this.markets = markets;
    }
    
    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }
    
}