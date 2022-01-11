package GameConfig;

import java.util.List;
import java.util.Scanner;

public class Juego {
    Scanner sc = new Scanner(System.in);

    public String responderPregunta(){
        String respuesta ="";
        while(
            !(respuesta.equalsIgnoreCase("A")||respuesta.equalsIgnoreCase("B")
            ||respuesta.equalsIgnoreCase("C")||respuesta.equalsIgnoreCase("D"))){
                System.out.println("Escriba su respuesta");
                respuesta=(sc.nextLine());
        }
        return respuesta;
    }

    public String acumularPremio(List<Ronda> rondas){
        int totalPuntos=0;
        int totalEfectivo=0;
        for (Ronda ronda:
             rondas) {
            if(ronda.getOpcRespuesta().equalsIgnoreCase(ronda.getPregunta().getOpcCorrecta())){
                if(ronda.getPremio().isPuntos()){
                    totalPuntos+= ronda.getPremio().getValor();
                }else{
                    totalEfectivo+=ronda.getPremio().getValor();
                }
            }
        }
        return "Total puntos acumulados: "+totalPuntos +"\n Total efectivo acumulado: " + totalEfectivo;
    }
    public String finJuegoVoluntarioOGanarRondaFinal(List<Ronda> rondas){
        guardarDatos(rondas);
        return("Felicidades, total acumulado: " + acumularPremio(rondas));
    }
    public String finJuegoForzadoOPerder(List<Ronda> rondas){
        guardarDatos(rondas);
        return("Respuesta incorrecta, has perdido, acumulado: 0");
    }

    public void guardarDatos(List<Ronda> rondas){
        //TODO logica persistir en tabla
    }
}
