package com.sumanasaha.UserInsightSystem.resource;

import com.google.common.collect.Lists;
import com.sumanasaha.UserInsightSystem.models.UserInsightAmenitiesItem;
import com.sumanasaha.UserInsightSystem.models.UserInsightHotelClickItem;
import com.sumanasaha.UserInsightSystem.models.UserInsightItemEntry;

import java.io.IOException;
import java.rmi.NoSuchObjectException;
import java.util.*;
import java.util.stream.Collectors;

import static com.google.common.collect.Lists.*;

public class UserInsightResourceData {

    public UserInsightItemEntry getTopNAmenitiesAndTopKHotels(List<UserInsightAmenitiesItem> amenitiesItems,
                                                              List<UserInsightHotelClickItem> hotelItems, int userId) throws NoSuchObjectException {
        UserInsightItemEntry ret;
        Map<Integer, List<Integer>> userIdToAmenityMap = getUserIdToAmenityIds(amenitiesItems);
        Map<Integer, List<Integer>> userIdToClickedHotelsMap = getUserIdToClickedHotelIds(hotelItems);
        if(userIdToAmenityMap.get(userId) != null && userIdToClickedHotelsMap.get(userId) != null){
            ret = new UserInsightItemEntry(userId,userIdToAmenityMap.get(userId), userIdToClickedHotelsMap.get(userId));
            return ret;
        } else {
            return null;
        }

    }


    private Map<Integer, List<Integer>> getUserIdToAmenityIds(List<UserInsightAmenitiesItem> amenitiesItems){
        Map<Integer, List<Integer>> ret = new HashMap<>();
        List<Integer> amenityIds = null;
        for (UserInsightAmenitiesItem item : amenitiesItems) {
            if(ret.get(item.getUser_id()) == null){
                amenityIds = new ArrayList<>();
            }
            amenityIds.add(item.getAmenity_id());
            ret.put(item.getUser_id(), amenityIds);
        }
        return ret;
    }

    private Map<Integer, List<Integer>> getUserIdToClickedHotelIds(List<UserInsightHotelClickItem> hotelItems){
        Map<Integer, List<Integer>> ret = new HashMap<>();
        List<Integer> hotelIds = null;
        for (UserInsightHotelClickItem item : hotelItems) {
            if(ret.get(item.getUser_id()) == null){
                hotelIds = new ArrayList<>();
            }
            hotelIds.add(item.getHotel_id());
            ret.put(item.getUser_id(), hotelIds);
        }
        return ret;
    }


}


