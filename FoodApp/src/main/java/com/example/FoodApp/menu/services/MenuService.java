package com.example.FoodApp.menu.services;

import com.example.FoodApp.menu.dtos.MenuDTO;
import com.example.FoodApp.response.Response;
import jakarta.validation.Valid;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface MenuService {
        Response<MenuDTO> createMenu(MenuDTO menuDTO);


       Response<MenuDTO> updateMenu(MenuDTO menuDTO);


      Response<MenuDTO> getMenuById(Long id);


    Response<?> deleteMenu(Long id);

   Response<List<MenuDTO>> getMenus(Long categoryId, String search);
}
