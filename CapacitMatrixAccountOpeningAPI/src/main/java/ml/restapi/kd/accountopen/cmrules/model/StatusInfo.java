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

public class StatusInfo  {
  
  @ApiModelProperty(value = "")
  private String source = null;
  @ApiModelProperty(value = "")
  private String sourceDetail = null;
  @ApiModelProperty(value = "")
  private String code = null;
  @ApiModelProperty(value = "")
  private String technicalDescription = null;
  @ApiModelProperty(value = "")
  private String businessDescription = null;

 /**
   * Get source
   * @return source
  **/
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public StatusInfo source(String source) {
    this.source = source;
    return this;
  }

 /**
   * Get sourceDetail
   * @return sourceDetail
  **/
  public String getSourceDetail() {
    return sourceDetail;
  }

  public void setSourceDetail(String sourceDetail) {
    this.sourceDetail = sourceDetail;
  }

  public StatusInfo sourceDetail(String sourceDetail) {
    this.sourceDetail = sourceDetail;
    return this;
  }

 /**
   * Get code
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public StatusInfo code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Get technicalDescription
   * @return technicalDescription
  **/
  public String getTechnicalDescription() {
    return technicalDescription;
  }

  public void setTechnicalDescription(String technicalDescription) {
    this.technicalDescription = technicalDescription;
  }

  public StatusInfo technicalDescription(String technicalDescription) {
    this.technicalDescription = technicalDescription;
    return this;
  }

 /**
   * Get businessDescription
   * @return businessDescription
  **/
  public String getBusinessDescription() {
    return businessDescription;
  }

  public void setBusinessDescription(String businessDescription) {
    this.businessDescription = businessDescription;
  }

  public StatusInfo businessDescription(String businessDescription) {
    this.businessDescription = businessDescription;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusInfo {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceDetail: ").append(toIndentedString(sourceDetail)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    technicalDescription: ").append(toIndentedString(technicalDescription)).append("\n");
    sb.append("    businessDescription: ").append(toIndentedString(businessDescription)).append("\n");
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

