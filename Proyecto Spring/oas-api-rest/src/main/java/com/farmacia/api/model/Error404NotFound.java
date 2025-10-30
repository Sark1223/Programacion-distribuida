package com.farmacia.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Error 404 - No encontrado
 */

@Schema(name = "Error404NotFound", description = "Error 404 - No encontrado")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-30T09:36:54.281473700-06:00[America/Mexico_City]")
public class Error404NotFound implements Serializable {

  private static final long serialVersionUID = 1L;

  private String code;

  private String message;

  @Valid
  private Map<String, Object> details = new HashMap<>();

  public Error404NotFound() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Error404NotFound(String code, String message) {
    this.code = code;
    this.message = message;
  }

  public Error404NotFound code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Código de error
   * @return code
  */
  @NotNull 
  @Schema(name = "code", example = "INVALID_CLIENT_ID", description = "Código de error", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error404NotFound message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Mensaje de error
   * @return message
  */
  @NotNull 
  @Schema(name = "message", example = "El ID del cliente debe ser entero numerico", description = "Mensaje de error", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error404NotFound details(Map<String, Object> details) {
    this.details = details;
    return this;
  }

  public Error404NotFound putDetailsItem(String key, Object detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

  /**
   * Detalles adicionales del error
   * @return details
  */
  
  @Schema(name = "details", description = "Detalles adicionales del error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public Map<String, Object> getDetails() {
    return details;
  }

  public void setDetails(Map<String, Object> details) {
    this.details = details;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error404NotFound error404NotFound = (Error404NotFound) o;
    return Objects.equals(this.code, error404NotFound.code) &&
        Objects.equals(this.message, error404NotFound.message) &&
        Objects.equals(this.details, error404NotFound.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error404NotFound {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

