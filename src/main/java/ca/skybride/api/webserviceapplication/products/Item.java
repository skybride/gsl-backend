package ca.skybride.api.webserviceapplication.products;

import java.util.Date;

public class Item {
	//Bean
	
	private long id;
	private String itemName;
	private String description;
	private Date targetDate;
	private boolean isSnaggable;

	public Item (long id, String itemName, String description, Date targetDate, boolean isSnaggable){
		super();
		this.id = id;
		this.itemName = itemName;
		this.description = description;
		this.targetDate = targetDate;
		this.isSnaggable = isSnaggable;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id){
		this.id = id;
	}
	
	public String getItemName(){
		return itemName;
	}
	
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public Date getTargetDate(){
		return targetDate;
	}
	
	public void setTargetDate(Date targetDate){
		this.targetDate = targetDate;
	}
	
	public boolean getIsSnaggable(){
		return isSnaggable;
	}
	
	public void setIsSnaggable(boolean isSnaggable){
		this.isSnaggable = isSnaggable;
	}
}
