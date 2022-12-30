package com.app.inventario.message.queries;

public class GetHistoryByPlatoId {
    private final String platoId;

    public GetHistoryByPlatoId(String platoId) {
        this.platoId = platoId;
    }

    public String getPlatoId() {
        return platoId;
    }
}