package ghu.sailfish.springframework.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Entity implementation class for Entity: SwimEvent
 *
 */
@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames={"SWIM_DISTANCE_FK", "SWIM_STROKE_FK", "SWIM_COURSE"}))
public class SwimEvent implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SWIM_EVENT_ID")
	private int eventId;

	public int getEventId() {
		return this.eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	
	@ManyToOne
	@JoinColumn(name="SWIM_DISTANCE_FK")
	private SwimDistance distance;
	
	
	public SwimDistance getDistance() {
		return this.distance;
	}
	public void setDistance(SwimDistance distance) {
		this.distance = distance;
	}
	
	@ManyToOne
	@JoinColumn(name="SWIM_STROKE_FK")
	private SwimStroke stroke;
	
	public SwimStroke getStroke() {
		return this.stroke;
	}
	public void setStroke(SwimStroke stroke) {
		this.stroke = stroke;
	}
	
	@Column(name="SWIM_COURSE")
	private String course;
	
	public String getCourse() {
		return this.course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
	public SwimEvent() {
		super();
	}	
   
}
