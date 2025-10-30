package com.farmacia.api.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.farmacia.api.model.Product;
import com.farmacia.api.model.Product.ProductTypeEnum;
import com.farmacia.api.model.ProductPatch;

@Service
public class ProductService {

    // Lista simulada de productos (en una aplicación real esto vendría de una base de datos)
    private List<Product> products = Arrays.asList(
        new Product(1, ProductTypeEnum.GENERICO, "Paracetamol", 50.50),
        new Product(55, ProductTypeEnum.GENERICO, "Jarabe Broncolin", 130.22),
        new Product(302, ProductTypeEnum.PRESCRITO, "Amoxicilina", 160.00),
        new Product(2, ProductTypeEnum.GENERICO, "Ibuprofeno", 50.50)
    );

    public List<Product> getProducts() {
        System.out.println("Service - Buscando todos los productos...");
        return products;
    }
    
    public Product createProduct(Product product) {
        System.out.println("Service - Creando producto: " + product);
        // En una aplicación real, aquí guardarías en la base de datos
        // Simulamos que se asignó un ID automático
        if (product.getProductId() == null) {
            // Generar un ID simulado
            int newId = products.stream()
                .mapToInt(Product::getProductId)
                .max()
                .orElse(0) + 1;
            product.setProductId(newId);
        }
        return product;
    }

    public Product updateProduct(Integer id, Product product) {
        System.out.println("Service - Actualizando producto ID " + id + ": " + product);
        
        // Buscar si el producto existe
        Optional<Product> existingProductOpt = products.stream()
            .filter(p -> p.getProductId().equals(id))
            .findFirst();
            
        if (existingProductOpt.isPresent()) {
            // En una aplicación real, aquí actualizarías en la base de datos
            // Por ahora, simulamos la actualización estableciendo el ID
            product.setProductId(id);
            return product;
        } else {
            // Si no existe, crear uno nuevo con el ID proporcionado
            product.setProductId(id);
            return product;
        }
    }

    public Product patchProduct(Integer id, ProductPatch productPatch) {
        System.out.println("Service - Actualizando parcialmente producto ID " + id + ": " + productPatch);
        
        // Buscar el producto existente
        Optional<Product> existingProductOpt = products.stream()
            .filter(p -> p.getProductId().equals(id))
            .findFirst();
            
        if (existingProductOpt.isPresent()) {
            Product existingProduct = existingProductOpt.get();
            
            // Aplicar los cambios del patch
            if (productPatch.getPrice() != null) {
                existingProduct.setPrice(productPatch.getPrice());
            }
            if (productPatch.getDescription() != null) {
                existingProduct.setDescription(productPatch.getDescription());
            }
            
            return existingProduct;
        }
        
        // Si no existe, crear uno nuevo básico
        Product newProduct = new Product();
        newProduct.setProductId(id);
        newProduct.setProductType(ProductTypeEnum.GENERICO); // Valor por defecto
        newProduct.setName("Producto " + id); // Valor por defecto
        newProduct.setPrice(0.0); // Valor por defecto
        
        if (productPatch.getPrice() != null) {
            newProduct.setPrice(productPatch.getPrice());
        }
        if (productPatch.getDescription() != null) {
            newProduct.setDescription(productPatch.getDescription());
        }
        
        return newProduct;
    }

    public String deleteProduct(Integer id) {
        System.out.println("Service - Eliminando producto ID: " + id);
        
        // Buscar si el producto existe
        boolean exists = products.stream().anyMatch(p -> p.getProductId().equals(id));
        
        if (exists) {
            // En una aplicación real, aquí eliminarías de la base de datos
            return "Producto con ID " + id + " eliminado correctamente";
        } else {
            return "Producto con ID " + id + " no encontrado";
        }
    }
}