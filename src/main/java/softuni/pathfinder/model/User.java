package softuni.pathfinder.model;

import jakarta.persistence.*;

import softuni.pathfinder.model.enums.UserLevel;
import softuni.pathfinder.model.enums.UserRoles;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    //•	id - Accepts UUID String or Long values
    //•	username - Accepts String values
    //o	Accepts values, which should be at least 2 characters
    //•	password - Accepts String values
    //o	Accepts values, which should be at least 2 characters
    //•	email - Accepts String values
    //o	Accepts values, which contain the '@' symbol
    //•	role - Accepts Role Entity values
    //o	Each registered user should have a "User" role
    //•	level - Accepts a level of the user (BEGINNER, INTERMEDIATE, ADVANCED)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(unique = true)
    private String email;

    @Column(name = "full_name",nullable = false)
    private String fullName;

    private Integer age;

    //•	role - Accepts Role Entity values

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;

    @Enumerated(EnumType.STRING)
    private UserLevel level;

    public User() {
        this.roles = new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;

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

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public UserLevel getLevel() {
        return level;
    }

    public void setLevel(UserLevel level) {
        this.level = level;
    }
}
