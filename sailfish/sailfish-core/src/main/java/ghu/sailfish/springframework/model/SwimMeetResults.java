package ghu.sailfish.springframework.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.JoinTable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Table(name="SWIMMEET_RESULTS")
public class SwimMeetResults implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SWIM_MEET_RESULT_ID")
	private long swimMeetResultId;

	public long getSwimMeetResultId() {
		return this.swimMeetResultId;
	}

	public void setSwimMeetResultId(long swimMeetResultId) {
		this.swimMeetResultId = swimMeetResultId;
	}
	
	@ManyToOne
	@JoinColumn(name="SWIMMEET_RESULTS_SWIMMER_FK")
	private Swimmer swimmer;
	
	public Swimmer getSwimmer() {
		return this.swimmer;
	}
	
	public void setSwimmer(Swimmer swimmer) {
		this.swimmer = swimmer;
	}
	
	@ManyToOne
	@JoinColumn(name="SWIMMEET_RESULTS_FK")
	private SwimMeet swimMeet;
	
	public SwimMeet getSwimMeet() {
		return this.swimMeet;
	}
	
	public void setSwimMeet(SwimMeet swimMeet) {
		this.swimMeet = swimMeet;
	}
	
	@Column(name="SWIMMER_MEET_AGE")
	private int meetAge;
	
	public int getMeetAge() {
		return this.meetAge;
	}
	public void setMeetAge(int meetAge) {
		this.meetAge = meetAge;
	}
	
	@OneToMany
	@JoinTable(name="SWIM_MEET_EVENT_RESULTS")
	private List<SwimEventResult> swimEventResult;
	
	public List<SwimEventResult> getSwimEventResult() {
		return this.swimEventResult;
	}
	
	public void setSwimEventResult(List<SwimEventResult> swimEventResult) {
		this.swimEventResult = swimEventResult;
	}
}

	
	

