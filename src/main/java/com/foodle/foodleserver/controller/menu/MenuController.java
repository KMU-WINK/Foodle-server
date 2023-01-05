package com.foodle.foodleserver.controller.menu;

import com.foodle.foodleserver.controller.menu.dto.request.RecommendMenuRequestDto;
import com.foodle.foodleserver.controller.menu.dto.request.SearchMenuRequestDto;
import com.foodle.foodleserver.service.menu.MenuService;
import com.foodle.foodleserver.service.menu.dto.response.RecommendMenuResponseDto;
import com.foodle.foodleserver.service.menu.dto.response.SearchMenuResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MenuController {
    private final MenuService menuService;

    @PostMapping("/menus/recommend-list")
    public RecommendMenuResponseDto getRecommendMenus(@RequestBody RecommendMenuRequestDto recommendMenuRequestDto) {
        return menuService.getRecommendMenus(recommendMenuRequestDto);
    }

    @PostMapping("/menus/menu-list")
    public List<SearchMenuResponseDto> getSearchMenus(@RequestBody SearchMenuRequestDto searchMenuRequestDto){
        return menuService.getSearchMenus(searchMenuRequestDto);
    }
}