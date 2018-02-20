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
 * WorkbinsworkbinIdgetcontentData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-20T16:43:51.808Z")
public class WorkbinsworkbinIdgetcontentData {
  @SerializedName("ownerId")
  private String ownerId = null;

  public WorkbinsworkbinIdgetcontentData ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Id of the owner of the workbin.
   * @return ownerId
  **/
  @ApiModelProperty(value = "Id of the owner of the workbin.")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkbinsworkbinIdgetcontentData workbinsworkbinIdgetcontentData = (WorkbinsworkbinIdgetcontentData) o;
    return Objects.equals(this.ownerId, workbinsworkbinIdgetcontentData.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkbinsworkbinIdgetcontentData {\n");
    
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

