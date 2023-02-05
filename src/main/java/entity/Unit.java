package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.id.UUIDHexGenerator;

@Entity
public class Unit {
	@Id
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDHexGenerator")
	@GeneratedValue(generator = "uuid")
	private String id;
	private String name;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
