package com.example.demo.twilio.service;

import com.example.demo.twilio.dto.number;
import com.example.demo.twilio.dto.messageDto;
import org.springframework.http.ResponseEntity;


public interface TwilioService {

    ResponseEntity<Object> send(number number, messageDto messageDto);

}