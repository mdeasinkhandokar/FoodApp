package com.example.FoodApp.cart.controller;

import com.example.FoodApp.cart.dtos.CartDTO;
import com.example.FoodApp.cart.service.CartService;
import com.example.FoodApp.response.Response;
import com.stripe.model.tax.Registration;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;


    @PostMapping("/items")
    public ResponseEntity<Response<?>> addItemToCart(@RequestBody CartDTO cartDTO){
        return ResponseEntity.ok(cartService.addIteamToCart(cartDTO));
    }

    @PutMapping("/items/increment/{menuId}")
    public ResponseEntity<Response<?>>incrementItem(@PathVariable Long menuId){
        return ResponseEntity.ok(cartService.incrementItem(menuId));
    }

    @PutMapping("/items/increment/{menuId}")
    public ResponseEntity<Response<?>>decrementItem(@PathVariable Long menuId){
        return ResponseEntity.ok(cartService.decrementItem(menuId));
    }



    @PutMapping("/items/decrement/{menuId}")
    public ResponseEntity<Response<?>>removeItem(@PathVariable Long cartItemId){
        return ResponseEntity.ok(cartService.removeItem(cartItemId));

    }

    @GetMapping
    public ResponseEntity<Response<CartDTO>>getShoppingCart(){
        return ResponseEntity.ok(cartService.getShoppingCart());
    }

    @DeleteMapping
    public ResponseEntity<Response<?>>clearShoppingCart(){
        return ResponseEntity.ok(cartService.clearShopping());
    }








}
