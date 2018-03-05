package ml.restapi.kd.accountopen.cmrules.model;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import ml.restapi.kd.accountopen.cmrules.model.AccountOpeningRolesRulesList;
import ml.restapi.kd.accountopen.cmrules.model.StatusInfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlRootElement
public class AccountOpeningRulesResponse  {
  
  @ApiModelProperty(value = "")
  private AccountOpeningRolesRulesList accountOpeningRolesRulesList = null;
  @ApiModelProperty(value = "")
  private StatusInfo transactionStatus = null;

 /**
   * Get accountOpeningRolesRulesList
   * @return accountOpeningRolesRulesList
  **/
  public AccountOpeningRolesRulesList getAccountOpeningRolesRulesList() {
    return accountOpeningRolesRulesList;
  }

  public void setAccountOpeningRolesRulesList(AccountOpeningRolesRulesList accountOpeningRolesRulesList) {
    this.accountOpeningRolesRulesList = accountOpeningRolesRulesList;
  }

  public AccountOpeningRulesResponse accountOpeningRolesRulesList(AccountOpeningRolesRulesList accountOpeningRolesRulesList) {
    this.accountOpeningRolesRulesList = accountOpeningRolesRulesList;
    return this;
  }

 /**
   * Get transactionStatus
   * @return transactionStatus
  **/
  public StatusInfo getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(StatusInfo transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public AccountOpeningRulesResponse transactionStatus(StatusInfo transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountOpeningRulesResponse {\n");
    
    sb.append("    accountOpeningRolesRulesList: ").append(toIndentedString(accountOpeningRolesRulesList)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
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

