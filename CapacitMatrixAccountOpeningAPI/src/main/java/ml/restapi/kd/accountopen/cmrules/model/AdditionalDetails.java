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

public class AdditionalDetails  {
  
  @ApiModelProperty(value = "")
  private String participantCategory = null;

 /**
   * Get participantCategory
   * @return participantCategory
  **/
  public String getParticipantCategory() {
    return participantCategory;
  }

  public void setParticipantCategory(String participantCategory) {
    this.participantCategory = participantCategory;
  }

  public AdditionalDetails participantCategory(String participantCategory) {
    this.participantCategory = participantCategory;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDetails {\n");
    
    sb.append("    participantCategory: ").append(toIndentedString(participantCategory)).append("\n");
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

