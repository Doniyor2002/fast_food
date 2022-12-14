package com.example.adminservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DiscountDto {

    private String nameUz;
    private String nameRu;
    @NotNull
    private Double percentage;
    @NotNull
    private List<Long> productsId;

}
