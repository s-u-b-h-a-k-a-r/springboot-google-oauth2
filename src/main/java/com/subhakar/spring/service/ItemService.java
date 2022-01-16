package com.subhakar.spring.service;

import com.subhakar.spring.model.GroceryItem;

import java.util.List;

public interface ItemService {
    List<GroceryItem> getGroceryItems();

    GroceryItem saveGroceryItem(GroceryItem groceryItem);
}
