package ca.skybride.api.webserviceapplication.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ca.skybride.api.webserviceapplication.products.Item;

@RestController
public class ProductResource {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/products")
	public List<Item> getAllItems(){
		return itemService.findAll();
	}

}
