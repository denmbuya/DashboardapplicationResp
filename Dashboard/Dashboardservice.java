package com.Dashboardapp.service;

import java.util.Optional;

import com.Dashboardapp.entity.Dashboard;

public interface Dashboardservice {
    Dashboard createDashboard(Dashboard dashboard);

    Optional<Dashboard> getDashboardById(Long dashboardId);

    Iterable<Dashboard> getDashboard();

    void updateDashboard(Long dashboardId, Dashboard dashboard);

    void deleteDashboardById(Long dashboardId);
}
