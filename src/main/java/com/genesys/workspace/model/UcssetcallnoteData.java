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


package com.genesys.workspace.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UcssetcallnoteData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-17T19:22:59.729Z")
public class UcssetcallnoteData {
  @SerializedName("interactionId")
  private String interactionId = null;

  @SerializedName("note")
  private String note = null;

  public UcssetcallnoteData interactionId(String interactionId) {
    this.interactionId = interactionId;
    return this;
  }

   /**
   * The id of the interaction
   * @return interactionId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The id of the interaction")
  public String getInteractionId() {
    return interactionId;
  }

  public void setInteractionId(String interactionId) {
    this.interactionId = interactionId;
  }

  public UcssetcallnoteData note(String note) {
    this.note = note;
    return this;
  }

   /**
   * The note to be set
   * @return note
  **/
  @ApiModelProperty(example = "null", required = true, value = "The note to be set")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcssetcallnoteData ucssetcallnoteData = (UcssetcallnoteData) o;
    return Objects.equals(this.interactionId, ucssetcallnoteData.interactionId) &&
        Objects.equals(this.note, ucssetcallnoteData.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interactionId, note);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcssetcallnoteData {\n");
    
    sb.append("    interactionId: ").append(toIndentedString(interactionId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

