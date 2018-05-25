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
 * MediachatinteractionsidinvitebyqueueData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-25T21:04:41.926Z")
public class MediachatinteractionsidinvitebyqueueData {
  @SerializedName("queue")
  private String queue = null;

  public MediachatinteractionsidinvitebyqueueData queue(String queue) {
    this.queue = queue;
    return this;
  }

   /**
   * The name of the queue where the Workspace API should send the chat invite.
   * @return queue
  **/
  @ApiModelProperty(required = true, value = "The name of the queue where the Workspace API should send the chat invite.")
  public String getQueue() {
    return queue;
  }

  public void setQueue(String queue) {
    this.queue = queue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediachatinteractionsidinvitebyqueueData mediachatinteractionsidinvitebyqueueData = (MediachatinteractionsidinvitebyqueueData) o;
    return Objects.equals(this.queue, mediachatinteractionsidinvitebyqueueData.queue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediachatinteractionsidinvitebyqueueData {\n");
    
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
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

