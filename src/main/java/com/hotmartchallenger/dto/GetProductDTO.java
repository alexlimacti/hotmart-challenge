package com.hotmartchallenger.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class GetProductDTO {

    private Long id;

    private String name;

    private String description;

    private LocalDate creationDate;

    private float score;

    private String category;

}
