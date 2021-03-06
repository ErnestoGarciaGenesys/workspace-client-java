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
 * MediaemailinteractionsidreplyData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T01:04:45.106Z")
public class MediaemailinteractionsidreplyData {
  @SerializedName("queue")
  private String queue = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("to")
  private List<String> to = null;

  @SerializedName("cc")
  private List<String> cc = null;

  @SerializedName("bcc")
  private List<String> bcc = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("bodyAsPlainText")
  private String bodyAsPlainText = null;

  @SerializedName("mime")
  private String mime = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("userData")
  private List<Kvpair> userData = null;

  public MediaemailinteractionsidreplyData queue(String queue) {
    this.queue = queue;
    return this;
  }

   /**
   * the name of the queue to submit the reply email
   * @return queue
  **/
  @ApiModelProperty(required = true, value = "the name of the queue to submit the reply email")
  public String getQueue() {
    return queue;
  }

  public void setQueue(String queue) {
    this.queue = queue;
  }

  public MediaemailinteractionsidreplyData from(String from) {
    this.from = from;
    return this;
  }

   /**
   * the address mail of from.
   * @return from
  **/
  @ApiModelProperty(required = true, value = "the address mail of from.")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public MediaemailinteractionsidreplyData to(List<String> to) {
    this.to = to;
    return this;
  }

  public MediaemailinteractionsidreplyData addToItem(String toItem) {
    if (this.to == null) {
      this.to = new ArrayList<String>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * The addresses mail of to. If the field is not defined. The to is reply address speficied in inboud or from address if reply is not defined.
   * @return to
  **/
  @ApiModelProperty(value = "The addresses mail of to. If the field is not defined. The to is reply address speficied in inboud or from address if reply is not defined.")
  public List<String> getTo() {
    return to;
  }

  public void setTo(List<String> to) {
    this.to = to;
  }

  public MediaemailinteractionsidreplyData cc(List<String> cc) {
    this.cc = cc;
    return this;
  }

  public MediaemailinteractionsidreplyData addCcItem(String ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<String>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * cc addresses
   * @return cc
  **/
  @ApiModelProperty(value = "cc addresses")
  public List<String> getCc() {
    return cc;
  }

  public void setCc(List<String> cc) {
    this.cc = cc;
  }

  public MediaemailinteractionsidreplyData bcc(List<String> bcc) {
    this.bcc = bcc;
    return this;
  }

  public MediaemailinteractionsidreplyData addBccItem(String bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<String>();
    }
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * bcc addresses
   * @return bcc
  **/
  @ApiModelProperty(value = "bcc addresses")
  public List<String> getBcc() {
    return bcc;
  }

  public void setBcc(List<String> bcc) {
    this.bcc = bcc;
  }

  public MediaemailinteractionsidreplyData body(String body) {
    this.body = body;
    return this;
  }

   /**
   * The message to send. Html body
   * @return body
  **/
  @ApiModelProperty(value = "The message to send. Html body")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public MediaemailinteractionsidreplyData bodyAsPlainText(String bodyAsPlainText) {
    this.bodyAsPlainText = bodyAsPlainText;
    return this;
  }

   /**
   * The message to send. Plain text body
   * @return bodyAsPlainText
  **/
  @ApiModelProperty(value = "The message to send. Plain text body")
  public String getBodyAsPlainText() {
    return bodyAsPlainText;
  }

  public void setBodyAsPlainText(String bodyAsPlainText) {
    this.bodyAsPlainText = bodyAsPlainText;
  }

  public MediaemailinteractionsidreplyData mime(String mime) {
    this.mime = mime;
    return this;
  }

   /**
   * Multipurpose internet mail extensions of email
   * @return mime
  **/
  @ApiModelProperty(value = "Multipurpose internet mail extensions of email")
  public String getMime() {
    return mime;
  }

  public void setMime(String mime) {
    this.mime = mime;
  }

  public MediaemailinteractionsidreplyData subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The subject value
   * @return subject
  **/
  @ApiModelProperty(value = "The subject value")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public MediaemailinteractionsidreplyData userData(List<Kvpair> userData) {
    this.userData = userData;
    return this;
  }

  public MediaemailinteractionsidreplyData addUserDataItem(Kvpair userDataItem) {
    if (this.userData == null) {
      this.userData = new ArrayList<Kvpair>();
    }
    this.userData.add(userDataItem);
    return this;
  }

   /**
   * A key/value pairs list of user data.
   * @return userData
  **/
  @ApiModelProperty(value = "A key/value pairs list of user data.")
  public List<Kvpair> getUserData() {
    return userData;
  }

  public void setUserData(List<Kvpair> userData) {
    this.userData = userData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaemailinteractionsidreplyData mediaemailinteractionsidreplyData = (MediaemailinteractionsidreplyData) o;
    return Objects.equals(this.queue, mediaemailinteractionsidreplyData.queue) &&
        Objects.equals(this.from, mediaemailinteractionsidreplyData.from) &&
        Objects.equals(this.to, mediaemailinteractionsidreplyData.to) &&
        Objects.equals(this.cc, mediaemailinteractionsidreplyData.cc) &&
        Objects.equals(this.bcc, mediaemailinteractionsidreplyData.bcc) &&
        Objects.equals(this.body, mediaemailinteractionsidreplyData.body) &&
        Objects.equals(this.bodyAsPlainText, mediaemailinteractionsidreplyData.bodyAsPlainText) &&
        Objects.equals(this.mime, mediaemailinteractionsidreplyData.mime) &&
        Objects.equals(this.subject, mediaemailinteractionsidreplyData.subject) &&
        Objects.equals(this.userData, mediaemailinteractionsidreplyData.userData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, from, to, cc, bcc, body, bodyAsPlainText, mime, subject, userData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaemailinteractionsidreplyData {\n");
    
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    bodyAsPlainText: ").append(toIndentedString(bodyAsPlainText)).append("\n");
    sb.append("    mime: ").append(toIndentedString(mime)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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

