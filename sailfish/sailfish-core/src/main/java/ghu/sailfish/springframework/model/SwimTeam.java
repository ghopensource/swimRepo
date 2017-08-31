package ghu.sailfish.springframework.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Entity implementation class for Entity: SwimTeam
 *
 */
@Entity

public class SwimTeam implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TEAM_ID")
	private long teamId;

	public long getTeamId() {
		return teamId;
	}

	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}
	
	@NotNull
	@Column(name="TEAM_NAME", unique=true)
	private String teamName;

	public String getTeamName() {
		return this.teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	@NotNull
	@Column(name="TEAM_CODE", unique=true)
	private String teamCode;

	public String getTeamCode() {
		return this.teamCode;
	}

	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}
	
	//@NotNull
	@ManyToOne
    private LSC lsc;
	
	
	//@JoinColumn(name="LSC_ID", referencedColumnName="TEAM_ID")
	public LSC getLsc() {
		return this.lsc;
	}
	public void setLsc(LSC lsc) {
		this.lsc = lsc;
	}
	
	@ManyToOne
	@JoinColumn(name="TEAM_ADDRESS_FK")
	private Address address;
	public Address getAddress() {
		return this.address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	/*public SwimTeam() {
		super();
	}*/
   
}
