package com.example.springbootdeployment.util;

import lombok.AllArgsConstructor;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class APIResponse{
    private  int statusCode;
    private String message;
    private Object data;

}



