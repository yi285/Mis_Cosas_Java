import java.util.Scanner;
public class Registro_Inicio {

  
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    System.out.println("---Registro de Usuario---");
    System.out.println("Ingrese su usuario:");
    String usuario = lector.nextLine();
    System.out.println("Ingrese su contraseña:");
    String contraseña = lector.nextLine();
    
    System.out.println("");
    System.out.println("---Sistema de Acceso---");
    System.out.println("Ingresa el usuiario");
    String usuario_acceso = lector.nextLine();
    System.out.println("Ingresa la contraseña");
    String contraseña_acceso = lector.nextLine();
    
    boolean continuar = false;
    if(usuario.equals(usuario_acceso) && contraseña.equals(contraseña_acceso)){
        System.out.println("Acceso concedido");
        continuar = true;
    }else{
        System.out.println("Acceso denegado");
    }
    
    if (continuar == true) {
        System.out.println("");
        System.out.println("---Tus datos de registro---");
        System.out.println("Usuario: " + usuario);
        System.out.println("Contraseña: " + contraseña);

        System.out.println("");
        System.out.println("---añadir datos adiconales---");
        System.out.println("Ingresa tu numero de telefono:");
        String  num = lector .nextLine();
        System.out.println("Ingresa tu correo:");
        String correo = lector .nextLine();
        System.out.println("Ingresa tu direccion:");
        String direccion = lector .nextLine();

        System.out.println("");
        System.out.println("---Tus datos adicionales---");
        System.out.println("Numero de telefono: " + num);
        System.out.println("Correo: " + correo);
        System.out.println("Direccion: " + direccion);
    }
    lector.close();
    }
}