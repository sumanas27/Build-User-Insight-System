package com.sumanasaha.UserInsightSystem.models;

public class UserInsightHotelClickItem {

    private int timestamp;
    private int user_id;
    private int hotel_id;
    private String hotel_region;

    public UserInsightHotelClickItem(int timestamp, int user_id, int hotel_id, String hotel_region) {
        this.timestamp = timestamp;
        this.user_id = user_id;
        this.hotel_id = hotel_id;
        this.hotel_region = hotel_region;
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

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_region() {
        return hotel_region;
    }

    public void setHotel_region(String hotel_region) {
        this.hotel_region = hotel_region;
    }



}
