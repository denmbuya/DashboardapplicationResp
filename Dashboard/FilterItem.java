package com.Dashboardapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class FilterItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // private String id;
    @Column(name = "filterItem_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "filter_id")
    private Filter filter;

}
