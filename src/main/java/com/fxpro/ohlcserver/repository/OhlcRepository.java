package com.fxpro.ohlcserver.repository;

import com.fxpro.ohlcserver.model.entity.OhlcEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OhlcRepository extends JpaRepository<OhlcEntity, Long> {
}
