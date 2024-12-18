package com.betrybe.trybrecho.controller;

import com.betrybe.trybrecho.entity.Product;
import com.betrybe.trybrecho.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Product controller.
 */
@RestController
@RequestMapping("/products")
public class ProductController {
  ProductService productService;

  @Autowired
  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Product createProduct(@RequestBody Product newProduct) {
    return productService.create(newProduct);
  }

  @GetMapping("/{id}")
  public Product findProductById(
      @PathVariable("id") Long productId) {
    return productService.findById(productId);
  }
}
