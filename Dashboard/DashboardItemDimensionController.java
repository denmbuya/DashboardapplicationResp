package com.Dashboardapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dashboardapp.entity.DashboardItemDimension;
import com.Dashboardapp.service.DashboardItemDimensionservice;

@RestController
@RequestMapping("api/dashboarditemdimension")
public class DashboardItemDimensionController {

    @Autowired
    private DashboardItemDimensionservice dashboardItemDimensionService;

    @PostMapping
    public DashboardItemDimension createDashboardItemDimension(@RequestBody DashboardItemDimension dashboardItem) {
        return dashboardItemDimensionService.createDashboardItemDimension(dashboardItem);
    }

    @GetMapping("")
    public Iterable<DashboardItemDimension> getDashboardItemDimension() {
        return dashboardItemDimensionService.getAllDashboardItemDimension();
    }

    @GetMapping("{id}")
    public Optional<DashboardItemDimension> getDashboardItemDimensionById(@PathVariable Long id) {
        return dashboardItemDimensionService.getDashboardItemDimensionById(id);
    }

    @PutMapping("{id}")
    public void updateDashboardItemDimension(@PathVariable("id") Long id,
            @RequestBody DashboardItemDimension updatedDimension) {
        dashboardItemDimensionService.updateDashboardItemDimension(id, updatedDimension);
    }

    @DeleteMapping("{id}")
    public void deleteDashboardItemDimensionById(@PathVariable("id") Long id) {
        dashboardItemDimensionService.deleteDashboardItemDimensionById(id);
    }
}
