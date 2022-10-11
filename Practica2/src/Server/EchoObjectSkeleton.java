
package Server;
import java.net.*;
import java.io.*;
import java.text.*;
import java.util.*;
import rmi.EchoInterface;
public class EchoObjectSkeleton implements EchoInterface {
    String myURL="localhost";
    //Constructor de la clase EchoObjectSkeleton
    public EchoObjectSkeleton()
    {
        try {
// obtengo el nombre del equipo donde estoy ejecutando y lo guardo en la propiedad MyURL
            myURL=InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e) 
               {
                // si no pude conocer el nombre del equipo, mantengo el nombre localhost para MyURL
               myURL="localhost";
              }
    }
// el Metodo Echo que es la implementacion de la interfaz EchoInterface
    public int echo(int can,String tar,int cvv) throws java.rmi.RemoteException 
    {
// toma la fecha y hora 
        // escribe la fecha y la hora, nombre de compuadora y lo regresa
        int res=0;
        int cantidad=4500;
        String tarjeta="0156-6874-2941-3020";
        int CVV=645;
        
        if(tar.equals(tarjeta)){
            if(cvv==CVV){
                if(can<=cantidad){
                    res=1;
                }
                else{
                    res=0;
                }
            }
            else{
                res=0;
            }
        }
        else{
            res=0;
        }
        return res;
    }
   }
