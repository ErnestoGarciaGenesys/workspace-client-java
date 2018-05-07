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
 * MediachatinteractionsidsendmessageData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-07T19:03:51.975Z")
public class MediachatinteractionsidsendmessageData {
  @SerializedName("message")
  private String message = null;

  @SerializedName("messageType")
  private String messageType = null;

  /**
   * Defines which participants in the chat can see the message.
   */
  @JsonAdapter(VisibilityEnum.Adapter.class)
  public enum VisibilityEnum {
    ALL("All"),
    
    AGENT("Agent"),
    
    SUPERVISOR("Supervisor");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisibilityEnum fromValue(String text) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VisibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VisibilityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("visibility")
  private VisibilityEnum visibility = null;

  /**
   * Specifies how the message should be treated.
   */
  @JsonAdapter(TreatAsEnum.Adapter.class)
  public enum TreatAsEnum {
    NORMAL("Normal"),
    
    SYSTEM("System");

    private String value;

    TreatAsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TreatAsEnum fromValue(String text) {
      for (TreatAsEnum b : TreatAsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TreatAsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TreatAsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TreatAsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TreatAsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("treatAs")
  private TreatAsEnum treatAs = null;

  public MediachatinteractionsidsendmessageData message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The message to send to the chat participants.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "The message to send to the chat participants.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public MediachatinteractionsidsendmessageData messageType(String messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * The type of message.
   * @return messageType
  **/
  @ApiModelProperty(value = "The type of message.")
  public String getMessageType() {
    return messageType;
  }

  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }

  public MediachatinteractionsidsendmessageData visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Defines which participants in the chat can see the message.
   * @return visibility
  **/
  @ApiModelProperty(value = "Defines which participants in the chat can see the message.")
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public MediachatinteractionsidsendmessageData treatAs(TreatAsEnum treatAs) {
    this.treatAs = treatAs;
    return this;
  }

   /**
   * Specifies how the message should be treated.
   * @return treatAs
  **/
  @ApiModelProperty(value = "Specifies how the message should be treated.")
  public TreatAsEnum getTreatAs() {
    return treatAs;
  }

  public void setTreatAs(TreatAsEnum treatAs) {
    this.treatAs = treatAs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediachatinteractionsidsendmessageData mediachatinteractionsidsendmessageData = (MediachatinteractionsidsendmessageData) o;
    return Objects.equals(this.message, mediachatinteractionsidsendmessageData.message) &&
        Objects.equals(this.messageType, mediachatinteractionsidsendmessageData.messageType) &&
        Objects.equals(this.visibility, mediachatinteractionsidsendmessageData.visibility) &&
        Objects.equals(this.treatAs, mediachatinteractionsidsendmessageData.treatAs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, messageType, visibility, treatAs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediachatinteractionsidsendmessageData {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    treatAs: ").append(toIndentedString(treatAs)).append("\n");
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

