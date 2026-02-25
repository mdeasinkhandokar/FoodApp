package com.example.FoodApp.cart.entity;

import com.example.FoodApp.auth_users.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="carts")
@Builder
@AllArgsConstructor
@NoArgsConstructor


public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;

    private List<CartItem>cartItems;

    private String promoCode;







}
