package ghu.sailfish.springframework.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class SwimTeamInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	public SwimTeamInfo() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SWIMTEAM_INFO_ID")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	private Date joinDate;
	
	@NotNull
	@Column(name="JOIN_DATE")
	public Date getJoinDate() {
		return this.joinDate;
	}
	
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	private Date cancelDate;
	
	@Column(name="CANCEL_DATE")
	public Date getCancelDate() {
		return this.cancelDate;
	}
	
	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}
}
