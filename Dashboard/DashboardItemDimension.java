package com.Dashboardapp.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class DashboardItemDimension {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dimension;
    private String layout;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dashboardItemDimension")
    private List<DashboardItemDimensionItem> items;

    @ManyToOne
    @JoinColumn(name = "dashboard_item_id")
    private DashboardItem dashboardItem;

}
