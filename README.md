# RestAPI-SpringBoot
Rest API created with Spring Boot and Java
<img align="justify" alt="chart" width="950px" src="https://github.com/zhekovdobri/RestAPI-SpringBoot/blob/main/GET_RestAPI_SpringBoot.png?raw=true">
###
<img align="justify" alt="chart" width="950px" "https://github.com/zhekovdobri/RestAPI-SpringBoot/blob/main/RestAPI_SpringBoot_Browser.png?raw=true">

#### By: Dobri Zhekov

## Technologies Used

* _Spring Boot_
* _Java_

<br />

## Code

### DemoApplication
```
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

}

```
### class CloudVendor - the model

```
package com.example.demo.model;
public class CloudVendor
{
    private String Fodselsnummer;
    private String Navn;
    private String Fodselsdato;
    private String lanebelop;
    private String behov;
    private String lopetid;
    private String avdragsfriPeriode;
    private String type;

    public CloudVendor() {
    }

    public CloudVendor(String fodselsnummer, String navn, String fodselsdato, String lanebelop, String behov, String lopetid, String avdragsfriPeriode, String type) {
        Fodselsnummer = fodselsnummer;
        Navn = navn;
        Fodselsdato = fodselsdato;
        this.lanebelop = lanebelop;
        this.behov = behov;
        this.lopetid = lopetid;
        this.avdragsfriPeriode = avdragsfriPeriode;
        this.type = type;
    }

    public String getFodselsnummer() {
        return Fodselsnummer;
    }

    public void setFodselsnummer(String fodselsnummer) {
        Fodselsnummer = fodselsnummer;
    }

    public String getNavn() {
        return Navn;
    }

    public void setNavn(String navn) {
        Navn = navn;
    }

    public String getFodselsdato() {
        return Fodselsdato;
    }

    public void setFodselsdato(String fodselsdato) {
        Fodselsdato = fodselsdato;
    }

    public String getLanebelop() {
        return lanebelop;
    }

    public void setLanebelop(String lanebelop) {
        this.lanebelop = lanebelop;
    }

    public String getBehov() {
        return behov;
    }

    public void setBehov(String behov) {
        this.behov = behov;
    }

    public String getLopetid() {
        return lopetid;
    }

    public void setLopetid(String lopetid) {
        this.lopetid = lopetid;
    }

    public String getAvdragsfriPeriode() {
        return avdragsfriPeriode;
    }

    public void setAvdragsfriPeriode(String avdragsfriPeriode) {
        this.avdragsfriPeriode = avdragsfriPeriode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

```
### CloudAPIService - controller 

```
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

```

## Description
A simple Rest API, created with Spring Boot and Java.

## Setup/Installation Requirements

### Clone a repository using the command line 

1. From the repository, click "Code" and copy the address (either the SSH format or the HTTPS). 
2. From a terminal window (cmd or Bash), change to the local directory where you want to clone your repository.
3. Paste the address you copied from GitHub, with one of the next comand:

* **Clone over HTTPS**<br>
  $ git clone (https://..)
  
* **Clone over SSH**<br>
  $ git clone (ssh://..)

## Known Bugs

* No bugs

## License

<sub><sup>Copiright © 2016-2023 Dobri Zhekov All Rights Reserved</sup></sub>

