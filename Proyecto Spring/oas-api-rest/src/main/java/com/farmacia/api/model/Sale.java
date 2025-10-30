package com.farmacia.api.model;

import java.net.URI;
import java.util.Objects;
import com.farmacia.api.model.SaleProduct;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Sale
 */

@JsonTypeName("sale")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-30T09:36:54.281473700-06:00[America/Mexico_City]")
public class Sale implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer saleId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime saleDate;

  private Double subTotal;

  private Double iva;

  private Double total;

  private Integer pharmacyId;

  private Integer employeId;

  @Valid
  private List<@Valid SaleProduct> products = new ArrayList<>();

  public Sale() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Sale(Integer saleId, OffsetDateTime saleDate, Double subTotal, Double iva, Double total, Integer pharmacyId, Integer employeId, List<@Valid SaleProduct> products) {
    this.saleId = saleId;
    this.saleDate = saleDate;
    this.subTotal = subTotal;
    this.iva = iva;
    this.total = total;
    this.pharmacyId = pharmacyId;
    this.employeId = employeId;
    this.products = products;
  }

  public Sale saleId(Integer saleId) {
    this.saleId = saleId;
    return this;
  }

  /**
   * Get saleId
   * minimum: 1
   * maximum: 2147483647
   * @return saleId
  */
  @NotNull @Min(1) @Max(2147483647) 
  @Schema(name = "saleId", example = "123", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("saleId")
  public Integer getSaleId() {
    return saleId;
  }

  public void setSaleId(Integer saleId) {
    this.saleId = saleId;
  }

  public Sale saleDate(OffsetDateTime saleDate) {
    this.saleDate = saleDate;
    return this;
  }

  /**
   * Get saleDate
   * @return saleDate
  */
  @NotNull @Valid @Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4} ([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$") @Size(min = 19, max = 19) 
  @Schema(name = "saleDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("saleDate")
  public OffsetDateTime getSaleDate() {
    return saleDate;
  }

  public void setSaleDate(OffsetDateTime saleDate) {
    this.saleDate = saleDate;
  }

  public Sale subTotal(Double subTotal) {
    this.subTotal = subTotal;
    return this;
  }

  /**
   * Get subTotal
   * @return subTotal
  */
  @NotNull 
  @Schema(name = "subTotal", example = "22222.1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subTotal")
  public Double getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(Double subTotal) {
    this.subTotal = subTotal;
  }

  public Sale iva(Double iva) {
    this.iva = iva;
    return this;
  }

  /**
   * Get iva
   * @return iva
  */
  @NotNull 
  @Schema(name = "iva", example = "3555.54", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("iva")
  public Double getIva() {
    return iva;
  }

  public void setIva(Double iva) {
    this.iva = iva;
  }

  public Sale total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  */
  @NotNull 
  @Schema(name = "total", example = "25777.64", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("total")
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public Sale pharmacyId(Integer pharmacyId) {
    this.pharmacyId = pharmacyId;
    return this;
  }

  /**
   * ID de la farmacia donde se realizó la venta
   * minimum: 1
   * maximum: 2147483647
   * @return pharmacyId
  */
  @NotNull @Min(1) @Max(2147483647) 
  @Schema(name = "pharmacyId", example = "123", description = "ID de la farmacia donde se realizó la venta", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pharmacyId")
  public Integer getPharmacyId() {
    return pharmacyId;
  }

  public void setPharmacyId(Integer pharmacyId) {
    this.pharmacyId = pharmacyId;
  }

  public Sale employeId(Integer employeId) {
    this.employeId = employeId;
    return this;
  }

  /**
   * ID del empleado que realizó la venta
   * minimum: 1
   * maximum: 2147483647
   * @return employeId
  */
  @NotNull @Min(1) @Max(2147483647) 
  @Schema(name = "employeId", example = "123", description = "ID del empleado que realizó la venta", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employeId")
  public Integer getEmployeId() {
    return employeId;
  }

  public void setEmployeId(Integer employeId) {
    this.employeId = employeId;
  }

  public Sale products(List<@Valid SaleProduct> products) {
    this.products = products;
    return this;
  }

  public Sale addProductsItem(SaleProduct productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

  /**
   * Get products
   * @return products
  */
  @NotNull @Valid 
  @Schema(name = "products", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("products")
  public List<@Valid SaleProduct> getProducts() {
    return products;
  }

  public void setProducts(List<@Valid SaleProduct> products) {
    this.products = products;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sale sale = (Sale) o;
    return Objects.equals(this.saleId, sale.saleId) &&
        Objects.equals(this.saleDate, sale.saleDate) &&
        Objects.equals(this.subTotal, sale.subTotal) &&
        Objects.equals(this.iva, sale.iva) &&
        Objects.equals(this.total, sale.total) &&
        Objects.equals(this.pharmacyId, sale.pharmacyId) &&
        Objects.equals(this.employeId, sale.employeId) &&
        Objects.equals(this.products, sale.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saleId, saleDate, subTotal, iva, total, pharmacyId, employeId, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sale {\n");
    sb.append("    saleId: ").append(toIndentedString(saleId)).append("\n");
    sb.append("    saleDate: ").append(toIndentedString(saleDate)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    iva: ").append(toIndentedString(iva)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    pharmacyId: ").append(toIndentedString(pharmacyId)).append("\n");
    sb.append("    employeId: ").append(toIndentedString(employeId)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

