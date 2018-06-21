package org.example.simpleSpringMvcApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
	
	@Column(name = "name")
	String name;
	
	@Column(name = "lastName")
	String lastName;
	
	@Column(name = "birthday")
	Date date;
	
	@Column(name = "city")
	String city;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		
		User user = (User) o;
		
		if (name != null ? !name.equals(user.name) : user.name != null) return false;
		if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) return false;
		if (date != null ? !date.equals(user.date) : user.date != null) return false;
		return city != null ? city.equals(user.city) : user.city == null;
	}
	
	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
		result = 31 * result + (date != null ? date.hashCode() : 0);
		result = 31 * result + (city != null ? city.hashCode() : 0);
		return result;
	}
	
	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", lastName='" + lastName + '\'' +
				", date=" + date +
				", city='" + city + '\'' +
				", id=" + id +
				'}';
	}
}
