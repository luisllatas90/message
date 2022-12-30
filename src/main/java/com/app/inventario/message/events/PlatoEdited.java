package com.app.inventario.message.events;

import lombok.Value;
import java.time.LocalDateTime;
import java.util.Date;

@Value
public class PlatoEdited {
	private String id;     
    private String nombre;
    private String costoPlato;
    private String codIngrediente; 
    private LocalDateTime updatedAt;
    private String updatedBy;
}