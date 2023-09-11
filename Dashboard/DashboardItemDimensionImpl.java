package com.Dashboardapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dashboardapp.entity.DashboardItemDimension;
import com.Dashboardapp.entity.DashboardItemDimensionItem;
import com.Dashboardapp.repository.DashboardItemDimensionRepository;

@Service
public class DashboardItemDimensionImpl implements DashboardItemDimensionservice {

    @Autowired
    private DashboardItemDimensionRepository dashboardItemDimensionRepository;

    @Override
    public DashboardItemDimension createDashboardItemDimension(DashboardItemDimension dashboardItem) {
        return dashboardItemDimensionRepository.save(dashboardItem);

    }

    @Override
    public Optional<DashboardItemDimension> getDashboardItemDimensionById(Long id) {
        return dashboardItemDimensionRepository.findById(id);

    }

    @Override
    public Iterable<DashboardItemDimension> getAllDashboardItemDimension() {
        return dashboardItemDimensionRepository.findAll();
    }

    @Override
    public void updateDashboardItemDimension(Long id, DashboardItemDimension updatedDimension) {
        dashboardItemDimensionRepository.findById(id).ifPresent(dbDimension -> {
            dbDimension.setDimension(updatedDimension.getDimension());
            dbDimension.setLayout(updatedDimension.getLayout());

            // Handle updating the items list
            List<DashboardItemDimensionItem> updatedItems = updatedDimension.getItems();
            if (updatedItems != null) {
                // Assuming that you want to completely replace the existing items list
                dbDimension.setItems(updatedItems);
            }

            dashboardItemDimensionRepository.save(dbDimension); // Save the updated dimension
        });
    }

    @Override
    public void deleteDashboardItemDimensionById(Long id) {
        dashboardItemDimensionRepository.deleteById(id);

    }

}
