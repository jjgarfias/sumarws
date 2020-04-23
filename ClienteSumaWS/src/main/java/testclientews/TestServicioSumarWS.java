package testclientews;

import clienteWS.servicio.ServicioSumarImplService;
import clienteWS.servicio.ServicioSumarWS;

/**
 *
 * @author Jaime Garfias
 */
public class TestServicioSumarWS {
    
    public static void main(String[] arg){
        ServicioSumarWS servicioSumar = new ServicioSumarImplService().getServicioSumarImplPort();
        System.out.println("Ejecutar Servicio sumar WS");
        int x = 6;
        int y = 3;
        int resultado = servicioSumar.sumar(x, y);
        System.out.println("Resultado: "+resultado);
        
    }
    
}
