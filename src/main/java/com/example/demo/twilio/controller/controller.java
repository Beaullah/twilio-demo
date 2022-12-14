package com.example.demo.twilio.controller;

import com.example.demo.twilio.dto.number;
import com.example.demo.twilio.dto.messageDto;
import com.example.demo.twilio.service.TwilioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("api/twilio/")
public class controller {
    private TwilioService twilioService;

    @PostMapping("{mobileNumber}/send")
    public ResponseEntity<Object> verifyOtp(@PathVariable("mobileNumber") number number,
                                            @RequestBody messageDto requestDto) {
        return twilioService.send(number, requestDto);
    }
}
