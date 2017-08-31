package ghu.sailfish.springframework.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.URL;

/**
 * Entity implementation class for Entity: LSC
 *
 */
@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames="LSC_NAME"))
public class LSC implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public LSC() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="LSC_ID")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
   
	@NotNull
	//@Pattern(regexp = "[A-Za-z]*", message = "must contain only letters")
	@Column(name="LSC_NAME", unique=true)
	private String lscName;

	public String getLscName() {
		return lscName;
	}

	public void setLscName(String lscName) {
		this.lscName = lscName;
	}
	
	@NotNull
	//@Pattern(regexp = "[A-Za-z]*", message = "must contain only letters")
	@Column(name="LSC_CODE", unique=true)
	private String lscCode;

	public String getLscCode() {
		return this.lscCode;
	}

	public void setLscCode(String lscCode) {
		this.lscCode = lscCode;
	}
	
	@Column(name="LSC_WEBSITE")
	@URL
	private String lscWebSite;
	
	public String getLscWebSite() {
		return this.lscWebSite;
	}
	
	public void setLscWebSite(String lscWebSite) {
		this.lscWebSite = lscWebSite;
	}
}