package GameConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Config {
    List<Categoria> categorias = new ArrayList<>();
    List<Premio> premios = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void ConfigMenu() {

        boolean salir = false;
        do{
            System.out.println("1. Crear Categoria\n2. Listar Categorias." +
                    "\n3. Crear Premios.\n4. Salir.");
            try{
                String seleccion = sc.nextLine();
                switch (seleccion){
                    case "1":
                        crearCategoria();
                        break;
                    case "2":
                        listarCategorias(categorias);
                        break;
                    case "3":
                        configurarPremios();
                        break;
                    case "4":
                        salir = true;
                        break;
                    default:
                        System.out.println("Escoja opcion del 1-4");
                }
            }catch(Exception e){
                System.err.println("opcion erronea");
                e.printStackTrace();
            }

        }while(!salir);
    }

    public void crearCategoria(){
        System.out.println("Creando categoria");
        Categoria categoria = new Categoria();
        System.out.println("nombre");
        categoria.setNombre(sc.nextLine());
        System.out.println("nivel");
        categoria.setNivel(Integer.parseInt(sc.nextLine()));

        List<Pregunta> preguntasCategoria = new ArrayList<>();
        System.out.println("Agregando preguntas...");

        while (preguntasCategoria.size()<5){
            preguntasCategoria.add(crearPregunta());
        }

        for (Pregunta pregunta:preguntasCategoria
             ) {
            System.out.println(pregunta.toString());
        }
        categoria.setPreguntas(preguntasCategoria);
        categorias.add(categoria);
        System.out.println("categoria creada");
    }

    public List<Categoria> listarCategorias(List<Categoria> categorias){
        System.out.println("Listando categorias");
        for (Categoria categoria:
             categorias) {
             System.out.println(categoria.toString());
        }
        return categorias;
    }

    public Pregunta crearPregunta(){
        System.out.println("Creando pregunta");
        Pregunta pregunta = new Pregunta();
        System.out.println("descripcion");
        pregunta.setDescripcion(sc.nextLine());
        System.out.println("opcA");
        pregunta.setOpcA(sc.nextLine());
        System.out.println("opcB");
        pregunta.setOpcB(sc.nextLine());
        System.out.println("opcC");
        pregunta.setOpcC(sc.nextLine());
        System.out.println("opcD");
        pregunta.setOpcD(sc.nextLine());
        System.out.println("opcion correcta");
        pregunta.setOpcCorrecta(sc.nextLine());
        return pregunta;
    }

    public List<Premio> configurarPremios(){
        premios.clear();
        for(int i=1;i<=5;i++){
            System.out.println("Premio Ronda " + i);
            Premio premio = new Premio();
            System.out.println("1: puntos, otro valor: efectivo");
            if(sc.nextLine().equalsIgnoreCase("1")){
                premio.setPuntos(true);
            }else{
                premio.setPuntos(false);
            }
            System.out.println("valor");
            premio.setValor(Integer.parseInt(sc.nextLine()));
            premio.setRonda(i);
            premios.add(premio);
        }
        return premios;
    }

    public List<Premio> getPremios() {
        return premios;
    }

    public void responderPregunta(String respuesta, Pregunta pregunta){
        respuesta.compareToIgnoreCase(pregunta.getOpcCorrecta());
    }
}
