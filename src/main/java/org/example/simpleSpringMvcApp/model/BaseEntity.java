package org.example.simpleSpringMvcApp.model;


import javax.persistence.*;

@MappedSuperclass
public class BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Integer id;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		BaseEntity that = (BaseEntity) o;
		
		return id != null ? id.equals(that.id) : that.id == null;
	}
	
	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}
	
	@Override
	public String toString() {
		return "BaseEntity{" +
				"id=" + id +
				'}';
	}
}
