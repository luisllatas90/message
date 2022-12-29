package com.app.inventario.message.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
import java.time.LocalDateTime;

@Value
public class EditUsuario {
    @TargetAggregateIdentifier
    private String id;
    private String nombre;
    private String clave; 
    private String updatedBy;
}