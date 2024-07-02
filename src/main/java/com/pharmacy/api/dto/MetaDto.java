package com.pharmacy.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MetaDto {

    @JsonProperty("total_count") // Json으로 응답 받을 때 현재 매핑된 필드와 매핑시켜주는 어노테이션
    private Integer totalCount;
}
