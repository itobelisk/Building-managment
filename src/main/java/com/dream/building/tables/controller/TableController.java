package com.dream.building.tables.controller;

import com.dream.building.tables.api.TableApi;
import com.dream.building.tables.service.impl.TableServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TableController implements TableApi {
    private final TableServiceImpl  tableService;

}
