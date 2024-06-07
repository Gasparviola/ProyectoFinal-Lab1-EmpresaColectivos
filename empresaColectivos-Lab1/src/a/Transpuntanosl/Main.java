package a.Transpuntanosl;

import b.Entidades.Colectivo;
import b.Entidades.Horario;
import b.Entidades.Pasajero;
import c.Data.ColectivoData;
import c.Data.HorariosData;
import c.Data.PasajerosData;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Creando PasajeroData        
        PasajerosData pasajero = new PasajerosData();

        //Creando Pasajeros 
        Pasajero pasajero1 = new Pasajero(1, "Gaspar", "Viola", "42207510", "gaspar5453@gmail.com", "2664584524", true);
        Pasajero pasajero2 = new Pasajero(2, "Diego", "Maradona", "42577110", "diegote10@gmail.com.ar", "2658849247", true);
        Pasajero pasajero3 = new Pasajero(3, "Nahuel", "Lucero", "31607910", "nahuelito1@gmail.com", "2454584894", true);
        Pasajero pasajeros[] = new Pasajero[]{pasajero1, pasajero2, pasajero3};

        //Guardando Pasajeros 
        System.out.println("Guardar Pasajero");
        for (Pasajero pasaj : pasajeros) {
            pasajero.añadirPasajero(pasaj);
        }

        //Buscando pasajero por Nombre 
        int idEncontrado = 2;
        Pasajero pasajeroEncontrado = pasajero.buscarPasajero(idEncontrado);
        if (pasajeroEncontrado != null) {
            System.out.println("El Pasajero encontrado es: " + pasajeroEncontrado);
        } else {
            System.out.println("El Pasajero no se ha encontrado");
        }

        //Listar  Pasajeros     
        List<Pasajero> lista = pasajero.listarPasajeros();
        for (Pasajero pasaj : lista) {
            System.out.println(pasaj);
            System.out.println("");
        }

        //Modificando Pasajero
        int pasajeroAModificar = 3;
        Pasajero pasajeroModificado;
        pasajeroModificado = new Pasajero(pasajeroAModificar, "Joaquin", "Perro", "42567111", "joaquin@hotmail.com.es", "2667584000", true);
        pasajero.modificarPasajero(pasajeroModificado);

        //Eliminar un pasajero 
        int pasajeroAEliminar = 1;
        pasajero.eliminarPasajero(pasajeroAEliminar);

        //Creando ColectivoData        
        ColectivoData colectivo = new ColectivoData();

        //Crando ColectivoData
        Colectivo colectivo1 = new Colectivo(1, "ABC123", "Mercedes Benz", "con aire", 70, true);
        Colectivo colectivo2 = new Colectivo(2, "DEF456", "BMW", "sin aire", 40, true);
        Colectivo colectivo3 = new Colectivo(3, "GHI789", "Volvo", "con aire / asiento cama", 80, true);
        Colectivo colectivos[] = new Colectivo[]{colectivo1, colectivo2, colectivo3};

        //Guardando Colectivos
        System.out.println("Guardar Colectivo");
        for (Colectivo cole : colectivos) {
            colectivo.guardarColectivo(cole);
        }
        
        //Buscando colectivo por matricula 
        int idColectivoEncontrado = 1;
        Colectivo colectivoEncontrado = colectivo.buscarColectivo(idColectivoEncontrado);
        if (colectivoEncontrado != null) {
            System.out.println("El colectivo encontrado es: " + idColectivoEncontrado);
        } else {
            System.out.println("El colectivo no se ha encontrado");
        }
        
        //Listar  Colectivos     
        List<Colectivo> listaCole = colectivo.listarColectivos();
        for (Colectivo cole : listaCole) {
            System.out.println(cole);
            System.out.println("");
        }
        
        //Modificando Pasajero
        String matriculaModificar= "DEF456";
        Colectivo matriculaModificada;
        matriculaModificada = new Colectivo(idColectivoEncontrado, "GHJ666", "Nissan", "CocheCama/Aire/Tv", 60, true);
        colectivo.modificarColectivo(matriculaModificada);
        
        
        //Eliminar un Colectivo
        int colectivoAEliminar = 1;
        colectivo.eliminarColectivo(colectivoAEliminar);
        
    }

}
