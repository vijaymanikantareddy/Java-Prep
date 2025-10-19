package com.flm.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flm.dto.ItemRequestDto;
import com.flm.dto.ItemResponseDto;
import com.flm.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {

	private final ItemService itemService;

	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}

	@PostMapping("/save")
	public ItemResponseDto saveItem(@RequestBody ItemRequestDto itemRequestDto) {
		return itemService.save(itemRequestDto);
	}
}
