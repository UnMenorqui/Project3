/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelWS;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Toni
 */
@WebService(serviceName = "HotelWS")
public class HotelWS {
    
    protected void processRequestPOST(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion = request.getSession();
        response.setContentType("text/html;charset=UTF-8");
        //PrintWriter out = response.getWriter();
                       
        Connection connection = null;
        try                        
        {            
          // load the sqlite-JDBC driver using the current class loader
          Class.forName("org.sqlite.JDBC");   
          //java.util.Date d = new java.util.Date();
          //out.println("La fecha actual es " + d);             
          
          // create a database connection
          //connection = DriverManager.getConnection("jdbc:sqlite:F:\\AD\\Pràctica 2\\BD\\exemple.db");
          //connection = DriverManager.getConnection("jdbc:sqlite:/Users/aleixabrieprat/Documents/FIB/7e quadrimestre/ad/lab/practica 2/p2.db"); //Mac Aleix
          connection = DriverManager.getConnection("jdbc:sqlite:/Users/Toni/Documents/Universitat/AD/LAB/P2/p2.db"); //Mac Toni
          Statement statement = connection.createStatement();
          statement.setQueryTimeout(30);  // set timeout to 30 sec.
                    
          statement.executeUpdate("create table if not exists vuelo_fecha (id_vuelo integer primary key, fecha integer, num_plazas_ocupadas integer, num_plazas_max integer)");
          statement.executeUpdate("create table if not exists hotel_fecha (id_hotel integer primary key, fecha integer, nu_hab_ocupadas integer, num_hab_libres integer)");
          
        
        }
        catch(SQLException | ClassNotFoundException e)
        {
          System.err.println(e.getMessage());
        }   
        finally
        {
          try
          {
            if(connection != null)
              connection.close();
          }
          catch(SQLException e)
          {
            // connection close failed.
            System.err.println(e.getMessage());
          }
        }       
    }


    /**
     * Web service operation
     * @param id_hotel
     * @param fecha
     * @return 
     */
    @WebMethod(operationName = "consulta_libres")
    public int consulta_libres(@WebParam(name = "id_hotel") int id_hotel, @WebParam(name = "fecha") int fecha) {
        //TODO write your implementation code here:
        return 0;
    }

    /**
     * Web service operation
     * @param id_hotel
     * @param fecha
     * @return 
     */
    @WebMethod(operationName = "reserva_habitacion")
    public int reserva_habitacion(@WebParam(name = "id_hotel") int id_hotel, @WebParam(name = "fecha") int fecha) {
        //TODO write your implementation code here:
        return 0;
    }
}
