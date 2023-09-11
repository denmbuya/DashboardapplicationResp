package com.Dashboardapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dashboardapp.entity.DashboardItem;
import com.Dashboardapp.repository.DashboardItemrepository;

@Service
public class DashboardItemServiceImpl implements DashboardItemservice {

    @Autowired
    private DashboardItemrepository dashboardItemrepository;

    @Override
    public DashboardItem createDashboardItem(DashboardItem dashboardItem) {
        return dashboardItemrepository.save(dashboardItem);
    }

    @Override
    public Optional<DashboardItem> getDashboardItemById(Long id) {
        return dashboardItemrepository.findById(id);
    }

    @Override
    public Iterable<DashboardItem> getAllDashboardItem() {
        return dashboardItemrepository.findAll();
    }

    @Override
    public void updateDashboardItem(Long id, DashboardItem updatedDashboardItem) {
        dashboardItemrepository.findById(id).ifPresent(dbdashboarditem -> {
            // Update fields of the existing dashboard item with the values from
            // updatedDashboardItem
            dbdashboarditem.setName(updatedDashboardItem.getName());
            dbdashboarditem.setX(updatedDashboardItem.getX());
            dbdashboarditem.setY(updatedDashboardItem.getY());
            dbdashboarditem.setH(updatedDashboardItem.getH());
            dbdashboarditem.setW(updatedDashboardItem.getW());
            dbdashboarditem.setType(updatedDashboardItem.getType());

            // continue updating other fields as needed

            dashboardItemrepository.save(dbdashboarditem); // Save the updated item
        });

    }

    @Override
    public void deleteDashboardItemById(Long id) {
        dashboardItemrepository.deleteById(id);
    }
}
