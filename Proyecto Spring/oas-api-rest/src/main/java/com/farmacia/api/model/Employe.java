package com.farmacia.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Employe
 */

@JsonTypeName("employe")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-30T09:36:54.281473700-06:00[America/Mexico_City]")
public class Employe implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer idEmploye;

  private Integer idPharmacy;

  private String name;

  private String lastName;

  private String phone;

  /**
   * Tipo de producto asociado (Cajero, Doctor)
   */
  public enum TypeEmployeEnum {
    CAJERO("Cajero"),
    
    DOCTOR("Doctor");

    private String value;

    TypeEmployeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEmployeEnum fromValue(String value) {
      for (TypeEmployeEnum b : TypeEmployeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEmployeEnum typeEmploye;

  public Employe() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Employe(Integer idEmploye, Integer idPharmacy, String name, String lastName, String phone, TypeEmployeEnum typeEmploye) {
    this.idEmploye = idEmploye;
    this.idPharmacy = idPharmacy;
    this.name = name;
    this.lastName = lastName;
    this.phone = phone;
    this.typeEmploye = typeEmploye;
  }

  public Employe idEmploye(Integer idEmploye) {
    this.idEmploye = idEmploye;
    return this;
  }

  /**
   * Get idEmploye
   * minimum: 1
   * maximum: 2147483647
   * @return idEmploye
  */
  @NotNull @Min(1) @Max(2147483647) 
  @Schema(name = "idEmploye", example = "123", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("idEmploye")
  public Integer getIdEmploye() {
    return idEmploye;
  }

  public void setIdEmploye(Integer idEmploye) {
    this.idEmploye = idEmploye;
  }

  public Employe idPharmacy(Integer idPharmacy) {
    this.idPharmacy = idPharmacy;
    return this;
  }

  /**
   * Llave foranea que referencia ID de la tabla pharmacy
   * minimum: 1
   * maximum: 2147483647
   * @return idPharmacy
  */
  @NotNull @Min(1) @Max(2147483647) 
  @Schema(name = "idPharmacy", example = "123", description = "Llave foranea que referencia ID de la tabla pharmacy", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("idPharmacy")
  public Integer getIdPharmacy() {
    return idPharmacy;
  }

  public void setIdPharmacy(Integer idPharmacy) {
    this.idPharmacy = idPharmacy;
  }

  public Employe name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull @Size(min = 3, max = 100) 
  @Schema(name = "name", example = "Bartolomeo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Employe lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @NotNull @Size(min = 3, max = 100) 
  @Schema(name = "lastName", example = "Lee", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Employe phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  @NotNull @Size(min = 10, max = 20) 
  @Schema(name = "phone", example = "4424568932", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Employe typeEmploye(TypeEmployeEnum typeEmploye) {
    this.typeEmploye = typeEmploye;
    return this;
  }

  /**
   * Tipo de producto asociado (Cajero, Doctor)
   * @return typeEmploye
  */
  @NotNull 
  @Schema(name = "typeEmploye", example = "Generico", description = "Tipo de producto asociado (Cajero, Doctor)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("typeEmploye")
  public TypeEmployeEnum getTypeEmploye() {
    return typeEmploye;
  }

  public void setTypeEmploye(TypeEmployeEnum typeEmploye) {
    this.typeEmploye = typeEmploye;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employe employe = (Employe) o;
    return Objects.equals(this.idEmploye, employe.idEmploye) &&
        Objects.equals(this.idPharmacy, employe.idPharmacy) &&
        Objects.equals(this.name, employe.name) &&
        Objects.equals(this.lastName, employe.lastName) &&
        Objects.equals(this.phone, employe.phone) &&
        Objects.equals(this.typeEmploye, employe.typeEmploye);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idEmploye, idPharmacy, name, lastName, phone, typeEmploye);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employe {\n");
    sb.append("    idEmploye: ").append(toIndentedString(idEmploye)).append("\n");
    sb.append("    idPharmacy: ").append(toIndentedString(idPharmacy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    typeEmploye: ").append(toIndentedString(typeEmploye)).append("\n");
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

