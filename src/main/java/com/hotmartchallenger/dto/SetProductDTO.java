package com.hotmartchallenger.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SetProductDTO {

    private Long id;

    private String name;

    private String description;

    private LocalDate creationDate;

    private float score;

    private Long category;

}
