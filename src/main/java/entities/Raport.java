package entities;

import javax.persistence.*;

@Entity
@Table(name="Raport")
public class Raport {
	
	@Id
	@Column(name="raportID",unique=true, nullable=false, length=10)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int raportID;
	
	@ManyToOne
	@JoinColumn(name="userID")
	private User Ruser;

	public int getRaportID() {
		return raportID;
	}

	public void setRaportID(int raportID) {
		this.raportID = raportID;
	}
	
	public User getRUser() {
		return Ruser;
	}

	public void setRUser(User user) {
		this.Ruser = user;
	}
}
