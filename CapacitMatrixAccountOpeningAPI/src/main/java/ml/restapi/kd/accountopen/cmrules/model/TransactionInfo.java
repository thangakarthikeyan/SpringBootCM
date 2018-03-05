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

public class TransactionInfo  {
  
  @ApiModelProperty(value = "")
  private String requestSource = null;
  @ApiModelProperty(value = "")
  private String transactionSource = null;
  @ApiModelProperty(value = "")
  private String eventCorrelationId = null;

 /**
   * Get requestSource
   * @return requestSource
  **/
  public String getRequestSource() {
    return requestSource;
  }

  public void setRequestSource(String requestSource) {
    this.requestSource = requestSource;
  }

  public TransactionInfo requestSource(String requestSource) {
    this.requestSource = requestSource;
    return this;
  }

 /**
   * Get transactionSource
   * @return transactionSource
  **/
  public String getTransactionSource() {
    return transactionSource;
  }

  public void setTransactionSource(String transactionSource) {
    this.transactionSource = transactionSource;
  }

  public TransactionInfo transactionSource(String transactionSource) {
    this.transactionSource = transactionSource;
    return this;
  }

 /**
   * Get eventCorrelationId
   * @return eventCorrelationId
  **/
  public String getEventCorrelationId() {
    return eventCorrelationId;
  }

  public void setEventCorrelationId(String eventCorrelationId) {
    this.eventCorrelationId = eventCorrelationId;
  }

  public TransactionInfo eventCorrelationId(String eventCorrelationId) {
    this.eventCorrelationId = eventCorrelationId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInfo {\n");
    
    sb.append("    requestSource: ").append(toIndentedString(requestSource)).append("\n");
    sb.append("    transactionSource: ").append(toIndentedString(transactionSource)).append("\n");
    sb.append("    eventCorrelationId: ").append(toIndentedString(eventCorrelationId)).append("\n");
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

