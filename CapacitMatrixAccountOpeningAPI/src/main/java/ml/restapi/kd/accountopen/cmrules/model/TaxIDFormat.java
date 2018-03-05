package ml.restapi.kd.accountopen.cmrules.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import ml.restapi.kd.accountopen.cmrules.model.TaxIdType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class TaxIDFormat  {
  
  @ApiModelProperty(value = "")
  private List<TaxIdType> taxIdType = new ArrayList<TaxIdType>();

 /**
   * Get taxIdType
   * @return taxIdType
  **/
  public List<TaxIdType> getTaxIdType() {
    return taxIdType;
  }

  public void setTaxIdType(List<TaxIdType> taxIdType) {
    this.taxIdType = taxIdType;
  }

  public TaxIDFormat taxIdType(List<TaxIdType> taxIdType) {
    this.taxIdType = taxIdType;
    return this;
  }

  public TaxIDFormat addTaxIdTypeItem(TaxIdType taxIdTypeItem) {
    this.taxIdType.add(taxIdTypeItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxIDFormat {\n");
    
    sb.append("    taxIdType: ").append(toIndentedString(taxIdType)).append("\n");
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

