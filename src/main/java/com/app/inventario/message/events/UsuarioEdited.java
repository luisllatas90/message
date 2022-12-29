package com.app.inventario.message.events;

import lombok.Value;
import java.time.LocalDateTime;

@Value
public class UsuarioEdited {
	private String id;
    private String nombre;
    private String clave; 
    private LocalDateTime updatedAt;
    private String updatedBy;
}