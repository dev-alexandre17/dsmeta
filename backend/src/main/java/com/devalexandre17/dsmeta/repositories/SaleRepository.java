package com.devalexandre17.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devalexandre17.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository <Sale, Long> {

}
