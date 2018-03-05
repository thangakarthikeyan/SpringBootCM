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

public class AccountOpeningProcessData  {
  
  @ApiModelProperty(value = "")
  private String discreteProductTypeCode = null;

 /**
   * Get discreteProductTypeCode
   * @return discreteProductTypeCode
  **/
  public String getDiscreteProductTypeCode() {
    return discreteProductTypeCode;
  }

  public void setDiscreteProductTypeCode(String discreteProductTypeCode) {
    this.discreteProductTypeCode = discreteProductTypeCode;
  }

  public AccountOpeningProcessData discreteProductTypeCode(String discreteProductTypeCode) {
    this.discreteProductTypeCode = discreteProductTypeCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountOpeningProcessData {\n");
    
    sb.append("    discreteProductTypeCode: ").append(toIndentedString(discreteProductTypeCode)).append("\n");
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

