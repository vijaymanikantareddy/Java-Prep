package com.flm.service;

import com.flm.dto.ItemRequestDto;
import com.flm.dto.ItemResponseDto;

public interface ItemService {
	public ItemResponseDto save(ItemRequestDto itemRequestDto);

}
