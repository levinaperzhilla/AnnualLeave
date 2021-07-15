package entities;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="User")
public class User {
	@Id
	@Column(name="userID", unique=true, length=10)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userID;
	
	@OneToOne
    private Role role;
	
	@Column(name="username", unique=true, length=30)
	private String username;

	@Column(name="password",unique=true, length=50)
	private String password;
	
	@Column(name="email", unique=true, length=30)
	private String email;
	
	@Column(name="starting_day")
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date starting_day;
	
	@Transient
    private String passwordConfirm;
	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getStarting_day() {
		return starting_day;
	}

	public void setStarting_day(Date starting_day) {
		this.starting_day = starting_day;
	}
	public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }
}
