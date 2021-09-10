package com.hotmartchallenger.repository;

import com.hotmartchallenger.model.Purchaser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaserRepository extends JpaRepository<Purchaser, Long> {
}
