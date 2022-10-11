
package rmi;
//Interfaz de tipo remota, cabe resaltar que
// solo tiene el metodo echo ( no hay instrucciones) 
public interface EchoInterface extends java.rmi.Remote 
{
    public int echo(int can,String tar,int cvv)throws java.rmi.RemoteException;
}





