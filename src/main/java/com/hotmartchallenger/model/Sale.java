package com.hotmartchallenger.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Sale implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @ManyToOne
    @JoinColumn(name = "salesman_id", referencedColumnName = "id")
    private Salesman salesman;

    @ManyToOne
    @JoinColumn(name = "purchaser_id", referencedColumnName = "id")
    private Purchaser purchaser;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    private Integer purchaserScore;

}
