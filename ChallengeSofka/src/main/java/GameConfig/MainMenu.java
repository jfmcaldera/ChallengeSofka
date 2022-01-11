package GameConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        Config configurate = new Config();
        do{
            System.out.println("1. Configurar Juego. \n2. Iniciar Juego.\n3. Salir.");
            try{
                String seleccion = sc.nextLine();
                switch (seleccion){
                    case "1":
                        configurate.ConfigMenu();
                        break;
                    case "2":
                        System.out.println("Go to Start a game");
                        if(configurate.getPremios().size()!=5){
                            System.out.println("Configure los premios de cada ronda desde la opcion de configuracion:");
                        }else{
                            if(configurate.getCategorias().size()<5){
                                System.out.println("Deben existir por lo menos 5 categorías antes de iniciar el juego, por favor configurelas");
                            }else{
                                Concursante concursante = new Concursante();
                                concursante.setNombre("Juan Muñoz");
                                concursante.setEdad(26);
                                concursante.setEmail("inge.jfmc@gmail.com");
                                concursante.setDocumento("12343143");

                                List<Ronda> rondas = new ArrayList<>();
                                rondas.clear();
                                Juego juego = new Juego();
                                for (int i=0;i<5;i++){
                                    //ronda 1
                                    Ronda ronda = new Ronda(concursante,configurate.getCategorias().get(i),configurate.getPremios().get(i));
                                    System.out.println("Ronda " + ronda.getPremio().getRonda());
                                    System.out.println("Premio puntos: " + ronda.getPremio().isPuntos() +" valor: " +ronda.getPremio().getValor());
                                    System.out.println(("Pregunta: "+ronda.getPregunta().getDescripcion()) +
                                            "OpcA: " +ronda.getPregunta().getOpcA() +
                                            "OpcB: " +ronda.getPregunta().getOpcB() +
                                            "OpcC: " +ronda.getPregunta().getOpcC() +
                                            "OpcD: " +ronda.getPregunta().getOpcD());
                                    String respuesta = juego.responderPregunta();
                                    ronda.setOpcRespuesta(respuesta);
                                    rondas.add(ronda);
                                    if(ronda.getPregunta().getOpcCorrecta().equalsIgnoreCase(respuesta)){
                                        if(ronda.getPremio().getRonda()==5){
                                            System.out.println(juego.finJuegoVoluntarioOGanarRondaFinal(rondas));
                                            break;
                                        }
                                    }else{
                                        System.out.println(juego.finJuegoForzadoOPerder(rondas));
                                        break;
                                    }
                                }

                            }
                        }

                        break;
                    case "3":
                        System.out.println("exit");
                        salir = true;
                        break;
                    default:
                        System.out.println("Escoja opcion del 1-3");
                }
            }catch(Exception e){
                e.printStackTrace();
                System.err.println("opcion erronea");
            }

        }while(!salir);
    }
}
