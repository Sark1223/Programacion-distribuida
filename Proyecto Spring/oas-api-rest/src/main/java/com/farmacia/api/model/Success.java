package com.farmacia.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Respuesta de éxito estándar
 */

@Schema(name = "Success", description = "Respuesta de éxito estándar")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-30T09:36:54.281473700-06:00[America/Mexico_City]")
public class Success implements Serializable {

  private static final long serialVersionUID = 1L;

  private String code;

  private String message;

  private JsonNullable<Object> data = JsonNullable.<Object>undefined();

  public Success() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Success(String code, String message) {
    this.code = code;
    this.message = message;
  }

  public Success code(String code) {
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

  public Success message(String message) {
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

  public Success data(Object data) {
    this.data = JsonNullable.of(data);
    return this;
  }

  /**
   * Datos de la respuesta
   * @return data
  */
  
  @Schema(name = "data", description = "Datos de la respuesta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public JsonNullable<Object> getData() {
    return data;
  }

  public void setData(JsonNullable<Object> data) {
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
    Success success = (Success) o;
    return Objects.equals(this.code, success.code) &&
        Objects.equals(this.message, success.message) &&
        equalsNullable(this.data, success.data);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, hashCodeNullable(data));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Success {\n");
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

