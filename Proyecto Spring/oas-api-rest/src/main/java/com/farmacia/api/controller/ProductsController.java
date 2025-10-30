package com.farmacia.api.controller;

import java.util.List;

import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmacia.api.model.Error400BadRequest;
import com.farmacia.api.model.Product;
import com.farmacia.api.model.ProductPatch;
import com.farmacia.api.model.Success;
import com.farmacia.api.model.SuccessWithData;
import com.farmacia.api.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
@Validated
public class ProductsController {

    @Autowired
    private ProductService productService;
        
    @GetMapping("/products")
    public ResponseEntity<SuccessWithData> getProducts() {
        System.out.println("Controller - Entrada a obtener productos");
        
        List<Product> products = productService.getProducts();
        
        SuccessWithData response = new SuccessWithData();
        response.setCode("PRODUCTS_RETRIEVED");
        response.setMessage("Lista de productos obtenida exitosamente");
        response.setData(products);
    
        return ResponseEntity.ok(response);
    }

    @PostMapping("/products")
    public ResponseEntity<Success> createProduct(@Valid @RequestBody Product productRequest) {
        System.out.println("Controller - Producto recibido: " + productRequest);
        
        Product savedProduct = productService.createProduct(productRequest);
        
        Success response = new Success();
        response.setCode("PRODUCT_CREATED");
        response.setMessage("Producto creado exitosamente");
        response.setData(JsonNullable.of(savedProduct));
    
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Object> putProduct(@PathVariable Integer id, @Valid @RequestBody Product productRequest) {
        System.out.println("Controller - Producto recibido: " + productRequest);

        // Validación del ID
        if (id == null || id < 1 || id > 999999) {
            Error400BadRequest errorResponse = new Error400BadRequest();
            errorResponse.setCode("INVALID_PRODUCT_ID");
            errorResponse.setMessage("El ID del producto es inválido. Debe estar entre 1 y 999999.");
            errorResponse.putDetailsItem("invalidId", id);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
        
        Product updatedProduct = productService.updateProduct(id, productRequest);
        
        Success response = new Success();
        response.setCode("PRODUCT_UPDATED");
        response.setMessage("Producto actualizado exitosamente");
        response.setData(JsonNullable.of(updatedProduct));
        
        return ResponseEntity.ok(response);
    }

    @PatchMapping("/products/{id}")
    public ResponseEntity<Object> patchProduct(@PathVariable Integer id, @Valid @RequestBody ProductPatch productRequest) {
        System.out.println("Controller - Información recibida: " + productRequest);
        
        // Validación del ID
        if (id == null || id < 1 || id > 999999) {
            Error400BadRequest errorResponse = new Error400BadRequest();
            errorResponse.setCode("INVALID_PRODUCT_ID");
            errorResponse.setMessage("El ID del producto es inválido. Debe estar entre 1 y 999999.");
            errorResponse.putDetailsItem("invalidId", id);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
        
        Product patchedProduct = productService.patchProduct(id, productRequest);
        
        Success response = new Success();
        response.setCode("PRODUCT_PATCHED");
        response.setMessage("Producto actualizado parcialmente exitosamente");
        response.setData(JsonNullable.of(patchedProduct));
    
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Object> deleteProduct(@PathVariable Integer id) {
        System.out.println("Controller - Información recibida: " + id);
        
        // Validación del ID
        if (id == null || id < 1 || id > 999999) {
            Error400BadRequest errorResponse = new Error400BadRequest();
            errorResponse.setCode("INVALID_PRODUCT_ID");
            errorResponse.setMessage("El ID del producto es inválido. Debe estar entre 1 y 999999.");
            errorResponse.putDetailsItem("invalidId", id);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
        
        String deletionResult = productService.deleteProduct(id);
        
        Success response = new Success();
        response.setCode("PRODUCT_DELETED");
        response.setMessage("Producto eliminado exitosamente");
        response.setData(JsonNullable.of(deletionResult));
    
        return ResponseEntity.ok(response);
    }
}