package softuni.pathfinder.model;

import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
public class Message {
    //•	id - Accepts UUID String or Long values
    //•	date time - Accepts Date and Time values
    //•	text content - Accepts very long String values
    //•	author - Accepts User Entities as values
    //•	recipient - Accepts User Entities as values
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "date_time",nullable = false)
    private Instant dateTime;

    @Column(name = "text_content",columnDefinition = "TEXT")
    private String content;

    //•	author - Accepts User Entities as values
    //един потребител може да изпрати много съобщения
    @ManyToOne(optional = false)
    private User author;

    //•	recipient - Accepts User Entities as values
    //един потребител може да получи много съобщения
    @ManyToOne(optional = false)
    private User recipient;

    public Message() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Instant getDateTime() {
        return dateTime;
    }

    public void setDateTime(Instant dateTime) {
        this.dateTime = dateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }
}
