package softuni.pathfinder.model;

import jakarta.persistence.*;
import softuni.pathfinder.model.enums.UserRoles;

@Entity
@Table(name = "roles")
public class Role {
    //•	id - Accepts UUID String or Long values
    //•	name - Accepts String values
    //o	USER, MODERATOR and ADMIN

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private UserRoles name;

    public Role() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserRoles getName() {
        return name;
    }

    public void setName(UserRoles name) {
        this.name = name;
    }
}
