package ghu.sailfish.springframework.model;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: SwimmerMeetInfo
 *
 */
@Entity

public class SwimmerMeetInfo implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int entryId;

	public int getEntryId() {
		return this.entryId;
	}

	public void setEntryId(int entryID) {
		this.entryId = entryId;
	}
	
	
	private Swimmer swimmer;
	
	@ManyToOne
	public Swimmer getSwimmer() {
		return this.swimmer;
	}
	public void setSwimmer(Swimmer swimmer ) {
		this.swimmer = swimmer;
	}
	
	
	
	public SwimmerMeetInfo() {
		super();
	}
   
}
