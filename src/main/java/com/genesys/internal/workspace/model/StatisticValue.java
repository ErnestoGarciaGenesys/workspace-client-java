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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-07T14:00:40.535Z")
public class StatisticValue {
  @SerializedName("timestamp")
  private Integer timestamp = null;

  @SerializedName("value")
  private Integer value = null;

  public StatisticValue timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp for given value of the statistic
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "Timestamp for given value of the statistic")
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public StatisticValue value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the statistic
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Value of the statistic")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
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
    return Objects.equals(this.timestamp, statisticValue.timestamp) &&
        Objects.equals(this.value, statisticValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticValue {\n");
    
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

