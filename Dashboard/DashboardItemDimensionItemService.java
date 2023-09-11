package com.Dashboardapp.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Dashboardapp.entity.DashboardItemDimensionItem;

@Service
public interface DashboardItemDimensionItemService {

    DashboardItemDimensionItem createDashboardItemDimensionItem(DashboardItemDimensionItem item);

    Optional<DashboardItemDimensionItem> getDashboardItemDimensionItemById(Long id);

    Iterable<DashboardItemDimensionItem> getAllDashboardItemDimensionItems();

    void updateDashboardItemDimensionItem(Long itemId, DashboardItemDimensionItem updatedItem);

    void deleteDashboardItemDimensionItemById(Long id);
}
