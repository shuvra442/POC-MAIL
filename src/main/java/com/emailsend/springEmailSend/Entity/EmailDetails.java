package com.emailsend.springEmailSend.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailDetails {
       private String email;
       private String subject;
       private String message;

}
