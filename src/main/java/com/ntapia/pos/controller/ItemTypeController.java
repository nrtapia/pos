package com.ntapia.pos.controller;

import com.ntapia.pos.dto.ItemTypeDto;
import com.ntapia.pos.service.ItemTypeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemTypeController {

  @Autowired
  private ItemTypeService itemTypeService;

  @PostMapping("/api/itemType")
  public ItemTypeDto save(@RequestBody ItemTypeDto itemTypeDto) {
    return itemTypeService.save(itemTypeDto);
  }

  @GetMapping("/api/itemType")
  public List<ItemTypeDto> findAll() {
    return itemTypeService.findAll();
  }
}
