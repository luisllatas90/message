package com.app.inventario.message.events;

import lombok.Value;
import java.time.LocalDateTime;

@Value
public class UsuarioRegistered {
	private String id;
    private String nombre;
    private String clave; 
    private LocalDateTime createdAt;
    private String createdBy;
}