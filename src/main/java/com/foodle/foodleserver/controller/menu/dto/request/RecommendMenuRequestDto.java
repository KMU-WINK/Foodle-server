package com.foodle.foodleserver.controller.menu.dto.request;

import lombok.Getter;

import java.util.List;

@Getter
public class RecommendMenuRequestDto {
    private String description;

    private List<String> hateFood;

    private List<String> nation;

    private List<String> etc;
}
