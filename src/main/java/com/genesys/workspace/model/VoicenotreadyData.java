/*
 * Workspace API
 * Application API used by Workspace Web Edition
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.workspace.model;

import java.util.Objects;
import com.genesys.workspace.model.Kvpair;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * VoicenotreadyData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-24T14:34:37.872Z")
public class VoicenotreadyData {
  @SerializedName("reasonCode")
  private String reasonCode = null;

  /**
   * the agent workmode.
   */
  public enum AgentWorkModeEnum {
    @SerializedName("AfterCallWork")
    AFTERCALLWORK("AfterCallWork"),
    
    @SerializedName("AuxWork")
    AUXWORK("AuxWork"),
    
    @SerializedName("LegalGuard")
    LEGALGUARD("LegalGuard"),
    
    @SerializedName("NoCallDisconnect")
    NOCALLDISCONNECT("NoCallDisconnect"),
    
    @SerializedName("WalkAway")
    WALKAWAY("WalkAway");

    private String value;

    AgentWorkModeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("agentWorkMode")
  private AgentWorkModeEnum agentWorkMode = null;

  @SerializedName("reasons")
  private List<Kvpair> reasons = new ArrayList<Kvpair>();

  @SerializedName("extensions")
  private List<Kvpair> extensions = new ArrayList<Kvpair>();

  public VoicenotreadyData reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * the reason code
   * @return reasonCode
  **/
  @ApiModelProperty(example = "null", value = "the reason code")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public VoicenotreadyData agentWorkMode(AgentWorkModeEnum agentWorkMode) {
    this.agentWorkMode = agentWorkMode;
    return this;
  }

   /**
   * the agent workmode.
   * @return agentWorkMode
  **/
  @ApiModelProperty(example = "null", value = "the agent workmode.")
  public AgentWorkModeEnum getAgentWorkMode() {
    return agentWorkMode;
  }

  public void setAgentWorkMode(AgentWorkModeEnum agentWorkMode) {
    this.agentWorkMode = agentWorkMode;
  }

  public VoicenotreadyData reasons(List<Kvpair> reasons) {
    this.reasons = reasons;
    return this;
  }

  public VoicenotreadyData addReasonsItem(Kvpair reasonsItem) {
    this.reasons.add(reasonsItem);
    return this;
  }

   /**
   * A key/value pairs list of a data structure that provides additional information associated with this action.
   * @return reasons
  **/
  @ApiModelProperty(example = "null", value = "A key/value pairs list of a data structure that provides additional information associated with this action.")
  public List<Kvpair> getReasons() {
    return reasons;
  }

  public void setReasons(List<Kvpair> reasons) {
    this.reasons = reasons;
  }

  public VoicenotreadyData extensions(List<Kvpair> extensions) {
    this.extensions = extensions;
    return this;
  }

  public VoicenotreadyData addExtensionsItem(Kvpair extensionsItem) {
    this.extensions.add(extensionsItem);
    return this;
  }

   /**
   * A key/value pairs list of additional data.
   * @return extensions
  **/
  @ApiModelProperty(example = "null", value = "A key/value pairs list of additional data.")
  public List<Kvpair> getExtensions() {
    return extensions;
  }

  public void setExtensions(List<Kvpair> extensions) {
    this.extensions = extensions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicenotreadyData voicenotreadyData = (VoicenotreadyData) o;
    return Objects.equals(this.reasonCode, voicenotreadyData.reasonCode) &&
        Objects.equals(this.agentWorkMode, voicenotreadyData.agentWorkMode) &&
        Objects.equals(this.reasons, voicenotreadyData.reasons) &&
        Objects.equals(this.extensions, voicenotreadyData.extensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonCode, agentWorkMode, reasons, extensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicenotreadyData {\n");
    
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    agentWorkMode: ").append(toIndentedString(agentWorkMode)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
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

