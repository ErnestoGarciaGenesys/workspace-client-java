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
 * StatisticValueForRegisterResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-07T21:04:51.081Z")
public class StatisticValueForRegisterResponse {
  @SerializedName("objectId")
  private String objectId = null;

  @SerializedName("objectType")
  private String objectType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("statisticId")
  private String statisticId = null;

  public StatisticValueForRegisterResponse objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * ID of the object to get the statistic for
   * @return objectId
  **/
  @ApiModelProperty(required = true, value = "ID of the object to get the statistic for")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public StatisticValueForRegisterResponse objectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

   /**
   * Type of the obejct to get the statistic for
   * @return objectType
  **/
  @ApiModelProperty(required = true, value = "Type of the obejct to get the statistic for")
  public String getObjectType() {
    return objectType;
  }

  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }

  public StatisticValueForRegisterResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the statistic
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the statistic")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StatisticValueForRegisterResponse statisticId(String statisticId) {
    this.statisticId = statisticId;
    return this;
  }

   /**
   * ID of the statistic
   * @return statisticId
  **/
  @ApiModelProperty(required = true, value = "ID of the statistic")
  public String getStatisticId() {
    return statisticId;
  }

  public void setStatisticId(String statisticId) {
    this.statisticId = statisticId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticValueForRegisterResponse statisticValueForRegisterResponse = (StatisticValueForRegisterResponse) o;
    return Objects.equals(this.objectId, statisticValueForRegisterResponse.objectId) &&
        Objects.equals(this.objectType, statisticValueForRegisterResponse.objectType) &&
        Objects.equals(this.name, statisticValueForRegisterResponse.name) &&
        Objects.equals(this.statisticId, statisticValueForRegisterResponse.statisticId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, objectType, name, statisticId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticValueForRegisterResponse {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statisticId: ").append(toIndentedString(statisticId)).append("\n");
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

