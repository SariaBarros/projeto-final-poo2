package modelos;

public class Contato {
    private String numTelefone;
    private String email;
    private String numTelefoneExtra;

    public Contato(String numTelefone, String email) {
        this.numTelefone = numTelefone;
        this.email = email;
    }

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumTelefoneExtra() {
        return numTelefoneExtra;
    }

    public void setNumTelefoneExtra(String numTelefoneExtra) {
        this.numTelefoneExtra = numTelefoneExtra;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "numTelefone='" + numTelefone + '\'' +
                ", email='" + email + '\'' +
                ", numTelefoneExtra='" + numTelefoneExtra + '\'' +
                '}';
    }
}
