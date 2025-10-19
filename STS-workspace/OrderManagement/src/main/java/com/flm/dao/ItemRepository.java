package com.flm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flm.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
