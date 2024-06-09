package a.Transpuntanosl;

import b.Entidades.Colectivo;
import b.Entidades.Horario;
import b.Entidades.Pasajero;
import b.Entidades.Ruta;
import c.Data.ColectivoData;
import c.Data.HorariosData;
import c.Data.PasajerosData;
import c.Data.RutaData;
import java.time.LocalTime;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
    //PasajeroPrueba
        
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
    
    //Colectivo Pruebas
    
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
        
        //Modificando Colectivo
        String matriculaModificar= "DEF456";
        Colectivo matriculaModificada;
        matriculaModificada = new Colectivo( matriculaModificar, "Nissan", "CocheCama/Aire/Tv", 60, true);
        colectivo.modificarColectivo(matriculaModificada);
        
        
        //Eliminar un Colectivo
        int colectivoAEliminar = 1;
        colectivo.eliminarColectivo(colectivoAEliminar);
        
    //Rutas pruebas
    
        //creando RutaData
        RutaData ruta = new RutaData();
        
        //creando Rutas
        Ruta ruta1 = new Ruta(1, "San luis", "Mendoza", LocalTime.of(04, 00), true);
        Ruta ruta2 = new Ruta(2, "Villa Mercedes", "Quines", LocalTime.of(03, 30), true);
        Ruta ruta3 = new Ruta(3, "San luis", "Buenos Aires", LocalTime.of(10, 00), true);
        Ruta rutas[]= new Ruta[]{ruta1, ruta2, ruta3};
        
        //Guardando Ruta
        System.out.println("Guardar ruta");
        for (Ruta elem : rutas) {
            ruta.añadirRuta(elem);
        }
        
        //Buscando ruta por id
        int idRutaEncontrada = 2;
        Ruta rutaEncontrada = ruta.buscarRutaPorId(idRutaEncontrada);
        if (rutaEncontrada != null) {
            System.out.println("La ruta encontrado es: " + rutaEncontrada);
        } else {
            System.out.println("La ruta no se ha encontrado");
        }
        
        //Listar  Rutas
        List<Ruta> listaRuta = ruta.listarRutas();
        for (Ruta elem : listaRuta) {
            System.out.println(elem);
            System.out.println("");
        }
        
        //Modificando Ruta
        int rutaAModificar = 1;
        Ruta rutaModificada;
        rutaModificada = new Ruta(rutaAModificar, "San luis", "Cordoba", LocalTime.of(06, 00), true);
        ruta.modificaRuta(rutaModificada);
        
         //Eliminar una Ruta
        int rutaAEliminar = 2;
        ruta.eliminarRuta(rutaAEliminar);
        
    //Horarios Pruebas
    
        //Creando HoraiosData    
        HorariosData horarios = new HorariosData(ruta);
        Ruta idruta1 = ruta.buscarRutaPorId(1);
        Ruta idruta2 = ruta.buscarRutaPorId(2);
        Ruta idruta3 = ruta.buscarRutaPorId(3);
        
        //creando Horarios
        Horario horario1 = new Horario(1, idruta1, LocalTime.of(6, 10), LocalTime.of(13, 00), true);
        Horario horario2 = new Horario(2, idruta2, LocalTime.of(5, 30), LocalTime.of(12, 00), true);
        Horario horario3 = new Horario(3, idruta3, LocalTime.of(7, 50), LocalTime.of(16, 20), true);
        Horario horario[]= new Horario[]{horario1, horario2, horario3};
        
        //Guardando Horario
        System.out.println("Guardar Horario");
        for (Horario elem : horario) {
            horarios.añadirHorario(elem);
        }
        
        //Buscando horario por id
        int idHorarioEncontrado = 2;
        Horario horarioEncontrada =horarios.buscarHorarioSegunEstado(idHorarioEncontrado, true);
        if (horarioEncontrada != null) {
            System.out.println("El horario encontrado es: " + horarioEncontrada);
        } else {
            System.out.println("el horario no se ha encontrado");
        }
        
        //Buscando horario por horaDeLlegada
        LocalTime horaEncontrada = LocalTime.of(2, 30);
        Horario horaEnconLlegada =horarios.buscarHorarioPorHoraLlegada(horaEncontrada);
        if (horaEnconLlegada != null) {
            System.out.println("El horario encontrado es: " + horaEnconLlegada);
        } else {
            System.out.println("el horario no se ha encontrado");
        }
        
        //Buscando horario por horaDeSalida
        LocalTime horaEncontradaSalida = LocalTime.of(2, 30);
        Horario horaEnconSalida =horarios.buscarHorarioPorHoraSalida(horaEncontradaSalida);
        if (horaEnconSalida != null) {
            System.out.println("El horario encontrado es: " + horaEnconSalida);
        } else {
            System.out.println("el horario no se ha encontrado");
        }
        
        //ListarHorario
        List<Horario> listaHorario = horarios.listarHorarios();
        for (Horario elem : listaHorario) {
            System.out.println(elem);
            System.out.println("");
        }
        
        //Modificar Horario
        int HorarioAModificar = 1;
        Horario HorarioModificado;
        HorarioModificado = new Horario(HorarioAModificar, idruta1,LocalTime.of(7, 30),LocalTime.of(14, 00),true);
        horarios.modificarHorario(HorarioModificado);
        
        //Eliminar Horario
        int horarioAEliminar = 2;
        horarios.eliminarHorario(horarioAEliminar);
        
    //Pasaje
    }
}
