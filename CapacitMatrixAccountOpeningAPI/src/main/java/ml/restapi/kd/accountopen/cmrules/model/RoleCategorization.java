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

public class RoleCategorization  {
  
  @ApiModelProperty(value = "")
  private String profileClassificationCode = null;
  @ApiModelProperty(value = "")
  private String faRegistrationEligibleInd = null;

 /**
   * Get profileClassificationCode
   * @return profileClassificationCode
  **/
  public String getProfileClassificationCode() {
    return profileClassificationCode;
  }

  public void setProfileClassificationCode(String profileClassificationCode) {
    this.profileClassificationCode = profileClassificationCode;
  }

  public RoleCategorization profileClassificationCode(String profileClassificationCode) {
    this.profileClassificationCode = profileClassificationCode;
    return this;
  }

 /**
   * Get faRegistrationEligibleInd
   * @return faRegistrationEligibleInd
  **/
  public String getFaRegistrationEligibleInd() {
    return faRegistrationEligibleInd;
  }

  public void setFaRegistrationEligibleInd(String faRegistrationEligibleInd) {
    this.faRegistrationEligibleInd = faRegistrationEligibleInd;
  }

  public RoleCategorization faRegistrationEligibleInd(String faRegistrationEligibleInd) {
    this.faRegistrationEligibleInd = faRegistrationEligibleInd;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleCategorization {\n");
    
    sb.append("    profileClassificationCode: ").append(toIndentedString(profileClassificationCode)).append("\n");
    sb.append("    faRegistrationEligibleInd: ").append(toIndentedString(faRegistrationEligibleInd)).append("\n");
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

