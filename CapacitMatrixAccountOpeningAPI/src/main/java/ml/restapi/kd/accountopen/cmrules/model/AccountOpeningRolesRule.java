package ml.restapi.kd.accountopen.cmrules.model;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import ml.restapi.kd.accountopen.cmrules.model.AccountRoleDetailsList;
import ml.restapi.kd.accountopen.cmrules.model.ProductInfo;
import ml.restapi.kd.accountopen.cmrules.model.StatusInfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class AccountOpeningRolesRule  {
  
  @ApiModelProperty(value = "")
  private ProductInfo inputProduct = null;
  @ApiModelProperty(value = "")
  private AccountRoleDetailsList accountRoleDetailsList = null;
  @ApiModelProperty(value = "")
  private StatusInfo productLevelStatus = null;

 /**
   * Get inputProduct
   * @return inputProduct
  **/
  public ProductInfo getInputProduct() {
    return inputProduct;
  }

  public void setInputProduct(ProductInfo inputProduct) {
    this.inputProduct = inputProduct;
  }

  public AccountOpeningRolesRule inputProduct(ProductInfo inputProduct) {
    this.inputProduct = inputProduct;
    return this;
  }

 /**
   * Get accountRoleDetailsList
   * @return accountRoleDetailsList
  **/
  public AccountRoleDetailsList getAccountRoleDetailsList() {
    return accountRoleDetailsList;
  }

  public void setAccountRoleDetailsList(AccountRoleDetailsList accountRoleDetailsList) {
    this.accountRoleDetailsList = accountRoleDetailsList;
  }

  public AccountOpeningRolesRule accountRoleDetailsList(AccountRoleDetailsList accountRoleDetailsList) {
    this.accountRoleDetailsList = accountRoleDetailsList;
    return this;
  }

 /**
   * Get productLevelStatus
   * @return productLevelStatus
  **/
  public StatusInfo getProductLevelStatus() {
    return productLevelStatus;
  }

  public void setProductLevelStatus(StatusInfo productLevelStatus) {
    this.productLevelStatus = productLevelStatus;
  }

  public AccountOpeningRolesRule productLevelStatus(StatusInfo productLevelStatus) {
    this.productLevelStatus = productLevelStatus;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountOpeningRolesRule {\n");
    
    sb.append("    inputProduct: ").append(toIndentedString(inputProduct)).append("\n");
    sb.append("    accountRoleDetailsList: ").append(toIndentedString(accountRoleDetailsList)).append("\n");
    sb.append("    productLevelStatus: ").append(toIndentedString(productLevelStatus)).append("\n");
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

