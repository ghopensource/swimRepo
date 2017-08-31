package ghu.sailfish.springframework.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Period
 *
 */
@Entity

public class Period implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int periodId;

	public int getPeriodId() {
		return this.periodId;
	}

	public void setPeriodId(int periodId) {
		this.periodId = periodId;
	}
	
	@NotNull
	@Column(name="PERIOD_NAME", unique=true)
	private String periodName;
	
	public String getPeriodName() {
		return periodName;
	}

	public void setPeriodName(String periodName) {
		this.periodName = periodName;
	}

	public Period() {
		super();
	}
   
}
