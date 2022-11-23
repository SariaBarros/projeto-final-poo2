package servicos;

import interfaces.CalcularTipoEntrega;

import java.math.BigDecimal;

public class EntregaSedexHoje implements CalcularTipoEntrega {
    @Override
    public BigDecimal calcularEntrega() {
        BigDecimal valor = new BigDecimal(25);
        return valor;
    }
}
