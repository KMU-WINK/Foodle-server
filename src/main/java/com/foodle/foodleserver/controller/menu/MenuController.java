package com.foodle.foodleserver.controller.menu;

import com.foodle.foodleserver.service.menu.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MenuController {
    private final MenuService menuService;

    @PostMapping("/menus/recommend-list")
    public RecommendResponseDto getRecommendMenus(@RequestBody RecommendRequestDto recommendRequestDto) {
        return menuService.getRecommendMenus(recommendRequestDto);
    }
}