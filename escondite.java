import java.util.Scanner;
import java.util.Random;

public class escondite {

    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    Random generador = new Random();
    System.out.println("Vamos a jugar a un juego");
    System.out.println("Elije un numero del 1 al 10");
    System.out.println("Si la maquiina es capaz de elegir el mismo numero que tu  pierdes");
    int intentos = 0;
    int Puntosmaquina = 0;
    int Puntosjugador = 0;

    while(intentos != 6){
    System.out.println("Elije tu numero");
    int num = lector.nextInt();
    int maquina = generador.nextInt(0,11);
    if (num==maquina) {
        System.out.println("Empate");
        intentos++;
    }else if(num>maquina){
        System.out.println("Has ganado");
        intentos++;
        Puntosjugador++;
    
    }else{
        System.out.println("Has perdido");
        intentos++;
        Puntosmaquina++;    
    }
}
    if (Puntosmaquina == Puntosjugador) {
    System.out.println("Habeis empatado");
    }else if(Puntosjugador > Puntosmaquina) {
    System.out.println("Has ganado tienes " + Puntosjugador + " puntos y la maquina " + Puntosmaquina);
    }else{
    System.out.println("Has perdido tienes " + Puntosjugador + " puntos y la maquina " + Puntosmaquina);
    }
    lector.close();
    }
}