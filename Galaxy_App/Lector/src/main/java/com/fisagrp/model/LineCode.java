package com.fisagrp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LineCode {
    int number ;
    String code;
    boolean validate;
}
