package com.foodle.foodleserver.service.menu;

import com.foodle.foodleserver.controller.menu.dto.request.RecommendMenuRequestDto;
import com.foodle.foodleserver.controller.menu.dto.request.SearchMenuRequestDto;
import com.foodle.foodleserver.domain.menu.Menu;
import com.foodle.foodleserver.domain.menu.MenuRepository;
import com.foodle.foodleserver.service.menu.dto.response.RecommendMenuResponseDto;
import com.foodle.foodleserver.service.menu.dto.response.SearchMenuResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository menuRepository;

    public RecommendMenuResponseDto getRecommendMenus(RecommendMenuRequestDto recommendMenuRequestDto) {

        // need model
        List<String> recommendFood = List.of(
                "치킨",
                "피자",
                "핫도그",
                "순댓국",
                "햄버거",
                "샌드위치",
                "돈까스",
                "닭갈비",
                "팝콘",
                "감자탕"
        );
        return RecommendMenuResponseDto.of(recommendFood);
    }

    public List<SearchMenuResponseDto> getSearchMenus(SearchMenuRequestDto searchMenuRequestDto) {
        String element = searchMenuRequestDto.getSeparatedElement();
        List<Menu> searchMenu = menuRepository.findByTitleLike(element);

        return searchMenu.stream()
                .map(SearchMenuResponseDto::of)
                .collect(Collectors.toList());
    }
}
