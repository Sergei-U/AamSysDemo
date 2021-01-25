package ru.aamsys.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.aamsys.demo.entity.Product;
import ru.aamsys.demo.entity.SearchQuery;
import ru.aamsys.demo.repository.ProductRepository;

import java.util.Optional;

/**
 * @author Sergei Usov
 * @version 1.0.0
 */
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public void addProduct(Product product) {
        this.productRepository.save(product);
    }

    public void deleteProduct(Product product) {
        this.productRepository.delete(product);
    }

    public void editProduct(Product product) {
        this.productRepository.save(product);
    }

    public Optional<Product> findProductByName(SearchQuery searchQuery) {
        Optional<Product> product = this.productRepository.findByProductName(searchQuery.getProductName());
        if (product.isEmpty()) {
            product = this.productRepository.findById(searchQuery.getId());
        }
        return product;
    }

}
