package com.foodle.foodleserver.service.menu.dto.response;

import com.foodle.foodleserver.domain.menu.Menu;
import lombok.Getter;

import java.util.List;

@Getter
public class SearchMenuResponseDto {
    private String name;

    public static SearchMenuResponseDto of(Menu searchMenu) {
        return new SearchMenuResponseDto(searchMenu);
    }

    private SearchMenuResponseDto(Menu searchMenu) {
        this.name = searchMenu.getName();
    }
}
