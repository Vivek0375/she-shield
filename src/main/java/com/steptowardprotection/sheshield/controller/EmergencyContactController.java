package com.steptowardprotection.sheshield.controller;

import com.steptowardprotection.sheshield.dto.request.AddEmergencyContactRequest;
import com.steptowardprotection.sheshield.dto.response.AddEmergencyContactResponse;
import com.steptowardprotection.sheshield.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class EmergencyContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("health")
    public String health() {
        return "OK";
    }

    @PostMapping("add/emergency/contact")
    public AddEmergencyContactResponse addEmergencyContact(@RequestBody AddEmergencyContactRequest request) {
        return contactService.addEmergencyContact(request);
    }
}
