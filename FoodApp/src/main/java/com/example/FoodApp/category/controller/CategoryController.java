package com.example.FoodApp.category.controller;

import com.example.FoodApp.category.dtos.CategoryDTO;
import com.example.FoodApp.category.services.CategoryService;
import com.example.FoodApp.response.Response;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<Response<CategoryDTO>> addCategory(@RequestBody @Valid CategoryDTO categoryDTO){
        return ResponseEntity.ok(categoryService.addCategory(categoryDTO));
    }


    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<Response<CategoryDTO>>updateCategory(@RequestBody CategoryDTO categoryDTO)







    }




}
