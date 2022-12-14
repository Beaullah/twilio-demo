package com.example.demo.twilio.service;

import com.example.demo.twilio.TwilioConfiguration;
import com.example.demo.twilio.dto.messageDto;
import com.example.demo.twilio.dto.number;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class TwilioServiceImpl implements TwilioService {

    private TwilioConfiguration twilioConfiguration;

    public ResponseEntity<Object> send(number number, messageDto messageDto) {

        Message.creator(new PhoneNumber(number.phoneNumber()),
                        new PhoneNumber(twilioConfiguration.getTrialNumber()),
                        messageDto.message())
                .create();

        return new ResponseEntity<>("Message sent successfully", HttpStatus.OK);
    }


}