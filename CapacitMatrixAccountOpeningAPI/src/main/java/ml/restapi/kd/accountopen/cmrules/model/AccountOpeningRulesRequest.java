package ml.restapi.kd.accountopen.cmrules.model;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import ml.restapi.kd.accountopen.cmrules.model.InputProductsList;
import ml.restapi.kd.accountopen.cmrules.model.TransactionInfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlRootElement(name = "AccountOpeningRulesRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class AccountOpeningRulesRequest  {
  
  @ApiModelProperty(value = "InputProductsList")
  @XmlElement(name = "InputProductsList")
  @JsonProperty("InputProductsList")
  private InputProductsList inputProductsList = null;
  @ApiModelProperty(value = "")
  private TransactionInfo transactionInfo = null;

 /**
   * Get inputProductsList
   * @return inputProductsList
  **/
  public InputProductsList getInputProductsList() {
    return inputProductsList;
  }

  public void setInputProductsList(InputProductsList inputProductsList) {
    this.inputProductsList = inputProductsList;
  }

  public AccountOpeningRulesRequest inputProductsList(InputProductsList inputProductsList) {
    this.inputProductsList = inputProductsList;
    return this;
  }

 /**
   * Get transactionInfo
   * @return transactionInfo
  **/
  public TransactionInfo getTransactionInfo() {
    return transactionInfo;
  }

  public void setTransactionInfo(TransactionInfo transactionInfo) {
    this.transactionInfo = transactionInfo;
  }

  public AccountOpeningRulesRequest transactionInfo(TransactionInfo transactionInfo) {
    this.transactionInfo = transactionInfo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountOpeningRulesRequest {\n");
    
    sb.append("    inputProductsList: ").append(toIndentedString(inputProductsList)).append("\n");
    sb.append("    transactionInfo: ").append(toIndentedString(transactionInfo)).append("\n");
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

