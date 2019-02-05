package com.dgr.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dgr.shoppingbackend.dao.CategoryDAO;
import com.dgr.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some category of Televison");
		category.setImageURL("CAT_1.png");
		
		categories.add(category); 
		
		//second category
		category = new Category();
		category.setId(1);
		category.setName("Mobile");
		category.setDescription("This is some category of Mobile");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		//adding third category
		category = new Category();
		category.setId(1);
		category.setName("Laptop");
		category.setDescription("This is some category of Laptop");
		category.setImageURL("CAT_3.png");
		
		categories.add(category); 
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
//enhanced for loop
		for(Category category : categories) {
			if(category.getId()==id) return category;
		}
		return null;
	}

}
