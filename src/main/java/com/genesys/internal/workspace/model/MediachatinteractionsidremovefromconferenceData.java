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
 * MediachatinteractionsidremovefromconferenceData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T01:04:45.106Z")
public class MediachatinteractionsidremovefromconferenceData {
  @SerializedName("agentId")
  private String agentId = null;

  public MediachatinteractionsidremovefromconferenceData agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * The unique ID of the agent to remove from the conference.
   * @return agentId
  **/
  @ApiModelProperty(required = true, value = "The unique ID of the agent to remove from the conference.")
  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediachatinteractionsidremovefromconferenceData mediachatinteractionsidremovefromconferenceData = (MediachatinteractionsidremovefromconferenceData) o;
    return Objects.equals(this.agentId, mediachatinteractionsidremovefromconferenceData.agentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediachatinteractionsidremovefromconferenceData {\n");
    
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
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

