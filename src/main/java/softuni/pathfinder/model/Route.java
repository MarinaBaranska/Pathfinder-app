package softuni.pathfinder.model;

import jakarta.persistence.*;

import softuni.pathfinder.model.enums.UserLevel;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "routes")
public class Route {
    //•	id - Accepts UUID String or Long values
    //•	gpx coordinates - Accepts very long text values
    //•	level - Accepts the levels of the routes (BEGINNER, INTERMEDIATE, ADVANCED) as values
    //•	name - Accepts String values
    //•	author - Accepts User Entities as values
    //•	video url – Accepts the ids of youtube videos as values
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "gpx_coordinates", columnDefinition = "LONGTEXT")
    private String gpxCoordinates;

   @Column(nullable = false,unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    private UserLevel level;

    @Column(columnDefinition = "LONGTEXT")
    private String description;

    @Column(name="video_url")
    private  String videoUrl;

    //•	author - Accepts User Entities as values
    //много маршрути имат един автор
    @ManyToOne(optional = false)
    private User author;

    //сет от коментари
    //един път има много коментари
    @OneToMany(targetEntity = Comment.class, mappedBy = "route", cascade = CascadeType.ALL)
    private Set<Comment> comments;

    //един път има много картинки
    @OneToMany(targetEntity = Picture.class,mappedBy = "route",fetch = FetchType.LAZY)
    private Set<Picture> pictures;

    //категоризацията на пърищата
    @ManyToMany
    private Set<Category> categories;


    public Route() {
        this.comments = new HashSet<>();
        this.categories = new HashSet<>();
        this.pictures = new HashSet<>();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public void setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
    }

    public UserLevel getLevel() {
        return level;
    }

    public void setLevel(UserLevel level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(Set<Picture> pictures) {
        this.pictures = pictures;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
