package com.hotmartchallenger.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long totalResults;

    private LocalDate newsDate;

    private LocalTime updateAt;

    @ManyToOne
    @JoinColumn(name = "product_category_id")
    private ProductCategory productCategory;
}
