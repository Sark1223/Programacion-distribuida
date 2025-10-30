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
 * SaleProduct
 */

@JsonTypeName("sale-product")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-30T09:36:54.281473700-06:00[America/Mexico_City]")
public class SaleProduct implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer saleId;

  private Integer productId;

  private Integer quantity;

  public SaleProduct() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SaleProduct(Integer saleId, Integer productId, Integer quantity) {
    this.saleId = saleId;
    this.productId = productId;
    this.quantity = quantity;
  }

  public SaleProduct saleId(Integer saleId) {
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

  public SaleProduct productId(Integer productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * minimum: 1
   * maximum: 2147483647
   * @return productId
  */
  @NotNull @Min(1) @Max(2147483647) 
  @Schema(name = "productId", example = "123", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("productId")
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public SaleProduct quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * minimum: 1
   * maximum: 9999
   * @return quantity
  */
  @NotNull @Min(1) @Max(9999) 
  @Schema(name = "quantity", example = "10", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaleProduct saleProduct = (SaleProduct) o;
    return Objects.equals(this.saleId, saleProduct.saleId) &&
        Objects.equals(this.productId, saleProduct.productId) &&
        Objects.equals(this.quantity, saleProduct.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saleId, productId, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleProduct {\n");
    sb.append("    saleId: ").append(toIndentedString(saleId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

