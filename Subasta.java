 

import java.util.ArrayList;

public class Subasta {

    private ArrayList<Lote> lotes;
    private int numeroSiguiente;

    public Subasta(){
        this.lotes = new ArrayList();
        this.numeroSiguiente = 0;
    }

    public void ingresarLote(Lote lote){
        lotes.add(lote);
        numeroSiguiente++;
    }

    public void ofertarPara(int numeroLote, Oferta ofertante){
        //El que oferta mas que todos las personas que realizan una oferta, gana la oferta
        for (Lote loteParaEncontrar: lotes) {
            if (loteParaEncontrar.getNumeroDeLote() == numeroLote){

                //aqui pregunto si este lote tiene una oferta, porque si no me dará una error de NullPointer
                if (loteParaEncontrar.getOfertaMaxima() == null){
                    //establecemos la primera oferta que entra por parametro
                    loteParaEncontrar.setOfertaMaxima(ofertante);


                } else {
                    //entonces asignamos el valor del ofertante maximo si es maximo o no al del que viene por parametro
                    if (loteParaEncontrar.getOfertaMaxima().getMonto() < ofertante.getMonto()){
                        //entonces le asignamos el nuevo valor maximo
                        loteParaEncontrar.setOfertaMaxima(ofertante);

                    }


                }

            }

        }

    }


    public void mostrarLote(int numeroLote){
        //mostramos un objeto de Lote donde, en sus astributos se numero de lote sea
        //igula al ingresado
        System.out.println("------------------------------------------------------------------");
        for (Lote loteParaEncontrar: lotes) {
            if (loteParaEncontrar.getNumeroDeLote() == numeroLote){
                System.out.println("LOTE ENCONTRADO!!");
                System.out.println("Numero de lote: " + loteParaEncontrar.getNumeroDeLote());
                System.out.println("Descripcion de lote: " + loteParaEncontrar.getDescripcion());

                if (loteParaEncontrar.getOfertaMaxima() == null){
                    System.out.println("NADIE PUJÓ POR ESTE LOTE TODAVIA");
                    System.out.println("Oferta maxima del lote: " + loteParaEncontrar.getOfertaMaxima());
                    System.out.println("Nombre de la persona ganador del lote subastado: " + loteParaEncontrar.getOfertaMaxima());
                    System.out.println("------------------------------------------------------------------");

                } else {
                    System.out.println("Oferta maxima del lote: " + loteParaEncontrar.getOfertaMaxima().getMonto());
                    System.out.println("Nombre de la persona ganador del lote subastado: " + loteParaEncontrar.getOfertaMaxima().getOfertante().getNombre());
                    System.out.println("------------------------------------------------------------------");

                }

                break;
            }

        }

    }


    public ArrayList<Lote> getLotes() {
        return lotes;
    }

}
