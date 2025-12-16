package com.example.cicd1216_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/hicicd")
    public String hicicd() {
        return "hi, CICD2 1216^^";
    }

    @GetMapping("/hicicd2")
    public String hicicd2() {
        return "hi2, New CICD2 1216^^";
    }

    @GetMapping("/hicicd3")
    public String hicicd3() {
        return "hi3, New CICD2 적용 1216^^";
    }
}
