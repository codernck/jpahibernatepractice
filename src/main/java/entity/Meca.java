package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@Table(name = "meca")
public class Meca {
	@Id
	// allocationSize is the interval with which to increment
	// default allocationSize is 50
	@TableGenerator(name = "meca_keygen",
		table = "meca_keygen",
		pkColumnName = "key_name",
		pkColumnValue = "item_seq",
		valueColumnName = "key_value",
		initialValue = 1000,
		allocationSize = 1
	)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "meca_keygen")
	private Integer id;
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
