 

public class Lote {
    private int numeroDeLote;
    private String descripcion;

    //tiene una dependencia
    private Oferta ofertaMaxima;

    public Lote(int numeroDeLote, String descripcion){
        this.numeroDeLote = numeroDeLote;
        this.descripcion = descripcion;

    }

    public int getNumeroDeLote() {
        return numeroDeLote;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Oferta getOfertaMaxima() {
        return ofertaMaxima;
    }


    //Esta no es la forma de INJECTAR UNA DEPENDENCIA, pero bueno, el docente sabrá lo que hace.
    public void setOfertaMaxima(Oferta ofertaMaxima) {
        this.ofertaMaxima = ofertaMaxima;
    }
}
