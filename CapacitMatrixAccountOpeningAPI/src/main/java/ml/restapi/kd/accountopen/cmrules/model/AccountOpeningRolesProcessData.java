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

public class AccountOpeningRolesProcessData  {
  
  @ApiModelProperty(value = "")
  private String reqrdOptCode = null;
  @ApiModelProperty(value = "")
  private String minCapacityCount = null;
  @ApiModelProperty(value = "")
  private String maxCapacityCount = null;

 /**
   * Get reqrdOptCode
   * @return reqrdOptCode
  **/
  public String getReqrdOptCode() {
    return reqrdOptCode;
  }

  public void setReqrdOptCode(String reqrdOptCode) {
    this.reqrdOptCode = reqrdOptCode;
  }

  public AccountOpeningRolesProcessData reqrdOptCode(String reqrdOptCode) {
    this.reqrdOptCode = reqrdOptCode;
    return this;
  }

 /**
   * Get minCapacityCount
   * @return minCapacityCount
  **/
  public String getMinCapacityCount() {
    return minCapacityCount;
  }

  public void setMinCapacityCount(String minCapacityCount) {
    this.minCapacityCount = minCapacityCount;
  }

  public AccountOpeningRolesProcessData minCapacityCount(String minCapacityCount) {
    this.minCapacityCount = minCapacityCount;
    return this;
  }

 /**
   * Get maxCapacityCount
   * @return maxCapacityCount
  **/
  public String getMaxCapacityCount() {
    return maxCapacityCount;
  }

  public void setMaxCapacityCount(String maxCapacityCount) {
    this.maxCapacityCount = maxCapacityCount;
  }

  public AccountOpeningRolesProcessData maxCapacityCount(String maxCapacityCount) {
    this.maxCapacityCount = maxCapacityCount;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountOpeningRolesProcessData {\n");
    
    sb.append("    reqrdOptCode: ").append(toIndentedString(reqrdOptCode)).append("\n");
    sb.append("    minCapacityCount: ").append(toIndentedString(minCapacityCount)).append("\n");
    sb.append("    maxCapacityCount: ").append(toIndentedString(maxCapacityCount)).append("\n");
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

