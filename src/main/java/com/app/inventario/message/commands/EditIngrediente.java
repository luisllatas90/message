package com.app.inventario.message.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
import java.time.LocalDateTime;
import java.util.Date;

@Value
public class EditIngrediente {
    @TargetAggregateIdentifier
    private String id;   
    private String nombre;
    private String cantidad;
    private String precioIngrediente;
    private String fechaVencimiento;
    private String fechaAdquisicion;
    private String updatedBy;
}