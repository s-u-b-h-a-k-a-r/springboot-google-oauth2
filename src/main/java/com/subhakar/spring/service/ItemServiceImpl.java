package com.subhakar.spring.service;

import com.subhakar.spring.model.GroceryItem;
import com.subhakar.spring.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;

    @Override
    public List<GroceryItem> getGroceryItems() {
        return itemRepository.findAll();
    }

    @Override
    public GroceryItem saveGroceryItem(GroceryItem groceryItem) {
        return itemRepository.save(groceryItem);
    }
}
