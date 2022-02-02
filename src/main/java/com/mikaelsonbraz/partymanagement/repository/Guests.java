package com.mikaelsonbraz.partymanagement.repository;

import com.mikaelsonbraz.partymanagement.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Guests extends JpaRepository<Guest, Long> {
}
