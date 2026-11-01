package com.gcp.demo.gcpController;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController 
public class GcpController {

    @GetMapping("/gcp/hey")
    public String gcpReqString(){
        return "Welcome to GCP controller Version 2 hey hey";
    }
}
