package com.example.refuerzoJueves.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
public class ResponseBase {
    private int codigo;
    private String mensaje;
    private Boolean exito;
    private Optional data;
}
