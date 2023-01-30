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
