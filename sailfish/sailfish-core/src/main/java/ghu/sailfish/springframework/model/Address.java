package ghu.sailfish.springframework.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="ADDRESS")
public class Address implements Serializable{
	private static final long serialVersionUID = 1L;

	public Address() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ADDRESS_ID")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	private String streetInfo;
	
	@Column(name="STREET_INFO")
	public String getStreetInfo() {
		return streetInfo;
	}

	public void setStreetInfo(String streetInfo) {
		this.streetInfo = streetInfo;
	}

	@Column(name="CITY")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	@Column(name="STATE")
	public void setState(String state) {
		this.state = state;
	}

	private String city;
	private String state;

}
