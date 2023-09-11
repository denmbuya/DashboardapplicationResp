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

import com.Dashboardapp.entity.DashboardItem;
import com.Dashboardapp.service.DashboardItemservice;

@RestController
@RequestMapping("api/dashboard-items")
public class DashboardItemController {

    @Autowired
    private DashboardItemservice dashboardItemservice;

    @PostMapping
    public DashboardItem createDashboardItem(DashboardItem dashboardItem) {
        return dashboardItemservice.createDashboardItem(dashboardItem);
    }

    @GetMapping("")
    public Iterable<DashboardItem> getDashboardItem() {
        return dashboardItemservice.getAllDashboardItem();
    }

    @GetMapping("{id}")
    public Optional<DashboardItem> getDashboardById(@PathVariable Long id) {
        return dashboardItemservice.getDashboardItemById(id);
    }

    @PutMapping("{id}")
    public void updateDashboardItem(@PathVariable("id") Long id, @RequestBody DashboardItem updatedDashboardItem) {
        dashboardItemservice.updateDashboardItem(id, updatedDashboardItem);
    }

    @DeleteMapping("{id}")
    public void deleteDashboardItemById(@PathVariable("id") Long id) {
        dashboardItemservice.deleteDashboardItemById(id);
    }
}
