package softuni.pathfinder.service.dto;

public class RouteShortInfoDTO {
    //описваме какво искаме да се покаже в темплейта
    private long id;
    private String name;
    private String description;
    private String picture;

    public RouteShortInfoDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
