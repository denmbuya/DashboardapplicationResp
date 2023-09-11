package com.Dashboardapp.service;

import java.util.Optional;

import com.Dashboardapp.entity.DashboardItemDimension;

public interface DashboardItemDimensionservice {
    DashboardItemDimension createDashboardItemDimension(DashboardItemDimension dashboardItem);

    Optional<DashboardItemDimension> getDashboardItemDimensionById(Long id);

    Iterable<DashboardItemDimension> getAllDashboardItemDimension();

    void updateDashboardItemDimension(Long dashboarbId, DashboardItemDimension dashboardItemDimension);

    void deleteDashboardItemDimensionById(Long id);
}
