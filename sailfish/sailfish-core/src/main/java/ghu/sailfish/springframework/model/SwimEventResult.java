package ghu.sailfish.springframework.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.ManyToOne;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name="SWIMEVENT_RESULT")
public class SwimEventResult implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SWIM_EVENT_RESULT_ID")
	private long swimEventResultId;

	public long getSwimEventResultId() {
		return this.swimEventResultId;
	}

	public void setSwimEventResultId(long swimEventResultId) {
		this.swimEventResultId = swimEventResultId;
	}
	
	@ManyToOne
	@JoinColumn(name="SWIM_EVENT_FK")
	private SwimEvent swimEvent;
	
	public SwimEvent getSwimEvent() {
		return this.swimEvent;
	}
	
	public void setSwimEvent(SwimEvent swimEvent) {
		this.swimEvent = swimEvent;
	}
	
	@Column(name="SWIM_MEET_EVENT_DATE")
	private Date eventDate;
	public Date getEventDate() {
		return this.eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	
	@Column(name="SWIM_MEET_EVENT_TRIAL_TIME", precision=2)
	private Time trialTiime;
	
	public Time getTrialTime() {
		return this.trialTiime;
	}
	
	public void setTrialTime(Time trialTime) {
		this.trialTiime = trialTime;
	}
	
	@Column(name="SWIM_MEET_EVENT_PRELIM_TIME", precision=2)
	private Time prelimTiime;
	
	public Time getPrelimTime() {
		return this.prelimTiime;
	}
	public void setPrelimTime(Time prelimTime) {
		this.prelimTiime = prelimTime;
	}

	@Column(name="SWIM_MEET_EVENT_FINAL_TIME", precision=2)
	private Time finalTiime;
	
	public Time getFinalTime() {
		return this.finalTiime;
	}
	public void setFinalTime(Time finalTime) {
		this.finalTiime = finalTime;
	}
	
	@Column(name="SWIM_MEET_EVENT_POSITION")
	private int eventPosition;
	
	public int getEventPosition() {
		return this.eventPosition;
	}
	public void setEventPosition(int eventPosition) {
		this.eventPosition = eventPosition;
	}
	
	@Column(name="SEIM_MEET_EVENT_POINTS")
	private double eventPoints;
	
	public double getEventPoints() {
		return this.eventPoints;
	}
	public void setEventPoints(double eventPoints) {
		this.eventPoints = eventPoints;
	}
	
	@Column(name="SWIM_MEET_EVENT_POWERPOINTS")
	private int powerPoints;
	
	public int getPowerPoints() {
		return this.powerPoints;
	}
	public void setPowerPoints(int powerPoints) {
		this.powerPoints = powerPoints;
	}
	
	
	public String getTimeString(Time time) throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(time.getTime());
		StringBuilder sb = new StringBuilder();
		int hour = cal.get(Calendar.HOUR);
		System.out.println("hour: "+hour);
		int min = cal.get(Calendar.MINUTE);
		System.out.println("min: "+min);
		int second = cal.get(Calendar.SECOND);
		System.out.println("second: "+second);
		int mills = cal.get(Calendar.MILLISECOND);
		System.out.println("millisecond: "+mills);
		boolean isTheFirst = true;
		
		if(hour>0) {
			sb.append(hour);
			sb.append(":");			
			isTheFirst = false;
		}		
		isTheFirst = formatTimeString(sb, isTheFirst, min, ':');
		isTheFirst = formatTimeString(sb, isTheFirst, second, '.');
		formatTimeString(sb, isTheFirst, mills, ' ');		
		return sb.toString();		
		
	}
	
	private boolean formatTimeString(StringBuilder sb, boolean isTheFirst, int t, char delim) {
		if(!isTheFirst) {
			if(t>0) {
				if(t>=10) {
					sb.append(t);
				}else {
					sb.append("0");
					sb.append(t);
				}
			} else {
				sb.append("00");
			}
			if(delim != ' ') {
				sb.append(delim);
			}
			
		} else {
			if(delim != ' ') {
				if(t>0) {
					sb.append(t);
					sb.append(delim);
					isTheFirst = false;
				}
			}else {
				sb.append(t);
			}			
		}
		return isTheFirst;
	}
	
	
}
