package com.subhakar.spring.controller;

import com.subhakar.spring.model.GroceryItem;
import com.subhakar.spring.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class ItemController {
    private final ItemService itemService;

    @PostMapping("/items")
    public ResponseEntity<GroceryItem> saveItem(@RequestBody GroceryItem groceryItem) {
        return new ResponseEntity<>(itemService.saveGroceryItem(groceryItem), HttpStatus.CREATED);
    }

    @GetMapping("/items")
    public ResponseEntity<List<GroceryItem>> findItems() {
        return ResponseEntity.ok(itemService.getGroceryItems());
    }
}
