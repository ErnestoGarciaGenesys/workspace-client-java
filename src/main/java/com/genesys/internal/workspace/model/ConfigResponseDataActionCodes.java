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
 * ConfigResponseDataActionCodes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T16:18:36.606Z")
public class ConfigResponseDataActionCodes {
  @SerializedName("userProperties")
  private List<Kvpair> userProperties = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  public ConfigResponseDataActionCodes userProperties(List<Kvpair> userProperties) {
    this.userProperties = userProperties;
    return this;
  }

  public ConfigResponseDataActionCodes addUserPropertiesItem(Kvpair userPropertiesItem) {
    if (this.userProperties == null) {
      this.userProperties = new ArrayList<Kvpair>();
    }
    this.userProperties.add(userPropertiesItem);
    return this;
  }

   /**
   * Get userProperties
   * @return userProperties
  **/
  @ApiModelProperty(value = "")
  public List<Kvpair> getUserProperties() {
    return userProperties;
  }

  public void setUserProperties(List<Kvpair> userProperties) {
    this.userProperties = userProperties;
  }

  public ConfigResponseDataActionCodes code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ConfigResponseDataActionCodes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigResponseDataActionCodes configResponseDataActionCodes = (ConfigResponseDataActionCodes) o;
    return Objects.equals(this.userProperties, configResponseDataActionCodes.userProperties) &&
        Objects.equals(this.code, configResponseDataActionCodes.code) &&
        Objects.equals(this.name, configResponseDataActionCodes.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userProperties, code, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigResponseDataActionCodes {\n");
    
    sb.append("    userProperties: ").append(toIndentedString(userProperties)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
