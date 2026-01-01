package com.staqlt.api.controller;

import org.springframework.web.bind.annotation.GetMapping; import org.springframework.web.bind.annotation.RequestMapping; import org.springframework.web.bind.annotation.RestController; import java.util.Map; import java.util.HashMap;

@RestController @RequestMapping("/api/v1") public class HealthController {

@GetMapping("/status")
public Map<String, String> getStatus() {
    HashMap<String, String> map = new HashMap<>();
    map.put("status", "UP");
    map.put("service", "Enterprise-Support-Module");
    map.put("version", "2.0.4");
    return map;
}


}