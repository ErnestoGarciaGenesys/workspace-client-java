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
import com.genesys.internal.workspace.model.RecentData;
import com.genesys.internal.workspace.model.TargetInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TargetsrecentsaddData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-26T21:45:10.504Z")
public class TargetsrecentsaddData {
  @SerializedName("target")
  private TargetInformation target = null;

  @SerializedName("recentInformation")
  private RecentData recentInformation = null;

  public TargetsrecentsaddData target(TargetInformation target) {
    this.target = target;
    return this;
  }

   /**
   * The target to add.
   * @return target
  **/
  @ApiModelProperty(required = true, value = "The target to add.")
  public TargetInformation getTarget() {
    return target;
  }

  public void setTarget(TargetInformation target) {
    this.target = target;
  }

  public TargetsrecentsaddData recentInformation(RecentData recentInformation) {
    this.recentInformation = recentInformation;
    return this;
  }

   /**
   * This includes the media channel where the target was recently used and the timestamp for when the target was used.
   * @return recentInformation
  **/
  @ApiModelProperty(required = true, value = "This includes the media channel where the target was recently used and the timestamp for when the target was used.")
  public RecentData getRecentInformation() {
    return recentInformation;
  }

  public void setRecentInformation(RecentData recentInformation) {
    this.recentInformation = recentInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetsrecentsaddData targetsrecentsaddData = (TargetsrecentsaddData) o;
    return Objects.equals(this.target, targetsrecentsaddData.target) &&
        Objects.equals(this.recentInformation, targetsrecentsaddData.recentInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, recentInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetsrecentsaddData {\n");
    
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    recentInformation: ").append(toIndentedString(recentInformation)).append("\n");
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

