package com.Dashboardapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dashboardapp.entity.DashboardItemDimensionItem;
import com.Dashboardapp.service.BaseService;

@RestController("/api/dimension-item-dashboard")
@RequestMapping
public class DashboardItemDimensionItemController {

    @Autowired
    private BaseService<DashboardItemDimensionItem, Long> dashboardDimensionItemservice;

    @PostMapping(value = "path")
    public DashboardItemDimensionItem postMethodName(@RequestBody DashboardItemDimensionItem entity) {
        return dashboardDimensionItemservice.create(entity);
    }

    @GetMapping
    public Iterable<DashboardItemDimensionItem> getDashboardDimensionItem() {
        return dashboardDimensionItemservice.getAll();
    }

    @GetMapping("{id}")
    public Optional<DashboardItemDimensionItem> getDashboardItemDimensionItemById(@PathVariable("id") Long id) {
        return dashboardDimensionItemservice.getById(id);
    }

    @PutMapping
    public void updateDashboardItemDimensioItem(@PathVariable("id") Long id,
            @RequestBody DashboardItemDimensionItem updateDashboard) {
        dashboardDimensionItemservice.update(id, updateDashboard);
    }

}