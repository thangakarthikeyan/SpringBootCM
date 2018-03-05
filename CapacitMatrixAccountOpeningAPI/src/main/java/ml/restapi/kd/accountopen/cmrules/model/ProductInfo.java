package ml.restapi.kd.accountopen.cmrules.model;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import ml.restapi.kd.accountopen.cmrules.model.AccountOpeningProcessData;
import ml.restapi.kd.accountopen.cmrules.model.AccountProductInfo;
import ml.restapi.kd.accountopen.cmrules.model.ClientSegmentData;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class ProductInfo  {
  
  @ApiModelProperty(value = "")
  private AccountProductInfo accountProductInfo = null;
  @ApiModelProperty(value = "")
  private AccountOpeningProcessData accountOpeningProcessData = null;
  @ApiModelProperty(value = "")
  private ClientSegmentData clientSegmentData = null;

 /**
   * Get accountProductInfo
   * @return accountProductInfo
  **/
  public AccountProductInfo getAccountProductInfo() {
    return accountProductInfo;
  }

  public void setAccountProductInfo(AccountProductInfo accountProductInfo) {
    this.accountProductInfo = accountProductInfo;
  }

  public ProductInfo accountProductInfo(AccountProductInfo accountProductInfo) {
    this.accountProductInfo = accountProductInfo;
    return this;
  }

 /**
   * Get accountOpeningProcessData
   * @return accountOpeningProcessData
  **/
  public AccountOpeningProcessData getAccountOpeningProcessData() {
    return accountOpeningProcessData;
  }

  public void setAccountOpeningProcessData(AccountOpeningProcessData accountOpeningProcessData) {
    this.accountOpeningProcessData = accountOpeningProcessData;
  }

  public ProductInfo accountOpeningProcessData(AccountOpeningProcessData accountOpeningProcessData) {
    this.accountOpeningProcessData = accountOpeningProcessData;
    return this;
  }

 /**
   * Get clientSegmentData
   * @return clientSegmentData
  **/
  public ClientSegmentData getClientSegmentData() {
    return clientSegmentData;
  }

  public void setClientSegmentData(ClientSegmentData clientSegmentData) {
    this.clientSegmentData = clientSegmentData;
  }

  public ProductInfo clientSegmentData(ClientSegmentData clientSegmentData) {
    this.clientSegmentData = clientSegmentData;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductInfo {\n");
    
    sb.append("    accountProductInfo: ").append(toIndentedString(accountProductInfo)).append("\n");
    sb.append("    accountOpeningProcessData: ").append(toIndentedString(accountOpeningProcessData)).append("\n");
    sb.append("    clientSegmentData: ").append(toIndentedString(clientSegmentData)).append("\n");
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

