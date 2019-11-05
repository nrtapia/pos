package com.ntapia.pos.repository;

import com.ntapia.pos.domain.ItemType;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ItemTypeRepository extends PagingAndSortingRepository<ItemType, String> {

}
