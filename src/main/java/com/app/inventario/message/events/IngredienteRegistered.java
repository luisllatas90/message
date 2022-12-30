package com.app.inventario.message.events;

import lombok.Value;
import java.time.LocalDateTime;
import java.util.Date;

@Value
public class IngredienteRegistered {
	private String id;    
	private String nombre;
    private String cantidad;
    private String precioIngrediente;
    private String fechaVencimiento;
    private String fechaAdquisicion;
    private LocalDateTime createdAt;
    private String createdBy;
}