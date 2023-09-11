package com.Dashboardapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dashboardapp.entity.DashboardItemDimensionItem;
import com.Dashboardapp.repository.DashboardItemDimensionItemRepository;

@Service
public class DashboardItemDimensionItemImpl implements BaseService<DashboardItemDimensionItem, Long> {

    @Autowired
    private DashboardItemDimensionItemRepository dashboardItemDimensionItemRepository;

    @Override
    public DashboardItemDimensionItem create(DashboardItemDimensionItem item) {
        return dashboardItemDimensionItemRepository.save(item);
    }

    @Override
    public Optional<DashboardItemDimensionItem> getById(Long id) {
        return dashboardItemDimensionItemRepository.findById(id);
    }

    @Override
    public Iterable<DashboardItemDimensionItem> getAll() {
        return dashboardItemDimensionItemRepository.findAll();
    }

    @Override
    public void update(Long itemId, DashboardItemDimensionItem updatedItem) {
        dashboardItemDimensionItemRepository.findById(itemId).ifPresent(dbItem -> {
            dbItem.setName(updatedItem.getName());
            dbItem.setType(updatedItem.getType());
            // Update other fields as needed
            dashboardItemDimensionItemRepository.save(dbItem);
        });
    }

    @Override
    public void deleteById(Long id) {
        dashboardItemDimensionItemRepository.deleteById(id);
    }
}
