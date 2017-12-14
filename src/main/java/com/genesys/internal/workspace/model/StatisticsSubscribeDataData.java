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
import com.genesys.internal.workspace.model.StatisticValueForRegister;
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
 * StatisticsSubscribeDataData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-14T23:18:19.493Z")
public class StatisticsSubscribeDataData {
  @SerializedName("connectionId")
  private String connectionId = null;

  @SerializedName("statistics")
  private List<StatisticValueForRegister> statistics = new ArrayList<StatisticValueForRegister>();

  public StatisticsSubscribeDataData connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Get connectionId
   * @return connectionId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public StatisticsSubscribeDataData statistics(List<StatisticValueForRegister> statistics) {
    this.statistics = statistics;
    return this;
  }

  public StatisticsSubscribeDataData addStatisticsItem(StatisticValueForRegister statisticsItem) {
    this.statistics.add(statisticsItem);
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @ApiModelProperty(required = true, value = "")
  public List<StatisticValueForRegister> getStatistics() {
    return statistics;
  }

  public void setStatistics(List<StatisticValueForRegister> statistics) {
    this.statistics = statistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticsSubscribeDataData statisticsSubscribeDataData = (StatisticsSubscribeDataData) o;
    return Objects.equals(this.connectionId, statisticsSubscribeDataData.connectionId) &&
        Objects.equals(this.statistics, statisticsSubscribeDataData.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, statistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticsSubscribeDataData {\n");
    
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

