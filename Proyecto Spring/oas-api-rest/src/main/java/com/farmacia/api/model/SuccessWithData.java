package com.farmacia.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Respuesta de éxito con datos
 */

@Schema(name = "SuccessWithData", description = "Respuesta de éxito con datos")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-30T09:36:54.281473700-06:00[America/Mexico_City]")
public class SuccessWithData implements Serializable {

  private static final long serialVersionUID = 1L;

  private String code;

  private String message;

  private Object data;

  public SuccessWithData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SuccessWithData(String code, String message, Object data) {
    this.code = code;
    this.message = message;
    this.data = data;
  }

  public SuccessWithData code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Código de éxito
   * @return code
  */
  @NotNull 
  @Schema(name = "code", description = "Código de éxito", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SuccessWithData message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Mensaje de éxito
   * @return message
  */
  @NotNull 
  @Schema(name = "message", description = "Mensaje de éxito", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SuccessWithData data(Object data) {
    this.data = data;
    return this;
  }

  /**
   * Datos de la respuesta
   * @return data
  */
  @NotNull 
  @Schema(name = "data", description = "Datos de la respuesta", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessWithData successWithData = (SuccessWithData) o;
    return Objects.equals(this.code, successWithData.code) &&
        Objects.equals(this.message, successWithData.message) &&
        Objects.equals(this.data, successWithData.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessWithData {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

