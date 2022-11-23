package modelos;

import java.math.BigDecimal;

public class Postagem {
    private Remetente remetente;
    private Destinatario destinatario;
    private BigDecimal valorEntrega;

    public Postagem(Remetente remetente, Destinatario destinatario, BigDecimal valorEntrega) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.valorEntrega = valorEntrega;
    }

    public Remetente getRemetente() {
        return remetente;
    }

    public void setRemetente(Remetente remetente) {
        this.remetente = remetente;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public BigDecimal getValorEntrega() {
        return valorEntrega;
    }

    public void setValorEntrega(BigDecimal valorEntrega) {
        this.valorEntrega = valorEntrega;
    }

    @Override
    public String toString() {
        return "Postagem{" +
                "remetente=" + remetente +
                ", destinatario=" + destinatario +
                ", valorEntrega=" + valorEntrega +
                '}';
    }
}
