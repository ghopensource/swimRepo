package ghu.sailfish.springframework.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;


@Entity
public class SwimmerTeamHistory implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public SwimmerTeamHistory() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SWIMMER_TEAM_HISTORY_ID")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
//	@ManyToOne
//	@JoinColumn(name="SWIMMER_HISTORY_FK")
//	private Swimmer swimmer;
//	
//	public Swimmer getSwimmer() {
//		return this.swimmer;
//	}
//	
//	public void setSwimmer(Swimmer swimmer) {
//		this.swimmer = swimmer;
//	}
//	
//	@OneToMany
//	//@JoinTable(name="SWIMTEAM_HISTORY")
//	private List<SwimTeamInfo> swimTeams;
//	
//	public List<SwimTeamInfo> getSwimTeams() {
//		return this.swimTeams;
//	}
//	
//	public void setSwimTeams(List<SwimTeamInfo> swimTeams) {
//		this.swimTeams = swimTeams;
//	}
	
	@ManyToOne
	@JoinColumn(name="SWIMTEAM_HISTORY_FK")
	private SwimTeam swimTeam;
	
	public SwimTeam getSwimTeam() {
		return this.swimTeam;
	}
	
	public void setSwimTeam(SwimTeam swimTeam) {
		this.swimTeam = swimTeam;
	}
	
	@NotNull
	@Column(name="JOIN_DATE")
    private Date joinDate;
	
	
	public Date getJoinDate() {
		return this.joinDate;
	}
	
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	@Column(name="CANCEL_DATE")
	private Date cancelDate;
	
	
	public Date getCancelDate() {
		return this.cancelDate;
	}
	
	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}
	

}
