package com.example.demo.controller;
import com.example.demo.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService
{
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId)
    {
        return new CloudVendor("01056000069", "Kari Nordmann",
                "1960-05-01", "2450000", "Vi skal låne penger til........",
                "300", "12", "annuitet" );
    }
}
