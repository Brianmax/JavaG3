package com.example.relacionesjpa.response;

import com.example.relacionesjpa.model.Estudiante;
import lombok.AllArgsConstructor;

import java.util.Optional;
@AllArgsConstructor
public class ResponseBase {
    private int codigo;
    private String mensaje;
    private boolean succes;
    private Optional data;
}
