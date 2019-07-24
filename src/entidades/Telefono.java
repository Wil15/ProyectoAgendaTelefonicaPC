package entidades;

public class Telefono {
    
    private long numero = 0l;
    private String tipo = "";

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return String.valueOf(this.numero);
    }
}
