package com.example.ecommerce.controller;

import com.example.ecommerce.entity.Item;
import com.example.ecommerce.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping("items")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("items/{id}")
    public Item getItemById(@PathVariable int id){
        return itemService.getItemById(id);
    }

    @PostMapping("items")
    public Item createItem(@RequestBody Item item){
        return itemService.createItem(item);
    }

    @PutMapping("items/{id}")
    public Item updateItem(@PathVariable int id, @RequestBody Item item){
        return itemService.updateItem(id, item);
    }
    @DeleteMapping("items/{id}")
    public void deleteItem(@PathVariable int id){
        itemService.deleteItem(id);
    }
}
