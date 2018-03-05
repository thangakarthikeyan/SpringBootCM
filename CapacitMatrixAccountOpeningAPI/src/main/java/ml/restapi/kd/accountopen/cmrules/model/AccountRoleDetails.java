package ml.restapi.kd.accountopen.cmrules.model;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import ml.restapi.kd.accountopen.cmrules.model.AccountOpeningRolesProcessData;
import ml.restapi.kd.accountopen.cmrules.model.AccountRoleDetailsData;
import ml.restapi.kd.accountopen.cmrules.model.AccountRoleInfo;
import ml.restapi.kd.accountopen.cmrules.model.AdditionalDetails;
import ml.restapi.kd.accountopen.cmrules.model.BrokerageEntitlement;
import ml.restapi.kd.accountopen.cmrules.model.PartyProfileType;
import ml.restapi.kd.accountopen.cmrules.model.RoleCategorization;
import ml.restapi.kd.accountopen.cmrules.model.RoleProcessing;
import ml.restapi.kd.accountopen.cmrules.model.TaxIDFormat;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class AccountRoleDetails  {
  
  @ApiModelProperty(value = "")
  private AccountRoleInfo accountRoleInfo = null;
  @ApiModelProperty(value = "")
  private PartyProfileType partyProfileType = null;
  @ApiModelProperty(value = "")
  private BrokerageEntitlement brokerageEntitlement = null;
  @ApiModelProperty(value = "")
  private AccountRoleDetailsData accountRoleDetailsData = null;
  @ApiModelProperty(value = "")
  private AccountOpeningRolesProcessData accountOpeningProcessData = null;
  @ApiModelProperty(value = "")
  private RoleCategorization roleCategorization = null;
  @ApiModelProperty(value = "")
  private RoleProcessing roleProcessing = null;
  @ApiModelProperty(value = "")
  private TaxIDFormat taxIDFormat = null;
  @ApiModelProperty(value = "")
  private AdditionalDetails additionalDetails = null;

 /**
   * Get accountRoleInfo
   * @return accountRoleInfo
  **/
  public AccountRoleInfo getAccountRoleInfo() {
    return accountRoleInfo;
  }

  public void setAccountRoleInfo(AccountRoleInfo accountRoleInfo) {
    this.accountRoleInfo = accountRoleInfo;
  }

  public AccountRoleDetails accountRoleInfo(AccountRoleInfo accountRoleInfo) {
    this.accountRoleInfo = accountRoleInfo;
    return this;
  }

 /**
   * Get partyProfileType
   * @return partyProfileType
  **/
  public PartyProfileType getPartyProfileType() {
    return partyProfileType;
  }

  public void setPartyProfileType(PartyProfileType partyProfileType) {
    this.partyProfileType = partyProfileType;
  }

  public AccountRoleDetails partyProfileType(PartyProfileType partyProfileType) {
    this.partyProfileType = partyProfileType;
    return this;
  }

 /**
   * Get brokerageEntitlement
   * @return brokerageEntitlement
  **/
  public BrokerageEntitlement getBrokerageEntitlement() {
    return brokerageEntitlement;
  }

  public void setBrokerageEntitlement(BrokerageEntitlement brokerageEntitlement) {
    this.brokerageEntitlement = brokerageEntitlement;
  }

  public AccountRoleDetails brokerageEntitlement(BrokerageEntitlement brokerageEntitlement) {
    this.brokerageEntitlement = brokerageEntitlement;
    return this;
  }

 /**
   * Get accountRoleDetailsData
   * @return accountRoleDetailsData
  **/
  public AccountRoleDetailsData getAccountRoleDetailsData() {
    return accountRoleDetailsData;
  }

  public void setAccountRoleDetailsData(AccountRoleDetailsData accountRoleDetailsData) {
    this.accountRoleDetailsData = accountRoleDetailsData;
  }

  public AccountRoleDetails accountRoleDetailsData(AccountRoleDetailsData accountRoleDetailsData) {
    this.accountRoleDetailsData = accountRoleDetailsData;
    return this;
  }

 /**
   * Get accountOpeningProcessData
   * @return accountOpeningProcessData
  **/
  public AccountOpeningRolesProcessData getAccountOpeningProcessData() {
    return accountOpeningProcessData;
  }

  public void setAccountOpeningProcessData(AccountOpeningRolesProcessData accountOpeningProcessData) {
    this.accountOpeningProcessData = accountOpeningProcessData;
  }

  public AccountRoleDetails accountOpeningProcessData(AccountOpeningRolesProcessData accountOpeningProcessData) {
    this.accountOpeningProcessData = accountOpeningProcessData;
    return this;
  }

 /**
   * Get roleCategorization
   * @return roleCategorization
  **/
  public RoleCategorization getRoleCategorization() {
    return roleCategorization;
  }

  public void setRoleCategorization(RoleCategorization roleCategorization) {
    this.roleCategorization = roleCategorization;
  }

  public AccountRoleDetails roleCategorization(RoleCategorization roleCategorization) {
    this.roleCategorization = roleCategorization;
    return this;
  }

 /**
   * Get roleProcessing
   * @return roleProcessing
  **/
  public RoleProcessing getRoleProcessing() {
    return roleProcessing;
  }

  public void setRoleProcessing(RoleProcessing roleProcessing) {
    this.roleProcessing = roleProcessing;
  }

  public AccountRoleDetails roleProcessing(RoleProcessing roleProcessing) {
    this.roleProcessing = roleProcessing;
    return this;
  }

 /**
   * Get taxIDFormat
   * @return taxIDFormat
  **/
  public TaxIDFormat getTaxIDFormat() {
    return taxIDFormat;
  }

  public void setTaxIDFormat(TaxIDFormat taxIDFormat) {
    this.taxIDFormat = taxIDFormat;
  }

  public AccountRoleDetails taxIDFormat(TaxIDFormat taxIDFormat) {
    this.taxIDFormat = taxIDFormat;
    return this;
  }

 /**
   * Get additionalDetails
   * @return additionalDetails
  **/
  public AdditionalDetails getAdditionalDetails() {
    return additionalDetails;
  }

  public void setAdditionalDetails(AdditionalDetails additionalDetails) {
    this.additionalDetails = additionalDetails;
  }

  public AccountRoleDetails additionalDetails(AdditionalDetails additionalDetails) {
    this.additionalDetails = additionalDetails;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRoleDetails {\n");
    
    sb.append("    accountRoleInfo: ").append(toIndentedString(accountRoleInfo)).append("\n");
    sb.append("    partyProfileType: ").append(toIndentedString(partyProfileType)).append("\n");
    sb.append("    brokerageEntitlement: ").append(toIndentedString(brokerageEntitlement)).append("\n");
    sb.append("    accountRoleDetailsData: ").append(toIndentedString(accountRoleDetailsData)).append("\n");
    sb.append("    accountOpeningProcessData: ").append(toIndentedString(accountOpeningProcessData)).append("\n");
    sb.append("    roleCategorization: ").append(toIndentedString(roleCategorization)).append("\n");
    sb.append("    roleProcessing: ").append(toIndentedString(roleProcessing)).append("\n");
    sb.append("    taxIDFormat: ").append(toIndentedString(taxIDFormat)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
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

