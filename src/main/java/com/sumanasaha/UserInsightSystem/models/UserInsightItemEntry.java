package com.sumanasaha.UserInsightSystem.models;

import java.util.List;

public class UserInsightItemEntry {

    private int user_id;
    private List<Integer> amenity_ids;
    private List<Integer> hotel_ids;

    public UserInsightItemEntry(int user_id, List<Integer> amenity_ids, List<Integer> hotel_ids) {
        this.user_id = user_id;
        this.amenity_ids = amenity_ids;
        this.hotel_ids = hotel_ids;
    }


    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public List<Integer> getAmenity_ids() {
        return amenity_ids;
    }

    public void setAmenity_ids(List<Integer> amenity_ids) {
        this.amenity_ids = amenity_ids;
    }

    public List<Integer> getHotel_ids() {
        return hotel_ids;
    }

    public void setHotel_id(List<Integer> hotel_ids) {
        this.hotel_ids = hotel_ids;
    }
}
