package com.Dashboardapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dashboardapp.entity.Dashboard;
import com.Dashboardapp.repository.DashboardRepository;

@Service
public class DashboardServiceImpl implements Dashboardservice {

    @Autowired
    private DashboardRepository dashboardRepository;

    @Override
    public Dashboard createDashboard(Dashboard dashboard) {
        return dashboardRepository.save(dashboard);
    }

    @Override
    public Iterable<Dashboard> getDashboard() {
        return dashboardRepository.findAll();
    }

    @Override
    public Optional<Dashboard> getDashboardById(Long id) {
        return dashboardRepository.findById(id);
    }

    @Override
    public void updateDashboard(Long dashboardId, Dashboard updatedDashboard) {
        dashboardRepository.findById(dashboardId).ifPresent(dbdashboard -> {
            dbdashboard.setDisplayName(updatedDashboard.getDisplayName());

            // Update filters
            dbdashboard.getFilters().clear(); // Clear existing filters
            dbdashboard.getFilters().addAll(updatedDashboard.getFilters()); // Add updated filters

            dashboardRepository.save(dbdashboard);
        });
    }

    public void deleteDashboardById(Long dashboardId) {
        dashboardRepository.deleteById(dashboardId);
    }
}
