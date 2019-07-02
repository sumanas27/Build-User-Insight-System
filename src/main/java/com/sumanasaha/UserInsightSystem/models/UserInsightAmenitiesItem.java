package com.sumanasaha.UserInsightSystem.models;

public class UserInsightAmenitiesItem {

    private int timestamp;
    private int user_id;
    private int amenity_id;

    public UserInsightAmenitiesItem(int timestamp, int user_id, int amenity_id) {
        this.timestamp = timestamp;
        this.user_id = user_id;
        this.amenity_id = amenity_id;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getAmenity_id() {
        return amenity_id;
    }

    public void setAmenity_id(int amenity_id) {
        this.amenity_id = amenity_id;
    }
}
