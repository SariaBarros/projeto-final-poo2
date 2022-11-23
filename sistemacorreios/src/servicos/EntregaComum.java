package servicos;

import interfaces.CalcularTipoEntrega;

import java.math.BigDecimal;

public class EntregaComum implements CalcularTipoEntrega {
    @Override
    public BigDecimal calcularEntrega() {
        BigDecimal valor = new BigDecimal(5);
        return valor;
    }
}
