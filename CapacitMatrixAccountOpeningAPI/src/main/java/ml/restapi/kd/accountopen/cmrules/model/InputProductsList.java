package ml.restapi.kd.accountopen.cmrules.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import ml.restapi.kd.accountopen.cmrules.model.ProductInfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class InputProductsList  {
  
  @ApiModelProperty(value = "")
  private List<ProductInfo> inputProduct = new ArrayList<ProductInfo>();

 /**
   * Get inputProduct
   * @return inputProduct
  **/
  public List<ProductInfo> getInputProduct() {
    return inputProduct;
  }

  public void setInputProduct(List<ProductInfo> inputProduct) {
    this.inputProduct = inputProduct;
  }

  public InputProductsList inputProduct(List<ProductInfo> inputProduct) {
    this.inputProduct = inputProduct;
    return this;
  }

  public InputProductsList addInputProductItem(ProductInfo inputProductItem) {
    this.inputProduct.add(inputProductItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputProductsList {\n");
    
    sb.append("    inputProduct: ").append(toIndentedString(inputProduct)).append("\n");
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

