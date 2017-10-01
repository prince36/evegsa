package com.portal.evegsa.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
public class Event implements Serializable {


    private Long idevent;
    private String title;
    private String city;
    private String location;
    private String description;
    private String category;
    private Date date_create;
    private Date date_event;


    public Event() {

    }

    public Event(Long idevent, String title, String city, String location, String description, String category, Date date_create, Date date_event) {
        this.idevent = idevent;
        this.title = title;
        this.city = city;
        this.location = location;
        this.description = description;
        this.category = category;
        this.date_create = date_create;
        this.date_event = date_event;
    }

    public Event(Long idevent) {
        this.idevent = idevent;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getIdevent() {
        return idevent;
    }

    public void setIdevent(Long idevent) {
        this.idevent = idevent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDate_create() {
        return date_create;
    }

    public void setDate_create(Date date_create) {
        this.date_create = date_create;
    }

    public Date getDate_event() {
        return date_event;
    }

    public void setDate_event(Date date_event) {
        this.date_event = date_event;
    }
}
