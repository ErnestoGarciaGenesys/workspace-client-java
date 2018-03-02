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
 * StatisticValue
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-02T22:47:04.108Z")
public class StatisticValue {
  @SerializedName("objectId")
  private String objectId = null;

  @SerializedName("objectType")
  private String objectType = null;

  @SerializedName("statisticId")
  private String statisticId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("timestamp")
  private Long timestamp = null;

  @SerializedName("value")
  private Object value = null;

  public StatisticValue objectId(String objectId) {
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

  public StatisticValue objectType(String objectType) {
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

  public StatisticValue statisticId(String statisticId) {
    this.statisticId = statisticId;
    return this;
  }

   /**
   * Unique id for the statistic
   * @return statisticId
  **/
  @ApiModelProperty(required = true, value = "Unique id for the statistic")
  public String getStatisticId() {
    return statisticId;
  }

  public void setStatisticId(String statisticId) {
    this.statisticId = statisticId;
  }

  public StatisticValue name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the statistic
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the statistic")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StatisticValue timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp for given value of the statistic
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "Timestamp for given value of the statistic")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public StatisticValue value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the statistic
   * @return value
  **/
  @ApiModelProperty(value = "Value of the statistic")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticValue statisticValue = (StatisticValue) o;
    return Objects.equals(this.objectId, statisticValue.objectId) &&
        Objects.equals(this.objectType, statisticValue.objectType) &&
        Objects.equals(this.statisticId, statisticValue.statisticId) &&
        Objects.equals(this.name, statisticValue.name) &&
        Objects.equals(this.timestamp, statisticValue.timestamp) &&
        Objects.equals(this.value, statisticValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, objectType, statisticId, name, timestamp, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticValue {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    statisticId: ").append(toIndentedString(statisticId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

