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
public class DashboardItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int x;
    private int y;
    private int h;
    private int w;
    private String type;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dashboardItem")
    private List<DashboardItemDimension> dimensions;

    @ManyToOne
    @JoinColumn(name = "dashboard_id")
    private Dashboard dashboard;

}
