package softuni.pathfinder.model;

import jakarta.persistence.*;
import softuni.pathfinder.model.enums.CategoryType;
@Entity
@Table(name = "categories")
public class Category {
    //•	id - Accepts UUID String or Long values
    //•	name - Accepts String values (PEDESTRIAN, BICYCLE, MOTORCYCLE, CAR)
    //•	description - Accepts very long String values
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false,unique = true)
    @Enumerated(EnumType.STRING)
    private CategoryType name;

    @Column(columnDefinition = "TEXT")
    private String description;


    public Category() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CategoryType getName() {
        return name;
    }

    public void setName(CategoryType name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
