package com.example.RestaurantManagement.controller;

import com.example.RestaurantManagement.model.Restaurant;
import com.example.RestaurantManagement.model.RestaurantManagement;
import com.example.RestaurantManagement.service.RestaurantManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurantManagement")
public class RestaurantManagementController {

    @Autowired
    private RestaurantManagementService restaurantManagementService;

    @GetMapping("/restaurantId/{restaurantId}")
    public RestaurantManagement getInformationOfRestaurantByRestaurantId(@PathVariable Long restaurantId){
        return restaurantManagementService.getInformationOfRestaurantByRestaurantEmployeeRecordId(restaurantId);
    }

    @PutMapping("/restaurantId/{restaurantEmployeeRecordId}")
    public RestaurantManagement updateInformationOfRestaurantByRestaurantId(@PathVariable Long restaurantEmployeeRecordId){
        return restaurantManagementService.updateInformationOfRestaurantByRestaurantEmployeeRecordId(restaurantEmployeeRecordId);
    }
}
