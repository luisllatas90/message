package com.app.inventario.message.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.time.LocalDateTime;
import java.util.Date;

@Value
public class EditPlato {
    @TargetAggregateIdentifier
    private String id;    
    private String nombre;
    private String costoPlato;
    private String codIngrediente; 
    private String updatedBy;
}