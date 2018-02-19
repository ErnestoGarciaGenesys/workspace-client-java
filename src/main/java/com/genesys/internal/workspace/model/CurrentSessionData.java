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
import com.genesys.internal.workspace.model.CurrentSessionDataPendingloginasync;
import com.genesys.internal.workspace.model.CurrentSessionDataUser;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CurrentSessionData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-19T16:11:42.170Z")
public class CurrentSessionData {
  @SerializedName("pending-login-async")
  private CurrentSessionDataPendingloginasync pendingLoginAsync = null;

  @SerializedName("user")
  private CurrentSessionDataUser user = null;

  public CurrentSessionData pendingLoginAsync(CurrentSessionDataPendingloginasync pendingLoginAsync) {
    this.pendingLoginAsync = pendingLoginAsync;
    return this;
  }

   /**
   * Get pendingLoginAsync
   * @return pendingLoginAsync
  **/
  @ApiModelProperty(value = "")
  public CurrentSessionDataPendingloginasync getPendingLoginAsync() {
    return pendingLoginAsync;
  }

  public void setPendingLoginAsync(CurrentSessionDataPendingloginasync pendingLoginAsync) {
    this.pendingLoginAsync = pendingLoginAsync;
  }

  public CurrentSessionData user(CurrentSessionDataUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public CurrentSessionDataUser getUser() {
    return user;
  }

  public void setUser(CurrentSessionDataUser user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentSessionData currentSessionData = (CurrentSessionData) o;
    return Objects.equals(this.pendingLoginAsync, currentSessionData.pendingLoginAsync) &&
        Objects.equals(this.user, currentSessionData.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendingLoginAsync, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentSessionData {\n");
    
    sb.append("    pendingLoginAsync: ").append(toIndentedString(pendingLoginAsync)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

