package com.ntapia.pos.service;

import com.ntapia.pos.dto.ItemTypeDto;
import java.util.List;

public interface ItemTypeService extends CrudService<ItemTypeDto> {

  List<ItemTypeDto> findAll();

}
