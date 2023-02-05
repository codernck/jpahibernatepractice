package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * this is to demonstrate the generation-type table
 * but here the column names are standard default 
 * @author kiran
 *
 */
@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "order_keygen")
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
