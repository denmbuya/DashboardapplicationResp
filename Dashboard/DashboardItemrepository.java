package com.Dashboardapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Dashboardapp.entity.DashboardItem;

public interface DashboardItemrepository extends JpaRepository<DashboardItem, Long> {

}
