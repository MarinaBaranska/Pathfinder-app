package softuni.pathfinder.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pictures")
public class Picture {
    //•	id - Accepts UUID String or Long values
    //•	title - Accepts String values
    //•	url - Accepts very long String values
    //•	author - Accepts User Entities as values
    //•	route - Accepts Route Entities as values
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private  String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String url;

    //един потреб може да качи много снимки но една снимка може да е качена от един потребитем
    @ManyToOne(optional = false)
    private User author;

    //един път има една картинка
    @ManyToOne(optional = false)
    private Route route;

    public Picture() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

}
