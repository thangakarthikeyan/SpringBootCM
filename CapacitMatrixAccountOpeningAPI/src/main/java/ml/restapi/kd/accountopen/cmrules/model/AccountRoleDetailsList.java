package ml.restapi.kd.accountopen.cmrules.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import ml.restapi.kd.accountopen.cmrules.model.AccountRoleDetails;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class AccountRoleDetailsList  {
  
  @ApiModelProperty(value = "")
  private List<AccountRoleDetails> accountRoleDetails = new ArrayList<AccountRoleDetails>();

 /**
   * Get accountRoleDetails
   * @return accountRoleDetails
  **/
  public List<AccountRoleDetails> getAccountRoleDetails() {
    return accountRoleDetails;
  }

  public void setAccountRoleDetails(List<AccountRoleDetails> accountRoleDetails) {
    this.accountRoleDetails = accountRoleDetails;
  }

  public AccountRoleDetailsList accountRoleDetails(List<AccountRoleDetails> accountRoleDetails) {
    this.accountRoleDetails = accountRoleDetails;
    return this;
  }

  public AccountRoleDetailsList addAccountRoleDetailsItem(AccountRoleDetails accountRoleDetailsItem) {
    this.accountRoleDetails.add(accountRoleDetailsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRoleDetailsList {\n");
    
    sb.append("    accountRoleDetails: ").append(toIndentedString(accountRoleDetails)).append("\n");
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

