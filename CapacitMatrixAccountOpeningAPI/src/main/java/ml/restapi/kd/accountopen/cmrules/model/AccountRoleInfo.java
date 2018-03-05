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

public class AccountRoleInfo  {
  
  @ApiModelProperty(value = "")
  private String accountRoleTypeCode = null;
  @ApiModelProperty(value = "")
  private String accountRoleTypeDesc = null;

 /**
   * Get accountRoleTypeCode
   * @return accountRoleTypeCode
  **/
  public String getAccountRoleTypeCode() {
    return accountRoleTypeCode;
  }

  public void setAccountRoleTypeCode(String accountRoleTypeCode) {
    this.accountRoleTypeCode = accountRoleTypeCode;
  }

  public AccountRoleInfo accountRoleTypeCode(String accountRoleTypeCode) {
    this.accountRoleTypeCode = accountRoleTypeCode;
    return this;
  }

 /**
   * Get accountRoleTypeDesc
   * @return accountRoleTypeDesc
  **/
  public String getAccountRoleTypeDesc() {
    return accountRoleTypeDesc;
  }

  public void setAccountRoleTypeDesc(String accountRoleTypeDesc) {
    this.accountRoleTypeDesc = accountRoleTypeDesc;
  }

  public AccountRoleInfo accountRoleTypeDesc(String accountRoleTypeDesc) {
    this.accountRoleTypeDesc = accountRoleTypeDesc;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRoleInfo {\n");
    
    sb.append("    accountRoleTypeCode: ").append(toIndentedString(accountRoleTypeCode)).append("\n");
    sb.append("    accountRoleTypeDesc: ").append(toIndentedString(accountRoleTypeDesc)).append("\n");
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

