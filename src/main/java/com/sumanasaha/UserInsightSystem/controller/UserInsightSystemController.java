package com.sumanasaha.UserInsightSystem.controller;

import com.sumanasaha.UserInsightSystem.models.UserInsightAmenitiesItem;
import com.sumanasaha.UserInsightSystem.models.UserInsightHotelClickItem;
import com.sumanasaha.UserInsightSystem.models.UserInsightItemEntry;
import com.sumanasaha.UserInsightSystem.resource.UserInsightResourceData;
import com.sumanasaha.UserInsightSystem.resource.UserInsightResourceReader;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserInsightSystemController {

    public UserInsightItemEntry getTopEntitiesByUserId(int userId){

        UserInsightResourceReader userInsightResourceReader = new UserInsightResourceReader();
        UserInsightItemEntry ret = null;
        try{
            List<UserInsightAmenitiesItem> amenitiesItems = userInsightResourceReader.fetchUserAmenities();
            List<UserInsightHotelClickItem> hotelClickItems = userInsightResourceReader.fetchUserHotels();
            UserInsightResourceData resourceData = new UserInsightResourceData();
            ret = resourceData.getTopNAmenitiesAndTopKHotels(amenitiesItems, hotelClickItems, userId);
        } catch (IOException e){
            System.out.println(e);
        }
        return ret;
    }

}
