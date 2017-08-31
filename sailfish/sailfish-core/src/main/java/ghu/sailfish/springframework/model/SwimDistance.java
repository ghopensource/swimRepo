package ghu.sailfish.springframework.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: SwimDistance
 *
 */
@Entity

public class SwimDistance implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SWIM_DISTANCE_ID")
	private int distanceId;

	public int getDistanceId() {
		return this.distanceId;
	}

	public void setDistanceId(int distanceId) {
		this.distanceId = distanceId;
	}
	
	@NotNull
	@Column(name="SWIM_DISTANCE")
	private int distance;
	
	public int getDistance() {
		return this.distance;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public SwimDistance() {
		super();
	}
   
}
