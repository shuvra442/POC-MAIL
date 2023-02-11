package com.emailsend.springEmailSend.service;

import com.emailsend.springEmailSend.Entity.EmailDetails;

public interface EmailService {

    String simplemail(EmailDetails emailDetails);
}
