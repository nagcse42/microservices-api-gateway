package com.nagcse42.microservices.api.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/flightServiceFallBack")
    public String flightServiceFallBack() {
        return "Flight service is down please contact IT or " +
                "Try after some time.";
    }

    @GetMapping("/passengerServiceFallBack")
    public String passengerServiceFallBack() {
        return "Passenger service is down please contact IT or " +
                "Try after some time.";
    }
}
