package entities;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Application")
public class Application {
	public enum Type{daysoff, vacation, compensation}
	public enum Status{pending,accepted,rejected}
	@Id
	@Column(name="number", unique=true,length=10)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int number;
	
	@ManyToOne
	@JoinColumn(name="userID")
	private User Auser;

	@Column(name="startDate")
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date startdate;
	
	@Column(name="endDAte")
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date endDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name="type")
	private Type type;
	
	@Enumerated(EnumType.STRING)
	@Column(name="status")
	private Status status;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public User getUser() {
		return Auser;
	}

	public void setUser(User user) {
		this.Auser = user;
	}
}
