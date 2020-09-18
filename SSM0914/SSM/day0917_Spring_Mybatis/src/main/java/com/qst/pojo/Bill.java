package com.qst.pojo;


import java.sql.Date;

public class Bill {
  //主键
  private long id;
  //账单编号
  private String billCode;
  //商品名称
  private String productName;
  //商品描述
  private String productDesc;
  //商品单位
  private String productUnit;
  //数量
  private double productCount;
  private double totalPrice;
  private long isPayment;
  private long createdBy;
  private Date creationDate;
  private long modifyBy;
  private Date modifyDate;
  private long providerId;
  private String proName;

  @Override
  public String toString() {
    return "Bill{" +
            "id=" + id +
            ", billCode='" + billCode + '\'' +
            ", productName='" + productName + '\'' +
            ", productDesc='" + productDesc + '\'' +
            ", productUnit='" + productUnit + '\'' +
            ", productCount=" + productCount +
            ", totalPrice=" + totalPrice +
            ", isPayment=" + isPayment +
            ", createdBy=" + createdBy +
            ", creationDate=" + creationDate +
            ", modifyBy=" + modifyBy +
            ", modifyDate=" + modifyDate +
            ", providerId=" + providerId +
            ", proName='" + proName + '\'' +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getBillCode() {
    return billCode;
  }

  public void setBillCode(String billCode) {
    this.billCode = billCode;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getProductDesc() {
    return productDesc;
  }

  public void setProductDesc(String productDesc) {
    this.productDesc = productDesc;
  }

  public String getProductUnit() {
    return productUnit;
  }

  public void setProductUnit(String productUnit) {
    this.productUnit = productUnit;
  }

  public double getProductCount() {
    return productCount;
  }

  public void setProductCount(double productCount) {
    this.productCount = productCount;
  }

  public double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }

  public long getIsPayment() {
    return isPayment;
  }

  public void setIsPayment(long isPayment) {
    this.isPayment = isPayment;
  }

  public long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(long createdBy) {
    this.createdBy = createdBy;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public long getModifyBy() {
    return modifyBy;
  }

  public void setModifyBy(long modifyBy) {
    this.modifyBy = modifyBy;
  }

  public Date getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }

  public long getProviderId() {
    return providerId;
  }

  public void setProviderId(long providerId) {
    this.providerId = providerId;
  }

  public String getProName() {
    return proName;
  }

  public void setProName(String proName) {
    this.proName = proName;
  }

  public Bill() {
  }

  public Bill(long id, String billCode, String productName, String productDesc, String productUnit, double productCount, double totalPrice, long isPayment, long createdBy, Date creationDate, long modifyBy, Date modifyDate, long providerId, String proName) {
    this.id = id;
    this.billCode = billCode;
    this.productName = productName;
    this.productDesc = productDesc;
    this.productUnit = productUnit;
    this.productCount = productCount;
    this.totalPrice = totalPrice;
    this.isPayment = isPayment;
    this.createdBy = createdBy;
    this.creationDate = creationDate;
    this.modifyBy = modifyBy;
    this.modifyDate = modifyDate;
    this.providerId = providerId;
    this.proName = proName;
  }

}
