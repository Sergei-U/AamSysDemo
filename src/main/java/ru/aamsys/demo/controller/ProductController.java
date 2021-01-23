package ru.aamsys.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.aamsys.demo.entity.Product;
import ru.aamsys.demo.entity.SearchQuery;
import ru.aamsys.demo.service.ProductService;

/**
 * @author Sergei Usov
 * @version 1.0.0
 */
@RestController
@RequestMapping(value = "/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addProduct(@RequestBody Product product) {
        this.productService.addProduct(product);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void deleteProduct(@RequestBody Product product) {
        this.productService.deleteProduct(product);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public void editProduct(@RequestBody Product product) {
        this.productService.editProduct(product);
    }

    @RequestMapping(value = "/findByName", method = RequestMethod.POST)
    public void findProduct(@RequestBody SearchQuery searchQuery) {
        this.productService.findProductByName(searchQuery);

    }
}
