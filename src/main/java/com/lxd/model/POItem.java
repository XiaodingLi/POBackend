package com.lxd.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class POItem {
    private int id;

    private String dateStr;
    private String vendorName;
    //below are line item
    @JsonProperty
    private String modelName;
    @JsonProperty
    private Double unitPrice;
    @JsonProperty
    private Integer quantity;
    public POItem(){}
    public POItem(int id, String vendorName, String modelName, Double unitPrice, Integer quantity) {
        this.id = id;
        this.vendorName = vendorName;
        this.modelName = modelName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public POItem(String dateStr, String vendorName, String modelName, Double unitPrice, Integer quantity) {
        this.dateStr = dateStr;
        this.vendorName = vendorName;
        this.modelName = modelName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "POItem{" +
                "id=" + id +
                ", vendorName='" + vendorName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
    @JsonProperty
    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    @JsonProperty
    public int getId() {
        return id;
    }
    @JsonProperty
    public void setId(int id) {
        this.id = id;
    }
    @JsonProperty
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    @JsonProperty
    public String getVendorName() {
        return vendorName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
