package com.Dashboardapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Dashboardapp.entity.Dashboard;

public interface DashboardRepository extends JpaRepository<Dashboard, Long> {
    // Optional <Dashboard> getDashboardById(Long id);
}
