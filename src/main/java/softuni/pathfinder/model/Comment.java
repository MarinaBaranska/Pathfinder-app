package softuni.pathfinder.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "comments")
public class Comment {
    //•	id - Accepts UUID String or Long values
    //•	approved - Accepts boolean values
    //•	created - Accepts Date and Time values
    //o	 The values should not be future dates
    //•	text content - Accepts very long text values
    //•	author - Accepts User Entities as values
    //•	route - Accepts Route Entities as values

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private boolean approved;

    //•	created - Accepts Date and Time values
    @Column(nullable = false)
    private Instant created;

    @Column(name = "text_content",columnDefinition = "TEXT", nullable = false)
    private String text;

    //•	author - Accepts User Entities as values
    //•	route - Accepts Route Entities as values

    //много коментари могат да имат един и същи автор
    @ManyToOne(optional = false)
    private User author;

    //eдин път може да има много коментари но даден коментар е написан да точно определен път
    //Всеки един коментар трябва да бъде обвързан с маршрут
    //lazy - не очаквам когато гредам коментар да ми бъде показан маршрута
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    private Route route;

    public Comment() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public Instant getCreated() {
        return created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
