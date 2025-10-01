package com.steptowardprotection.sheshield.repository;

import com.steptowardprotection.sheshield.model.EmergencyContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmergencyContactRepo extends JpaRepository<EmergencyContact, String> {
}
