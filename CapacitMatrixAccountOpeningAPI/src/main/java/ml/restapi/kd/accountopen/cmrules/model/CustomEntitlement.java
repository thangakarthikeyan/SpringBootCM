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

public class CustomEntitlement  {
  
  @ApiModelProperty(value = "")
  private String entitlementCode = null;
  @ApiModelProperty(value = "")
  private String entitlementInd = null;

 /**
   * Get entitlementCode
   * @return entitlementCode
  **/
  public String getEntitlementCode() {
    return entitlementCode;
  }

  public void setEntitlementCode(String entitlementCode) {
    this.entitlementCode = entitlementCode;
  }

  public CustomEntitlement entitlementCode(String entitlementCode) {
    this.entitlementCode = entitlementCode;
    return this;
  }

 /**
   * Get entitlementInd
   * @return entitlementInd
  **/
  public String getEntitlementInd() {
    return entitlementInd;
  }

  public void setEntitlementInd(String entitlementInd) {
    this.entitlementInd = entitlementInd;
  }

  public CustomEntitlement entitlementInd(String entitlementInd) {
    this.entitlementInd = entitlementInd;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEntitlement {\n");
    
    sb.append("    entitlementCode: ").append(toIndentedString(entitlementCode)).append("\n");
    sb.append("    entitlementInd: ").append(toIndentedString(entitlementInd)).append("\n");
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

