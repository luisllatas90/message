package com.app.inventario.message.events;

import lombok.Value;
import java.time.LocalDateTime;

@Value
public class PlatoRegistered {
	private String id;    
    private String nombre;
    private String costoPlato;
    private String codIngrediente;  
    private LocalDateTime createdAt;
    private String createdBy;
}