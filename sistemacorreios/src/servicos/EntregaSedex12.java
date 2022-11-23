package servicos;

import interfaces.CalcularTipoEntrega;

import java.math.BigDecimal;

public class EntregaSedex12 implements CalcularTipoEntrega {
    @Override
    public BigDecimal calcularEntrega() {
        BigDecimal valor = new BigDecimal(20);
        return valor;
    }

}
