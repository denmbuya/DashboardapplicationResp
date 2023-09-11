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

import com.Dashboardapp.entity.Dashboard;
import com.Dashboardapp.service.Dashboardservice;

@RestController
@RequestMapping("api/dashboards")

public class DashboardController {

    @Autowired
    private Dashboardservice dashboardService;

    @GetMapping
    public Iterable<Dashboard> getAllDashboard() {
        return dashboardService.getDashboard();
    }

    @GetMapping("/{id}")
    public Optional<Dashboard> getDashboardById(@PathVariable Long id) {
        return dashboardService.getDashboardById(id);
    }

    @PostMapping
    public Dashboard createDashboard(@RequestBody Dashboard dashboard) {
        return dashboardService.createDashboard(dashboard);
    }

    @PutMapping("{id}")
    public void updateDashboard(@PathVariable Long dashboardId, @RequestBody Dashboard dashboard) {
        dashboardService.updateDashboard(dashboardId, dashboard);
    }

    @DeleteMapping("{id}")
    public void deleteDashboardById(@PathVariable("id") Long dashboardId) {
        dashboardService.deleteDashboardById(dashboardId);
    }
}
