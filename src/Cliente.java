

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;



public class Cliente {
   
    
    public static void main (String[] args){
        
        try {
            
            Registry conexao = LocateRegistry.getRegistry("127.0.0.1", 1522);
            Interface objetoRemoto = (Interface) conexao.lookup("chave");
            
            int x = 1;
            int y = 2;
            
            System.out.println(objetoRemoto.somar(x, y));
            
            
         
                    
        }catch (RemoteException ex){
            
            System.out.println(ex.getMessage());
            
        }catch (NotBoundException ex){
            
            System.out.println(ex.toString());
            
        }
        
    }
    
}
