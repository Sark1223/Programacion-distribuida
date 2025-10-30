package com.farmacia.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Pharmacy
 */

@JsonTypeName("pharmacy")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-30T09:36:54.281473700-06:00[America/Mexico_City]")
public class Pharmacy implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer idPharmacy;

  private String name;

  private String address;

  public Pharmacy() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Pharmacy(Integer idPharmacy, String name, String address) {
    this.idPharmacy = idPharmacy;
    this.name = name;
    this.address = address;
  }

  public Pharmacy idPharmacy(Integer idPharmacy) {
    this.idPharmacy = idPharmacy;
    return this;
  }

  /**
   * Get idPharmacy
   * minimum: 1
   * maximum: 2147483647
   * @return idPharmacy
  */
  @NotNull @Min(1) @Max(2147483647) 
  @Schema(name = "idPharmacy", example = "123", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("idPharmacy")
  public Integer getIdPharmacy() {
    return idPharmacy;
  }

  public void setIdPharmacy(Integer idPharmacy) {
    this.idPharmacy = idPharmacy;
  }

  public Pharmacy name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull @Size(min = 10, max = 30) 
  @Schema(name = "name", example = "Farmacia corazon", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Pharmacy address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @NotNull @Size(min = 20, max = 50) 
  @Schema(name = "address", example = "Calle Rosales #65", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pharmacy pharmacy = (Pharmacy) o;
    return Objects.equals(this.idPharmacy, pharmacy.idPharmacy) &&
        Objects.equals(this.name, pharmacy.name) &&
        Objects.equals(this.address, pharmacy.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPharmacy, name, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pharmacy {\n");
    sb.append("    idPharmacy: ").append(toIndentedString(idPharmacy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

