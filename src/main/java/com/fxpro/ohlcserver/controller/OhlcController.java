package com.fxpro.ohlcserver.controller;

import com.fxpro.ohlcserver.dto.periodTimestampDto;
import com.fxpro.ohlcserver.model.entity.OhlcEntity;
import com.fxpro.ohlcserver.repository.OhlcRepository;
import com.fxpro.ohlcserver.service.OhlcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Table;
import javax.validation.Valid;

@RestController
@Validated
@Table(name = "OHLC")
public class OhlcController {
    @Autowired
    OhlcRepository ohlcRepository;

    @GetMapping("getInstrument")
    public OhlcEntity getInstrument(
            @Valid @RequestBody periodTimestampDto periodTimestampDto
    ){
        
        return null;
    }
}
