package ghu.sailfish.springframework.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: SwimStroke
 *
 */
@Entity

public class SwimStroke implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="STROKE_ID")
	private int strokeId;

	public int getStrokeId() {
		return this.strokeId;
	}

	public void setStrokeId(int strokeId) {
		this.strokeId = strokeId;
	}

	@Column(name="STROKE_FULL_NAME")
	private String strokeFullName;
	
	public String getStrokeFullName() {
		return this.strokeFullName ;
	}
	public void setStrokeFullName(String strokeFullName) {
		this.strokeFullName = strokeFullName;
	}
	
	@NotNull
	@Column(name="STROKE_SHORT_NAME")
	private String strokeShortName;
	
	public String getStrokeShortName() {
		return this.strokeShortName ;
	}
	public void setStrokeShortName(String strokeShortName) {
		this.strokeShortName = strokeShortName;
	}
	
	
	public SwimStroke() {
		super();
	}
   
}
