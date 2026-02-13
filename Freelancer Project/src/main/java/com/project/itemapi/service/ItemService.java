package com.project.itemapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.itemapi.model.Item;

import java.util.ArrayList;
import java.util.List;


@Service
public class ItemService {

    private List<Item> itemList = new ArrayList<>();
    private Long idCounter = 1L;

    
    public Item addItem(Item item) {
        item.setId(idCounter++);
        itemList.add(item);
        return item;
    }

    
    public Item getItemById(Long id) {

        for (Item item : itemList) {
            if (item.getId().equals(id)) {
                return item;
            }
        }

        return null; 
    }
}

