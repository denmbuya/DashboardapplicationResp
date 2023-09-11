package com.Dashboardapp.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Dashboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String displayName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dashboard")
    private List<Filter> filters;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dashboard")
    private List<DashboardItem> dashboardItems;

}
