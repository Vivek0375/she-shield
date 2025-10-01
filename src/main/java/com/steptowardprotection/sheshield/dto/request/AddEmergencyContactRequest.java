package com.steptowardprotection.sheshield.dto.request;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class AddEmergencyContactRequest {
    private String name;
    private String email;
    private String phone;
}
