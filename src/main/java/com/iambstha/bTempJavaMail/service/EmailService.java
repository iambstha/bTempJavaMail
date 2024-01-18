package com.iambstha.bTempJavaMail.service;

import com.iambstha.bTempJavaMail.entity.EmailDetails;

public interface EmailService {

	String sendSimpleMail(EmailDetails details);

	String sendMailWithAttachment(EmailDetails details);
}
