package com.Dashboardapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "dashboarditemdimensioitem")
public class DashboardItemDimensionItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // private String id;
    private String name;
    private String type;

    @ManyToOne
    @JoinColumn(name = "dashboard_item_dimension_id")
    private DashboardItemDimension dashboardItemDimension;

}
