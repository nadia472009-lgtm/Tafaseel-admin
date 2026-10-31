package com.example.tafaseel_admin;


import java.io.Serializable;

public class Tafaseel implements Serializable {

    private String id;
    private String title;
    private String category; // مثل: طالب، موظف، أم
    private String description;
    private String timeOrSchedule;
    private String imageUrl;

    // Empty constructor: Firestore needs this to rebuild the object
    public Tafaseel() {
    }

    public Tafaseel(String id, String title, String category, String description, String timeOrSchedule, String imageUrl) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.description = description;
        this.timeOrSchedule = timeOrSchedule;
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimeOrSchedule() {
        return timeOrSchedule;
    }

    public void setTimeOrSchedule(String timeOrSchedule) {
        this.timeOrSchedule = timeOrSchedule;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
