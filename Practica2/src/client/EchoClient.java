
package client;
import java.io.*;
import java.net.*;

public class EchoClient {
    //definimos el Stub del cliente
    private static EchoObjectStub ss;
    
    public static void main(String[] args) 
    {
        // revisamos que los argumentos para ejecutar el programa son correctos
        String tar="";
        int can=0;
        int cvv=0;
        /*if (args.length<2) {
            System.out.println("Para ejecutar , hazlo en este formato: Echo <nombre o IP del Equipo> <numero de puerto>");
            System.exit(1);
        }*/
        //instanciamos el STUB
        ss = new EchoObjectStub();
    // le asignamos al STUB el puerto y nombre del equipo HOST (el nombre del servidor) 
        //ss.setHostAndPort(args[0],Integer.parseInt(args[1]));
        ss.setHostAndPort("localhost",1007);
        String input,output;
        int res=0;
        try {  
                    //construyo un bucle infinito:

            //while(true){
                //preparo "apuntador" que es el lector de flujo para el teclado
                System.out.println("Cliente: Conexion exitosa");
                BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));
                // asigno a una variable y leo una linea del lector de flujo que leyo del teclado
                System.out.println("INGRESE LA TARJETA con formato en giones(XXXX-XXXX-XXXX-XXXX)");
                tar=in.readLine();
                System.out.println("\nINGRESE EL CVV DE LA TARJETA ");
                cvv=Integer.parseInt(in.readLine());
                System.out.println("\nINGRESE LA CANTIDAD A PAGAR \n");
                can=Integer.parseInt(in.readLine());
               // Invocar el stub con el metodo remoto echo e Imprimir .. 
                //por pantalla lo que regreso el metodo remoto echo
                res=ss.echo(can,tar,cvv);
                if(res==1){
                    System.out.println("\nLA TRANSACCION FUE UN EXITO");
                }else{
                    System.out.println("\nLA TRANSACCION NO FUE EXITOSA");
                }
            //}
        } 
        //catch (UnknownHostException e) {
            //System.err.println("Don't know about host: "+ args[0]);
        //} 
        catch (IOException e) {
            System.err.println("Falla conexion de E/S con el host:"+args[0]);
        }
    }
}
