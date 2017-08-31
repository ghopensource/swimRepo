package ghu.sailfish.springframework.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;

/**
 * Entity implementation class for Entity: SwimMeet
 *
 */
@Entity

public class SwimMeet implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SWIM_MEET_ID")
	private int meetId;

	public int getMeetId() {
		return this.meetId;
	}

	public void setMeetId(int meetId) {
		this.meetId = meetId;
	}
	
	@Column(name="SWIM_MEET_NAME")
	private String meetName;
	
	public String getMeetName() {
		return this.meetName;
	}
	
	public void setMeetName(String meetName) {
		this.meetName = meetName;
	}
	
	@Column(name="SWIM_MEET_HOST")
	private String host;
	
	public String getHost() {
		return this.host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	
	@Column(name="SWIM_MEET_POOL_NAME")
	private String poolName;
	public String getPoolName() {
		return this.poolName;
	}
	public void setPoolName(String poolName) {
		this.poolName = poolName;
	}
	
	@ManyToOne
	@JoinColumn(name="SWIM_MEET_ADDRESS_FK")
	private Address swimMeetAddress;
	public Address getAddress() {
		return this.swimMeetAddress;
	}
	public void setAddress(Address swimMeetAddress) {
		this.swimMeetAddress = swimMeetAddress;
	}
	
	@Column(name="SWIM_MEET_START_DATE")
	private Date meetStartDate;
	public Date getMeetStartDate() {
		return this.meetStartDate;
	}
	public void setMeetStartDate(Date meetStartDate) {
		this.meetStartDate = meetStartDate;
	}
	
	@Column(name="SWIM_MEET_END_DATE")
	private Date meetEndDate;
	public Date getMeetEndDate() {
		return this.meetEndDate;
	}
	public void setMeetEndDate(Date meetEndDate) {
		this.meetEndDate = meetEndDate;
	}

	@Column(name="SWIM_COURSE")
	//possible valus: SCY, SCM, LCM
	private String course;
	
	public String getCourse() {
		return this.course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public SwimMeet() {
		super();
	}
   
}
