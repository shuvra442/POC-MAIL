package com.emailsend.springEmailSend.controller;

import com.emailsend.springEmailSend.Entity.EmailDetails;
import com.emailsend.springEmailSend.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailCon {

    @Autowired
    private EmailService emailService;

    @PostMapping("/mail")
    public String sendmail(@RequestBody EmailDetails emailDetails)
    {
        String st= emailService.simplemail(emailDetails);
        return st;
    }
}
