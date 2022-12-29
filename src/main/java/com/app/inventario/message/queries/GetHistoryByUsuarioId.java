package com.app.inventario.message.queries;

public class GetHistoryByUsuarioId {
    private final String usuarioId;

    public GetHistoryByUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUsuarioId() {
        return usuarioId;
    }
}