package died.lab01.problema03;

import died.lab01.problema02.Temperatura;
import died.lab01.problema02.Escala;

public class Registro {
    private String ciudad;
    private Temperatura[] historico;
    private final int HISTORIALMAX = 50;
    private int lastIndex;

    public Registro(){
        this.ciudad="-";
        this.historico = new Temperatura[HISTORIALMAX];
        this.lastIndex = 0;
    }

    public Registro(String ciudad){
        this.ciudad = ciudad;
        historico = new Temperatura[HISTORIALMAX];
    }

    public String getCiudad(){
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Temperatura[] getHistorico() {
        return historico;
    }

    public void setHistorico(Temperatura[] historico) {
        this.historico = historico;
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public void setLastIndex(int lastIndex) {
        this.lastIndex = lastIndex;
    }

    public void imprimir() {
        System.out.println("TEMPERATURAS REGISTRADAS EN: " + this.ciudad);
        for(int i=0; i<this.lastIndex; i++) {
            System.out.println((i+1) + " " + this.historico[i].toString());
        }
    }

    public void agregar(Temperatura t) {
        if(this.lastIndex==(HISTORIALMAX)) {
            return;
        }
        this.historico[lastIndex] = t;
        lastIndex++;
    }

    public Double mediaAsCelcius(){
        Double promedio = 0.0;
        int mediciones=0;
        for(int i=0; i<this.lastIndex; i++) {
            promedio += this.historico[i].asCelcius();
            mediciones++;
        }
        return promedio/mediciones;
    }

    public Double mediaAsFahrenheit(){
        Double promedio = 0.0;
        int mediciones=0;

        for(int i=0; i<this.lastIndex; i++) {
            promedio += this.historico[i].asFarenheit();
            mediciones++;
        }
        return promedio/mediciones;
    }

    public Temperatura getMaximaTemperatura(){

        if(this.lastIndex==0){
            return null;
        }

        Temperatura maximo;
        Temperatura maxTemp1=this.historico[0];
        Temperatura maxTemp2=this.historico[0];

        //Llamo al metodo auxiliar que ejecutará el recursivo
        maximo = obtenerMaximo(this.historico, 0, this.lastIndex-1, maxTemp1, maxTemp2);

        return maximo;
    }


    private Temperatura obtenerMaximo(Temperatura[] temperaturas, int inicio, int fin, Temperatura maxTemp1, Temperatura maxTemp2){
        if(inicio==fin){
            return temperaturas[inicio];
        }
        else{
            maxTemp1 = obtenerMaximo(temperaturas, inicio, inicio+(fin-inicio)/2, maxTemp1, maxTemp2);

            maxTemp2 = obtenerMaximo(temperaturas, inicio + (fin-inicio)/2 + 1, fin, maxTemp1, maxTemp2);

            if(maxTemp1.asCelcius() > maxTemp2.asCelcius()){
                return maxTemp1;
            }
            else
                return maxTemp2;
        }
    }

}
