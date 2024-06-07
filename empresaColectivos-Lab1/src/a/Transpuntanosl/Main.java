package a.Transpuntanosl;

import b.Entidades.Horario;
import b.Entidades.Pasajero;
import c.Data.HorariosData;
import c.Data.PasajerosData;
import java.util.List;


public class Main {


    public static void main(String[] args) {
        
        
        //Creando PasajeroData        
       PasajerosData pasajero = new PasajerosData();

        //Creando Pasajeros 
        Pasajero pasajero1 = new Pasajero(1,"Gaspar","Viola","42207510","gaspar5453@gmail.com","2664584524",true);
        Pasajero pasajero2 = new Pasajero(2,"Diego","Maradona","42577110","diegote10@gmail.com.ar","2658849247",true);
        Pasajero pasajero3 = new Pasajero(3,"Nahuel","Lucero","31607910","nahuelito1@gmail.com","2454584894",true);
        Pasajero pasajeros[] = new Pasajero[]{pasajero1,pasajero2,pasajero3};

        //Guardando Pasajeros 
        System.out.println("Guardar Pasajero");
        for(Pasajero pasaj : pasajeros){
            pasajero.añadirPasajero(pasaj);
        }
    
    
         //Buscando pasajero por Nombre 
        int idEncontrado = 2 ;          
        Pasajero pasajeroEncontrado = pasajero.buscarPasajero(idEncontrado);              
        if(pasajeroEncontrado != null){
            System.out.println("El Pasajero encontrado es: " + pasajeroEncontrado);
        }else{
            System.out.println("El Pasajero no se ha encontrado");
        }  

          //Listar  Pasajeros     
        List<Pasajero> lista = pasajero.listarPasajeros();    
        for(Pasajero pasaj : lista){
            System.out.println(pasaj);
            System.out.println("");
        }
        
        
        //Modificando Pasajero
        int pasajeroAModificar = 3;   
        Pasajero pasajeroModificado;        
        pasajeroModificado = new Pasajero(pasajeroAModificar,"Joaquin","Perro","42567111","joaquin@hotmail.com.es","2667584000",true);        
        pasajero.modificarPasajero(pasajeroModificado);

        //Eliminar un pasajero 
        int pasajeroAEliminar = 1;                         
        pasajero.eliminarPasajero(pasajeroAEliminar);
        
        
        
        
    }
    
}
