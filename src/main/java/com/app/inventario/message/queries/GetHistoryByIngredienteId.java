package com.app.inventario.message.queries;

public class GetHistoryByIngredienteId {
    private final String ingredienteId;

    public GetHistoryByIngredienteId(String ingredienteId) {
        this.ingredienteId = ingredienteId;
    }

    public String getIngredienteId() {
        return ingredienteId;
    }
}