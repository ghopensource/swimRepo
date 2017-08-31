package ghu.sailfish.springframework.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.sql.Timestamp;
import java.sql.Time;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class TestLSC implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TESTLSC_ID")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@ManyToOne
	//@JoinColumn(name="LSC_ID", referencedColumnName="TEAM_ID")
	//@Column(name="LSC_ID_FK")
    private LSC lsc;
	
	
	public LSC getLsc() {
		return this.lsc;
	}
	public void setLsc(LSC lsc) {
		this.lsc = lsc;
	}
	
	@Column(name="TEST_TIME", precision=2)
	private Time time;
	
	public Time getTime() {
		return this.time;
	}
	
	public void setTime(Time time) {
		this.time = time;
	}
	
	public String getTimeString() throws Exception {
		//SimpleDateFormat format = new SimpleDateFormat("MM:SS.SS");
		//Date date = format.parse(time.toString());
		//return date.toString();
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
			if(min>0) {
				if(min>=10) {
					sb.append(min);
				}
				else {
					sb.append("0");
					sb.append(min);
				}
			} else {
				sb.append("00");
			}
			isTheFirst = false;
			
		} else {
			if(min>0) {
				sb.append(min);
				sb.append(":");
				isTheFirst = false;
			}
		}
		
		if(!isTheFirst) {
			if(second>0) {
				if(second>=10) {
					sb.append(second);
				}else {
					sb.append("0");
					sb.append(second);
				}
			} else {
				sb.append("00");
			}
			sb.append(".");
		} else {
			if(second>0) {
				sb.append(second);
				sb.append(".");
				isTheFirst = false;
			}
		}
		if(!isTheFirst) {
			if(mills>0) {
				if(mills>=10) {
					sb.append(mills);
				}else {
					sb.append("0");
					sb.append(mills);
				}
			} else {
				sb.append("00");
			}
		} else {
			sb.append(mills);
		}
		return sb.toString();
		
		
	}
	
	private void formatTimeString(StringBuilder sb, boolean isTheFirst, int t) {
		if(!isTheFirst) {
			sb.append(":");
			if(t>0) {
			  sb.append(t);
			}
			
			
		}
	}
}
