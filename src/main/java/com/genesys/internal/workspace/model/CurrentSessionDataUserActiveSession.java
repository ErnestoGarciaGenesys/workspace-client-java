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
import com.genesys.internal.workspace.model.Call;
import com.genesys.internal.workspace.model.Dn;
import com.genesys.internal.workspace.model.Media;
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
 * CurrentSessionDataUserActiveSession
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-07T19:03:51.975Z")
public class CurrentSessionDataUserActiveSession {
  @SerializedName("autoCompleteCall")
  private Boolean autoCompleteCall = null;

  @SerializedName("currentPlace")
  private String currentPlace = null;

  @SerializedName("dn")
  private Dn dn = null;

  @SerializedName("calls")
  private List<Call> calls = null;

  @SerializedName("media")
  private Media media = null;

  public CurrentSessionDataUserActiveSession autoCompleteCall(Boolean autoCompleteCall) {
    this.autoCompleteCall = autoCompleteCall;
    return this;
  }

   /**
   * Get autoCompleteCall
   * @return autoCompleteCall
  **/
  @ApiModelProperty(value = "")
  public Boolean AutoCompleteCall() {
    return autoCompleteCall;
  }

  public void setAutoCompleteCall(Boolean autoCompleteCall) {
    this.autoCompleteCall = autoCompleteCall;
  }

  public CurrentSessionDataUserActiveSession currentPlace(String currentPlace) {
    this.currentPlace = currentPlace;
    return this;
  }

   /**
   * Get currentPlace
   * @return currentPlace
  **/
  @ApiModelProperty(value = "")
  public String getCurrentPlace() {
    return currentPlace;
  }

  public void setCurrentPlace(String currentPlace) {
    this.currentPlace = currentPlace;
  }

  public CurrentSessionDataUserActiveSession dn(Dn dn) {
    this.dn = dn;
    return this;
  }

   /**
   * Get dn
   * @return dn
  **/
  @ApiModelProperty(value = "")
  public Dn getDn() {
    return dn;
  }

  public void setDn(Dn dn) {
    this.dn = dn;
  }

  public CurrentSessionDataUserActiveSession calls(List<Call> calls) {
    this.calls = calls;
    return this;
  }

  public CurrentSessionDataUserActiveSession addCallsItem(Call callsItem) {
    if (this.calls == null) {
      this.calls = new ArrayList<Call>();
    }
    this.calls.add(callsItem);
    return this;
  }

   /**
   * An array containing any active calls.
   * @return calls
  **/
  @ApiModelProperty(value = "An array containing any active calls.")
  public List<Call> getCalls() {
    return calls;
  }

  public void setCalls(List<Call> calls) {
    this.calls = calls;
  }

  public CurrentSessionDataUserActiveSession media(Media media) {
    this.media = media;
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  @ApiModelProperty(value = "")
  public Media getMedia() {
    return media;
  }

  public void setMedia(Media media) {
    this.media = media;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentSessionDataUserActiveSession currentSessionDataUserActiveSession = (CurrentSessionDataUserActiveSession) o;
    return Objects.equals(this.autoCompleteCall, currentSessionDataUserActiveSession.autoCompleteCall) &&
        Objects.equals(this.currentPlace, currentSessionDataUserActiveSession.currentPlace) &&
        Objects.equals(this.dn, currentSessionDataUserActiveSession.dn) &&
        Objects.equals(this.calls, currentSessionDataUserActiveSession.calls) &&
        Objects.equals(this.media, currentSessionDataUserActiveSession.media);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoCompleteCall, currentPlace, dn, calls, media);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentSessionDataUserActiveSession {\n");
    
    sb.append("    autoCompleteCall: ").append(toIndentedString(autoCompleteCall)).append("\n");
    sb.append("    currentPlace: ").append(toIndentedString(currentPlace)).append("\n");
    sb.append("    dn: ").append(toIndentedString(dn)).append("\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
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

