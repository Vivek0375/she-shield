package com.steptowardprotection.sheshield.service;

import com.steptowardprotection.sheshield.dto.request.AddEmergencyContactRequest;
import com.steptowardprotection.sheshield.dto.response.AddEmergencyContactResponse;
import com.steptowardprotection.sheshield.model.EmergencyContact;
import com.steptowardprotection.sheshield.repository.EmergencyContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ContactService {

    @Autowired
    EmergencyContactRepo emergencyContactRepo;
    public AddEmergencyContactResponse addEmergencyContact(@RequestBody AddEmergencyContactRequest request) {
        EmergencyContact emergencyContact = new EmergencyContact();
        emergencyContact.setName(request.getName());
        emergencyContact.setEmail(request.getEmail());
        emergencyContact.setPhone(request.getPhone());
        emergencyContactRepo.save(emergencyContact);


        AddEmergencyContactResponse addEmergencyContactResponse = new AddEmergencyContactResponse();
        addEmergencyContactResponse.setMessage("Contact added successfully");
        addEmergencyContactResponse.setStatus("success");


        return addEmergencyContactResponse;

    }
}
