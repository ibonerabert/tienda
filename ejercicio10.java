import java.util.HashMap;
import java.util.Scanner;
/**
 * Write a description of class ejercicio10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ejercicio10
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> map;

    /**
     * Constructor for objects of class ejercicio10
     */
    public ejercicio10()
    {

    }
    public  void main1()
    {
        Scanner sc = new Scanner (System.in);
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("rojo", "red");
        map.put("azul", "blue");
        map.put("amarillo", "yellow");
        map.put("naranja", "orange");
        String palabra;

        System.out.println("dime una palabra");
        palabra=sc.nextLine();
        if(map.containsKey(palabra))
        {
            System.out.println(palabra+ " la traduccion es: " + map.get(palabra)); 
        }else
        {
            System.out.println("la palabra no existe");
        }
    }

    public static void main(String[] args) 
    {
        HashMap<String, String> m = new HashMap<String, String>();
        m.put("ordenador", "computer");
        m.put("gato", "cat");
        m.put("rojo", "red");
        m.put("arbol", "tree");
        m.put("pinguino", "penguin");
        m.put("sol", "sun");
        m.put("agua", "water");
        m.put("viento", "wind");
        m.put("siesta", "nap");
        m.put("arriba", "up");
        m.put("raton", "mouse");
        m.put("estadio", "arena");
        m.put("calumnia", "aspersion");
        m.put("aguacate", "avocado");
        m.put("cuerpo", "body");
        m.put("concurso", "contest");
        m.put("cena", "dinner");
        m.put("salida", "exit");
        m.put("lenteja", "lentil");
        m.put("cacerola", "pan");
        m.put("pastel", "pie");
        m.put("membrillo", "jam");
        Scanner sc = new Scanner(System.in);
        boolean fin = false;
        do {
            System.out.print("\nIntroduzca una palabra en español: ");
            String palabraIntro = sc.nextLine();
            if (!palabraIntro.toLowerCase().equals("fin")){
                if (m.containsKey(palabraIntro)) {
                    System.out.println(palabraIntro + " en ingles es " + m.get(palabraIntro));
                } else {
                    System.out.print("Lo siento, no conozco esa palabra.");
                }
            } else {
                fin = true;}
        } while (!fin);
    }
}


