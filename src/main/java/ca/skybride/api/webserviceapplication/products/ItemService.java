package ca.skybride.api.webserviceapplication.products;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ItemService {

	private static List<Item> items = new ArrayList<>();
	private static int itemCounter = 0;
	
	static {
		items.add(new Item(++itemCounter, "megaman", "retrogame", new Date(), true));
		items.add(new Item(++itemCounter, "contra", "retrogame and 2 player", new Date(), true));
		items.add(new Item(++itemCounter, "final fantasy", "rpg", new Date(), true));
	}
	
	public List<Item> findAll(){
		return items;
	}
}
