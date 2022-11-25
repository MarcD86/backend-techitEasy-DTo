package com.example.techiteasydtoles12.dto;

import jakarta.validation.constraints.NotBlank;

public class TelevisionInputDto {

    @NotBlank
    public String type;
    @NotBlank
    public String brand;
    @NotBlank
    public String name;
    @NotBlank
    public double price;

    public double availableSize;

    public double refreshRate;

    public  String screenType;

    public String screenQuality;

    public boolean smartTv;

    public boolean wifi;

    public boolean voiceControl;

    public boolean hdr;

    public boolean bluetooth;

    public boolean ambiLight;
    @NotBlank
    public int originalStock;
    @NotBlank
    public int sold;
}
