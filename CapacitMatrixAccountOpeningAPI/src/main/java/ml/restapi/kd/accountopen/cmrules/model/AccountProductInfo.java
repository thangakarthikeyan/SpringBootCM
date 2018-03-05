package ml.restapi.kd.accountopen.cmrules.model;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class AccountProductInfo  {
  
  @ApiModelProperty(value = "")
  private String primaryServiceTypeCode = null;
  @ApiModelProperty(value = "")
  private String accountTypeCode = null;
  @ApiModelProperty(value = "")
  private String ownershipTypeCode = null;
  @ApiModelProperty(value = "")
  private String subProductTypeCode = null;
  @ApiModelProperty(value = "")
  private String ownershipType = null;

 /**
   * Get primaryServiceTypeCode
   * @return primaryServiceTypeCode
  **/
  public String getPrimaryServiceTypeCode() {
    return primaryServiceTypeCode;
  }

  public void setPrimaryServiceTypeCode(String primaryServiceTypeCode) {
    this.primaryServiceTypeCode = primaryServiceTypeCode;
  }

  public AccountProductInfo primaryServiceTypeCode(String primaryServiceTypeCode) {
    this.primaryServiceTypeCode = primaryServiceTypeCode;
    return this;
  }

 /**
   * Get accountTypeCode
   * @return accountTypeCode
  **/
  public String getAccountTypeCode() {
    return accountTypeCode;
  }

  public void setAccountTypeCode(String accountTypeCode) {
    this.accountTypeCode = accountTypeCode;
  }

  public AccountProductInfo accountTypeCode(String accountTypeCode) {
    this.accountTypeCode = accountTypeCode;
    return this;
  }

 /**
   * Get ownershipTypeCode
   * @return ownershipTypeCode
  **/
  public String getOwnershipTypeCode() {
    return ownershipTypeCode;
  }

  public void setOwnershipTypeCode(String ownershipTypeCode) {
    this.ownershipTypeCode = ownershipTypeCode;
  }

  public AccountProductInfo ownershipTypeCode(String ownershipTypeCode) {
    this.ownershipTypeCode = ownershipTypeCode;
    return this;
  }

 /**
   * Get subProductTypeCode
   * @return subProductTypeCode
  **/
  public String getSubProductTypeCode() {
    return subProductTypeCode;
  }

  public void setSubProductTypeCode(String subProductTypeCode) {
    this.subProductTypeCode = subProductTypeCode;
  }

  public AccountProductInfo subProductTypeCode(String subProductTypeCode) {
    this.subProductTypeCode = subProductTypeCode;
    return this;
  }

 /**
   * Get ownershipType
   * @return ownershipType
  **/
  public String getOwnershipType() {
    return ownershipType;
  }

  public void setOwnershipType(String ownershipType) {
    this.ownershipType = ownershipType;
  }

  public AccountProductInfo ownershipType(String ownershipType) {
    this.ownershipType = ownershipType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountProductInfo {\n");
    
    sb.append("    primaryServiceTypeCode: ").append(toIndentedString(primaryServiceTypeCode)).append("\n");
    sb.append("    accountTypeCode: ").append(toIndentedString(accountTypeCode)).append("\n");
    sb.append("    ownershipTypeCode: ").append(toIndentedString(ownershipTypeCode)).append("\n");
    sb.append("    subProductTypeCode: ").append(toIndentedString(subProductTypeCode)).append("\n");
    sb.append("    ownershipType: ").append(toIndentedString(ownershipType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

