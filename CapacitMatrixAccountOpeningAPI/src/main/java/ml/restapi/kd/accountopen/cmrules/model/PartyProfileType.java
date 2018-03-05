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

public class PartyProfileType  {
  
  @ApiModelProperty(value = "")
  private String profileTypeCode = null;
  @ApiModelProperty(value = "")
  private String profileSubTypeCode = null;

 /**
   * Get profileTypeCode
   * @return profileTypeCode
  **/
  public String getProfileTypeCode() {
    return profileTypeCode;
  }

  public void setProfileTypeCode(String profileTypeCode) {
    this.profileTypeCode = profileTypeCode;
  }

  public PartyProfileType profileTypeCode(String profileTypeCode) {
    this.profileTypeCode = profileTypeCode;
    return this;
  }

 /**
   * Get profileSubTypeCode
   * @return profileSubTypeCode
  **/
  public String getProfileSubTypeCode() {
    return profileSubTypeCode;
  }

  public void setProfileSubTypeCode(String profileSubTypeCode) {
    this.profileSubTypeCode = profileSubTypeCode;
  }

  public PartyProfileType profileSubTypeCode(String profileSubTypeCode) {
    this.profileSubTypeCode = profileSubTypeCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyProfileType {\n");
    
    sb.append("    profileTypeCode: ").append(toIndentedString(profileTypeCode)).append("\n");
    sb.append("    profileSubTypeCode: ").append(toIndentedString(profileSubTypeCode)).append("\n");
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

