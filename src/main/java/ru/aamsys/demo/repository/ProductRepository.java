package ru.aamsys.demo.repository;


import org.springframework.data.repository.CrudRepository;
import ru.aamsys.demo.entity.Product;

import java.util.Optional;

/**
 * @author Sergei Usov
 * @version 1.0.0
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

    Optional<Product> findByProductName(String productName);

}
