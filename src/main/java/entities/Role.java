package entities;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @Column(name="roleID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="roleName")
    private String name;

    @OneToOne(mappedBy = "role")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUsers(User user) {
        this.user = user;
    }
}
