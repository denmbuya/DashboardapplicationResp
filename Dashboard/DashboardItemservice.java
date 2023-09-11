package com.Dashboardapp.service;

import java.util.Optional;

import com.Dashboardapp.entity.DashboardItem;

public interface DashboardItemservice {
    DashboardItem createDashboardItem(DashboardItem dashboardItem);

    Optional<DashboardItem> getDashboardItemById(Long id);

    Iterable<DashboardItem> getAllDashboardItem();

    void updateDashboardItem(Long dashboarbId, DashboardItem dashboardItem);

    void deleteDashboardItemById(Long id);
}
