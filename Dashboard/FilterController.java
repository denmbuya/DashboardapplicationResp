package com.Dashboardapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dashboardapp.entity.Filter;
import com.Dashboardapp.service.BaseService;

@RequestMapping("api/filters")
@RestController
public class FilterController {

    // @Autowired
    private BaseService<Filter, Long> filterService;

}
