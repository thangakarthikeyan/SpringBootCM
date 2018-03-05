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

public class AccountRoleDetailsData  {
  
  @ApiModelProperty(value = "")
  private String primaryParticipantInd = null;
  @ApiModelProperty(value = "")
  private String primaryMailingRoleInd = null;
  @ApiModelProperty(value = "")
  private String mailingRoleInd = null;
  @ApiModelProperty(value = "")
  private String finraAccessInd = null;
  @ApiModelProperty(value = "")
  private String roleAccessInd = null;
  @ApiModelProperty(value = "")
  private String gfCCCustomerInd = null;

 /**
   * Get primaryParticipantInd
   * @return primaryParticipantInd
  **/
  public String getPrimaryParticipantInd() {
    return primaryParticipantInd;
  }

  public void setPrimaryParticipantInd(String primaryParticipantInd) {
    this.primaryParticipantInd = primaryParticipantInd;
  }

  public AccountRoleDetailsData primaryParticipantInd(String primaryParticipantInd) {
    this.primaryParticipantInd = primaryParticipantInd;
    return this;
  }

 /**
   * Get primaryMailingRoleInd
   * @return primaryMailingRoleInd
  **/
  public String getPrimaryMailingRoleInd() {
    return primaryMailingRoleInd;
  }

  public void setPrimaryMailingRoleInd(String primaryMailingRoleInd) {
    this.primaryMailingRoleInd = primaryMailingRoleInd;
  }

  public AccountRoleDetailsData primaryMailingRoleInd(String primaryMailingRoleInd) {
    this.primaryMailingRoleInd = primaryMailingRoleInd;
    return this;
  }

 /**
   * Get mailingRoleInd
   * @return mailingRoleInd
  **/
  public String getMailingRoleInd() {
    return mailingRoleInd;
  }

  public void setMailingRoleInd(String mailingRoleInd) {
    this.mailingRoleInd = mailingRoleInd;
  }

  public AccountRoleDetailsData mailingRoleInd(String mailingRoleInd) {
    this.mailingRoleInd = mailingRoleInd;
    return this;
  }

 /**
   * Get finraAccessInd
   * @return finraAccessInd
  **/
  public String getFinraAccessInd() {
    return finraAccessInd;
  }

  public void setFinraAccessInd(String finraAccessInd) {
    this.finraAccessInd = finraAccessInd;
  }

  public AccountRoleDetailsData finraAccessInd(String finraAccessInd) {
    this.finraAccessInd = finraAccessInd;
    return this;
  }

 /**
   * Get roleAccessInd
   * @return roleAccessInd
  **/
  public String getRoleAccessInd() {
    return roleAccessInd;
  }

  public void setRoleAccessInd(String roleAccessInd) {
    this.roleAccessInd = roleAccessInd;
  }

  public AccountRoleDetailsData roleAccessInd(String roleAccessInd) {
    this.roleAccessInd = roleAccessInd;
    return this;
  }

 /**
   * Get gfCCCustomerInd
   * @return gfCCCustomerInd
  **/
  public String getGfCCCustomerInd() {
    return gfCCCustomerInd;
  }

  public void setGfCCCustomerInd(String gfCCCustomerInd) {
    this.gfCCCustomerInd = gfCCCustomerInd;
  }

  public AccountRoleDetailsData gfCCCustomerInd(String gfCCCustomerInd) {
    this.gfCCCustomerInd = gfCCCustomerInd;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRoleDetailsData {\n");
    
    sb.append("    primaryParticipantInd: ").append(toIndentedString(primaryParticipantInd)).append("\n");
    sb.append("    primaryMailingRoleInd: ").append(toIndentedString(primaryMailingRoleInd)).append("\n");
    sb.append("    mailingRoleInd: ").append(toIndentedString(mailingRoleInd)).append("\n");
    sb.append("    finraAccessInd: ").append(toIndentedString(finraAccessInd)).append("\n");
    sb.append("    roleAccessInd: ").append(toIndentedString(roleAccessInd)).append("\n");
    sb.append("    gfCCCustomerInd: ").append(toIndentedString(gfCCCustomerInd)).append("\n");
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

