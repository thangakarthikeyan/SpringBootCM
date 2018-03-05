package ml.restapi.kd.accountopen.cmrules.model;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import ml.restapi.kd.accountopen.cmrules.model.CustomEntitlement;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class BrokerageEntitlement  {
  
  @ApiModelProperty(value = "")
  private String ownerRoleIndicator = null;
  @ApiModelProperty(value = "")
  private String transactorRoleIndicator = null;
  @ApiModelProperty(value = "")
  private CustomEntitlement customEntitlement = null;

 /**
   * Get ownerRoleIndicator
   * @return ownerRoleIndicator
  **/
  public String getOwnerRoleIndicator() {
    return ownerRoleIndicator;
  }

  public void setOwnerRoleIndicator(String ownerRoleIndicator) {
    this.ownerRoleIndicator = ownerRoleIndicator;
  }

  public BrokerageEntitlement ownerRoleIndicator(String ownerRoleIndicator) {
    this.ownerRoleIndicator = ownerRoleIndicator;
    return this;
  }

 /**
   * Get transactorRoleIndicator
   * @return transactorRoleIndicator
  **/
  public String getTransactorRoleIndicator() {
    return transactorRoleIndicator;
  }

  public void setTransactorRoleIndicator(String transactorRoleIndicator) {
    this.transactorRoleIndicator = transactorRoleIndicator;
  }

  public BrokerageEntitlement transactorRoleIndicator(String transactorRoleIndicator) {
    this.transactorRoleIndicator = transactorRoleIndicator;
    return this;
  }

 /**
   * Get customEntitlement
   * @return customEntitlement
  **/
  public CustomEntitlement getCustomEntitlement() {
    return customEntitlement;
  }

  public void setCustomEntitlement(CustomEntitlement customEntitlement) {
    this.customEntitlement = customEntitlement;
  }

  public BrokerageEntitlement customEntitlement(CustomEntitlement customEntitlement) {
    this.customEntitlement = customEntitlement;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrokerageEntitlement {\n");
    
    sb.append("    ownerRoleIndicator: ").append(toIndentedString(ownerRoleIndicator)).append("\n");
    sb.append("    transactorRoleIndicator: ").append(toIndentedString(transactorRoleIndicator)).append("\n");
    sb.append("    customEntitlement: ").append(toIndentedString(customEntitlement)).append("\n");
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

