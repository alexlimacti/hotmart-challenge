package com.hotmartchallenger.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String name;

    private String description;

    private LocalDate creationDate;

    private float score;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private ProductCategory productCategory;

}
