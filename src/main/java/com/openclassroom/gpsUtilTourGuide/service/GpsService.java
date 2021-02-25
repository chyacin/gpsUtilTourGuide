package com.openclassroom.gpsUtilTourGuide.service;

import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GpsService {

    private final GpsUtil gpsUtil;

    public GpsService(){
        this.gpsUtil = new GpsUtil();
    }


    public VisitedLocation getUserLocation(UUID userId){
        VisitedLocation visitedLocation = gpsUtil.getUserLocation(userId);

        return visitedLocation;

    }

    public List<Attraction>  getAttractions(){
        List<Attraction> attractionList = gpsUtil.getAttractions();
        return attractionList;
    }




}
