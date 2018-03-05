package ml.restapi.kd.accountopen.cmrules.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import ml.restapi.kd.accountopen.cmrules.model.AccountOpeningRolesRule;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class AccountOpeningRolesRulesList  {
  
  @ApiModelProperty(value = "")
  private List<AccountOpeningRolesRule> accountOpeningRolesRule = new ArrayList<AccountOpeningRolesRule>();

 /**
   * Get accountOpeningRolesRule
   * @return accountOpeningRolesRule
  **/
  public List<AccountOpeningRolesRule> getAccountOpeningRolesRule() {
    return accountOpeningRolesRule;
  }

  public void setAccountOpeningRolesRule(List<AccountOpeningRolesRule> accountOpeningRolesRule) {
    this.accountOpeningRolesRule = accountOpeningRolesRule;
  }

  public AccountOpeningRolesRulesList accountOpeningRolesRule(List<AccountOpeningRolesRule> accountOpeningRolesRule) {
    this.accountOpeningRolesRule = accountOpeningRolesRule;
    return this;
  }

  public AccountOpeningRolesRulesList addAccountOpeningRolesRuleItem(AccountOpeningRolesRule accountOpeningRolesRuleItem) {
    this.accountOpeningRolesRule.add(accountOpeningRolesRuleItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountOpeningRolesRulesList {\n");
    
    sb.append("    accountOpeningRolesRule: ").append(toIndentedString(accountOpeningRolesRule)).append("\n");
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

