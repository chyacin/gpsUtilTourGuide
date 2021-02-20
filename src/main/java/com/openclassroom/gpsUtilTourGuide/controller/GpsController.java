package com.openclassroom.gpsUtilTourGuide.controller;

import com.openclassroom.gpsUtilTourGuide.service.GpsService;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class GpsController {
    @Autowired
    GpsService gpsService;




    @GetMapping("/userLocation")
    public VisitedLocation getUserLocation(@RequestParam UUID UserId){
        VisitedLocation visitedLocation = gpsService.getUserLocation(UserId);
        return visitedLocation;


    }

    @GetMapping("/allAttractions")
   public List<Attraction> getAttractions(){
       List<Attraction> attractionList = gpsService.getAttractions();
       return attractionList;

    }
}
