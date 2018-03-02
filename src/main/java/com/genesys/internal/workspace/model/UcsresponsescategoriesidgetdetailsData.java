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
 * UcsresponsescategoriesidgetdetailsData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-02T22:47:04.108Z")
public class UcsresponsescategoriesidgetdetailsData {
  @SerializedName("returnChildrenCategories")
  private Boolean returnChildrenCategories = null;

  @SerializedName("returnChildrenSRInfo")
  private Boolean returnChildrenSRInfo = null;

  public UcsresponsescategoriesidgetdetailsData returnChildrenCategories(Boolean returnChildrenCategories) {
    this.returnChildrenCategories = returnChildrenCategories;
    return this;
  }

   /**
   * true to get children categories
   * @return returnChildrenCategories
  **/
  @ApiModelProperty(value = "true to get children categories")
  public Boolean isReturnChildrenCategories() {
    return returnChildrenCategories;
  }

  public void setReturnChildrenCategories(Boolean returnChildrenCategories) {
    this.returnChildrenCategories = returnChildrenCategories;
  }

  public UcsresponsescategoriesidgetdetailsData returnChildrenSRInfo(Boolean returnChildrenSRInfo) {
    this.returnChildrenSRInfo = returnChildrenSRInfo;
    return this;
  }

   /**
   * true to get children standard responses
   * @return returnChildrenSRInfo
  **/
  @ApiModelProperty(value = "true to get children standard responses")
  public Boolean isReturnChildrenSRInfo() {
    return returnChildrenSRInfo;
  }

  public void setReturnChildrenSRInfo(Boolean returnChildrenSRInfo) {
    this.returnChildrenSRInfo = returnChildrenSRInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcsresponsescategoriesidgetdetailsData ucsresponsescategoriesidgetdetailsData = (UcsresponsescategoriesidgetdetailsData) o;
    return Objects.equals(this.returnChildrenCategories, ucsresponsescategoriesidgetdetailsData.returnChildrenCategories) &&
        Objects.equals(this.returnChildrenSRInfo, ucsresponsescategoriesidgetdetailsData.returnChildrenSRInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnChildrenCategories, returnChildrenSRInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcsresponsescategoriesidgetdetailsData {\n");
    
    sb.append("    returnChildrenCategories: ").append(toIndentedString(returnChildrenCategories)).append("\n");
    sb.append("    returnChildrenSRInfo: ").append(toIndentedString(returnChildrenSRInfo)).append("\n");
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

