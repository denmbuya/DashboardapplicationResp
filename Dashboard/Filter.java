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
public class Filter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dimension;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "filter")
    private List<FilterItem> items;

    @ManyToOne
    @JoinColumn(name = "dashboard_id")
    private Dashboard dashboard;

}
