package ghu.sailfish.springframework.model;

import java.io.Serializable;
import java.util.List;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.UniqueConstraint;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity implementation class for Entity: Swimmer
 *
 */
@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames={"EMAIL","DATE_OF_BIRTH"}))
public class Swimmer implements  Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SWIMMER_ID")
	private Long id;

	@NotNull
	@Size(min = 1, max = 32)
	@Pattern(regexp = "[A-Za-z]*", message = "must contain only letters")
	@Column(name="FIRST_NAME")
	private String firstName;

	@NotNull
	@Size(min = 1, max = 32)
	@Pattern(regexp = "[A-Za-z]*", message = "must contain only letters")
	@Column(name="LAST_NAME")
	private String lastName;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	@Size(min = 1, max = 25)
	@Pattern(regexp = "[A-Za-z]*", message = "must contain only letters")
	@Column(name="MIDDLE_NAME")
	private String middleName;

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@NotNull
	@Column(name="SEX")
	private char sex;
	public char getSex() {
		return this.sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	@Column(name="IS_REGISTERED_USA_SWIMMER")
	private boolean registererUSASwimmer;

	public boolean isRegistererUSASwimmer() {
		return registererUSASwimmer;
	}

	public void setRegistererUSASwimmer(boolean registererUSASwimmer) {
		this.registererUSASwimmer = registererUSASwimmer;
	}

	
	
	/*@ManyToOne
	@JoinColumn(name="SWIMMER_SWIMTEAM_FK")
	private SwimTeam swimTeam;
	
	
	public SwimTeam getSwimTeam() {
		return this.swimTeam;
	}
	
	public void setSwimTeam(SwimTeam swimTeam) {
		this.swimTeam = swimTeam;
	}
	*/

	@NotNull
	@NotEmpty
	@Email
	@Column(name="EMAIL")
	private String email;

	@NotNull
	@Size(min = 10, max = 12)
	@Digits(fraction = 0, integer = 12)
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/*private List<SwimEvent> swimEvents;
	
	@OneToMany
	public List<SwimEvent> getSwimEvents() {
		return this.swimEvents;
	}
	public void setSwimEvents(List<SwimEvent> swimEvents) {
		this.swimEvents = swimEvents;
	}*/
	public Swimmer() {}
	
	@NotNull
	@Column(name="DATE_OF_BIRTH")
	private Date dateofbirth;
	
	
	public Date getDateofbirth() {
		return this.dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	@ManyToOne
	@JoinColumn(name="HOME_ADDRESS_FK")
	private Address homeAddress;
	
	public Address getHomeAddress() {
		return this.homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	@OneToMany
	//@JoinTable(name="SWIMMER_TEAM_HISTORY")
	private List<SwimmerTeamHistory> swimTeams;
	
	public List<SwimmerTeamHistory> getSwimTeams() {
		return this.swimTeams;
	}
	
	public void setSwimTeams(List<SwimmerTeamHistory> swimTeams) {
		this.swimTeams = swimTeams;
	}
	
	
	public Swimmer(String firstName, String lastName, String middleName, String email, String phoneNumber, char sex, Date dateofbirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.sex = sex;
		this.dateofbirth = dateofbirth;
		//this.swimTeam = swimTeam;
	}
}
