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
 * Error 401 - No autorizado
 */

@Schema(name = "Error401Unauthorized", description = "Error 401 - No autorizado")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-30T09:36:54.281473700-06:00[America/Mexico_City]")
public class Error401Unauthorized implements Serializable {

  private static final long serialVersionUID = 1L;

  private String code;

  private String message;

  @Valid
  private Map<String, Object> details = new HashMap<>();

  public Error401Unauthorized() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Error401Unauthorized(String code, String message) {
    this.code = code;
    this.message = message;
  }

  public Error401Unauthorized code(String code) {
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

  public Error401Unauthorized message(String message) {
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

  public Error401Unauthorized details(Map<String, Object> details) {
    this.details = details;
    return this;
  }

  public Error401Unauthorized putDetailsItem(String key, Object detailsItem) {
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
    Error401Unauthorized error401Unauthorized = (Error401Unauthorized) o;
    return Objects.equals(this.code, error401Unauthorized.code) &&
        Objects.equals(this.message, error401Unauthorized.message) &&
        Objects.equals(this.details, error401Unauthorized.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error401Unauthorized {\n");
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

