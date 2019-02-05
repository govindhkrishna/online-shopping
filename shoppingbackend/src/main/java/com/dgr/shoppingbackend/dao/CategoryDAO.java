package com.dgr.shoppingbackend.dao;

import java.util.List;

import com.dgr.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);	
	
}
