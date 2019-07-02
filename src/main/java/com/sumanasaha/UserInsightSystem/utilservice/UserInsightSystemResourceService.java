package com.sumanasaha.UserInsightSystem.utilservice;
import com.sumanasaha.UserInsightSystem.controller.UserInsightSystemController;
import com.sumanasaha.UserInsightSystem.models.UserInsightAmenitiesItem;
import com.sumanasaha.UserInsightSystem.models.UserInsightHotelClickItem;
import com.sumanasaha.UserInsightSystem.models.UserInsightItemEntry;
import com.sumanasaha.UserInsightSystem.resource.UserInsightResourceData;
import com.sumanasaha.UserInsightSystem.resource.UserInsightResourceReader;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/rest/userInsight")
@Api(value = "UserInsight Resource Endpoint", description = "Shows Top N Amenities selected and Top K Hotels clicked by userId")
public class UserInsightSystemResourceService {

    @ApiOperation(value = "Returns N Top Amenities selected  and K Top Hotels clicked by the user")
    @GetMapping("/{userId}")
    public UserInsightItemEntry getUserInsights(@PathVariable("userId") String userId) throws Exception {
        UserInsightItemEntry ret = null;
        Integer id = Integer.parseInt(userId);
        try{
            if(id > 0){
                ret = new UserInsightSystemController().getTopEntitiesByUserId(Integer.parseInt(userId));
            } else {
                return null ;
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        return ret;
    }
}

