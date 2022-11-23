package com.foodle.foodleserver.service.menu.dto.response;

import lombok.Getter;

import java.util.List;

@Getter
public class MenuResponseDto {
    private List<String> recommendFood;

    public static MenuResponseDto of(List<String> recommendFood) {
        return new MenuResponseDto(recommendFood);
    }

    private MenuResponseDto(List<String> recommendFood) {
        this.recommendFood = recommendFood;
    }
}
