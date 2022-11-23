package com.foodle.foodleserver.service.menu.dto.response;

import lombok.Getter;

import java.util.List;

@Getter
public class RecommendMenuResponseDto {
    private List<String> recommendFood;

    public static RecommendMenuResponseDto of(List<String> recommendFood) {
        return new RecommendMenuResponseDto(recommendFood);
    }

    private RecommendMenuResponseDto(List<String> recommendFood) {
        this.recommendFood = recommendFood;
    }
}
