package com.Dashboardapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.Dashboardapp.entity.Dashboard;
import com.Dashboardapp.entity.Filter;
import com.Dashboardapp.entity.FilterItem;
import com.Dashboardapp.repository.FilterRepository;

public class FilterServiceImpl implements BaseService<Filter, Long> {

    @Autowired
    private FilterRepository filterRepository;

    @Override
    public Filter create(Filter entity) {
        return filterRepository.save(entity);
    }

    @Override
    public Iterable<Filter> getAll() {
        return filterRepository.findAll();
    }

    @Override
    public Optional<Filter> getById(Long id) {
        return filterRepository.findById(id);
    }

    @Override
    public void update(Long id, Filter updatedFilter) {
        filterRepository.findById(id).ifPresent(dbFilter -> {
            // Update fields of the existing filter with the values from updatedFilter
            dbFilter.setDimension(updatedFilter.getDimension());

            // Handle updating the items list
            List<FilterItem> updatedItems = updatedFilter.getItems();
            if (updatedItems != null) {
                // Assuming that you want to completely replace the existing items list
                dbFilter.setItems(updatedItems);
            }

            // Handle updating the dashboard reference
            Dashboard updatedDashboard = updatedFilter.getDashboard();
            if (updatedDashboard != null) {
                dbFilter.setDashboard(updatedDashboard);
            }

            filterRepository.save(dbFilter); // Save the updated filter
        });
    }

    @Override
    public void deleteById(Long id) {
        filterRepository.deleteById(id);
    }
}
