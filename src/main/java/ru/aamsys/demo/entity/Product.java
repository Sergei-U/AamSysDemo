package ru.aamsys.demo.entity;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author Sergei Usov
 * @version 1.0.0
 */

@Entity
@Data
@Table(name = "PRODUCT")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "nameProduct")
    private String productName;

    @Column(name = "descriptionProduct")
    private String productDescription;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "category")
    private String productCategory;

    @Column(name = "price")
    private BigDecimal price;

}
