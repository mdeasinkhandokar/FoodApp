package com.example.FoodApp.cart.service;

import com.example.FoodApp.cart.dtos.CartDTO;
import com.example.FoodApp.response.Response;
import org.jspecify.annotations.Nullable;

public interface CartService {
     Response<?> addIteamToCart(CartDTO cartDTO);

     Response<?> incrementItem(Long menuId);

    Response<?> decrementItem(Long menuId);

     Response<?> removeItem(Long cartItemId);

     Response<CartDTO> getShoppingCart();

     Response<?> clearShopping();
}
