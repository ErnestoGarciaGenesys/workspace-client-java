/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.workspace.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IxnReasonCode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-28T23:30:53.740Z")
public class IxnReasonCode {
  @SerializedName("reasonSystemName")
  private String reasonSystemName = null;

  @SerializedName("reasonDescription")
  private String reasonDescription = null;

  @SerializedName("reason")
  private Integer reason = null;

  public IxnReasonCode reasonSystemName(String reasonSystemName) {
    this.reasonSystemName = reasonSystemName;
    return this;
  }

   /**
   * Get reasonSystemName
   * @return reasonSystemName
  **/
  @ApiModelProperty(value = "")
  public String getReasonSystemName() {
    return reasonSystemName;
  }

  public void setReasonSystemName(String reasonSystemName) {
    this.reasonSystemName = reasonSystemName;
  }

  public IxnReasonCode reasonDescription(String reasonDescription) {
    this.reasonDescription = reasonDescription;
    return this;
  }

   /**
   * Get reasonDescription
   * @return reasonDescription
  **/
  @ApiModelProperty(value = "")
  public String getReasonDescription() {
    return reasonDescription;
  }

  public void setReasonDescription(String reasonDescription) {
    this.reasonDescription = reasonDescription;
  }

  public IxnReasonCode reason(Integer reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public Integer getReason() {
    return reason;
  }

  public void setReason(Integer reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IxnReasonCode ixnReasonCode = (IxnReasonCode) o;
    return Objects.equals(this.reasonSystemName, ixnReasonCode.reasonSystemName) &&
        Objects.equals(this.reasonDescription, ixnReasonCode.reasonDescription) &&
        Objects.equals(this.reason, ixnReasonCode.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonSystemName, reasonDescription, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IxnReasonCode {\n");
    
    sb.append("    reasonSystemName: ").append(toIndentedString(reasonSystemName)).append("\n");
    sb.append("    reasonDescription: ").append(toIndentedString(reasonDescription)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

