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
import com.genesys.internal.workspace.model.Kvpair;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MediachatinteractionsidsendurlData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-21T22:31:00.788Z")
public class MediachatinteractionsidsendurlData {
  @SerializedName("url")
  private String url = null;

  @SerializedName("extension")
  private List<Kvpair> extension = null;

  public MediachatinteractionsidsendurlData url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url to send to the chat
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The url to send to the chat")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public MediachatinteractionsidsendurlData extension(List<Kvpair> extension) {
    this.extension = extension;
    return this;
  }

  public MediachatinteractionsidsendurlData addExtensionItem(Kvpair extensionItem) {
    if (this.extension == null) {
      this.extension = new ArrayList<Kvpair>();
    }
    this.extension.add(extensionItem);
    return this;
  }

   /**
   * A key/value pairs list of additional data.
   * @return extension
  **/
  @ApiModelProperty(value = "A key/value pairs list of additional data.")
  public List<Kvpair> getExtension() {
    return extension;
  }

  public void setExtension(List<Kvpair> extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediachatinteractionsidsendurlData mediachatinteractionsidsendurlData = (MediachatinteractionsidsendurlData) o;
    return Objects.equals(this.url, mediachatinteractionsidsendurlData.url) &&
        Objects.equals(this.extension, mediachatinteractionsidsendurlData.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, extension);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediachatinteractionsidsendurlData {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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

