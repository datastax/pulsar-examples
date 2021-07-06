package com.datastax.pulsar;

public class DemoBean {
    int  show_id;
    String cast;
    String country;
    String date_added;
    String description;
    String director;
    String duration;
    String listed_in;
    String rating;
    int release_year;
    String title;
    String type;

    public DemoBean(
        int  show_id,
        String cast,
        String country,
        String date_added,
        String description,
        String director,
        String duration,
        String listed_in,
        String rating,
        int release_year,
        String title,
        String type
    ) {
        super();
        this.show_id = show_id;
        this.cast = cast;
        this.country = country;
        this.date_added = date_added;
        this.description = description;
        this.director = director;
        this.duration = duration;
        this.listed_in = listed_in;
        this.rating = rating;
        this.release_year = release_year;
        this.title = title;
        this.type = type;
    }

    public int getShow_id() {
        return this.show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public String getCast() {
        return this.cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate_added() {
        return this.date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDuration() {
        return this.duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getListed_in() {
        return this.listed_in;
    }

    public void setListed_in(String listed_in) {
        this.listed_in = listed_in;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getRelease_year() {
        return this.release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

// public class DemoBean {
//     String id;
//     String name;
    
//     public DemoBean(String id, String name) {
//         super();
//         this.id = id;
//         this.name = name;
//     }
//     /**
//      * Getter accessor for attribute 'id'.
//      *
//      * @return
//      *       current name of 'id'
//      */
//     public String getId() {
//         return id;
//     }
//     /**
//      * Setter accessor for attribute 'id'.
//      * @param id
//      *      new name for 'id '
//      */
//     public void setId(String id) {
//         this.id = id;
//     }
//     /**
//      * Getter accessor for attribute 'name'.
//      *
//      * @return
//      *       current name of 'name'
//      */
//     public String getName() {
//         return name;
//     }
//     /**
//      * Setter accessor for attribute 'name'.
//      * @param name
//      *      new name for 'name '
//      */
//     public void setName(String name) {
//         this.name = name;
//     }
}
