package com.fxpro.ohlcserver.model.entity;

import com.fxpro.ohlcserver.model.OhlcPeriod;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class OhlcEntity {
    private double openPrice;
    private double hightPrice;
    private double lowPrice;
    private double closePrice;
    private OhlcPeriod ohlcPeriod;
    private long periodStartUtsTimestamp;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
