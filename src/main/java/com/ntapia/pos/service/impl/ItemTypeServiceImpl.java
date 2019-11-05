package com.ntapia.pos.service.impl;

import com.ntapia.pos.domain.ItemType;
import com.ntapia.pos.dto.ItemTypeDto;
import com.ntapia.pos.repository.ItemTypeRepository;
import com.ntapia.pos.service.ItemTypeService;
import com.ntapia.pos.util.MapperUtil;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ItemTypeServiceImpl implements ItemTypeService {

  @Autowired
  private ItemTypeRepository repository;

  @Autowired
  private MapperUtil mapperUtil;

  @Override
  public ItemTypeDto save(ItemTypeDto object) {
    ItemType itemType = repository.save(mapperUtil.getMapper().map(object, ItemType.class));
    return mapperUtil.getMapper().map(itemType, ItemTypeDto.class);
  }

  public List<ItemTypeDto> findAll() {
    return StreamSupport
        .stream(repository.findAll(Sort.by("name").ascending()).spliterator(), false)
        .map(itemType -> mapperUtil.getMapper().map(itemType, ItemTypeDto.class))
        .collect(Collectors.toList());
  }
}
