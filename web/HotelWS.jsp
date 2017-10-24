<%-- 
    Document   : HotelWS
    Created on : 24-oct-2017, 16:56:10
    Author     : Toni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hotel </title>

    <body>
        <h1>Hotel WS</h1>

        <form method="POST">Consultar plazas libres<br>
            <div>
                <label for="id_hotel"> Identificador de Hotel: </label>
                <input type="TEXT" name="PARAMconsultaLibres0" title="consultaLibres parameter of type int"> <br/><br/>
            </div>

            <div>
                <label for="fecha"> Fecha: </label>
                <input type="TEXT" name="PARAMconsultaLibres1" title="consultaLibres parameter of type int"><br/><br/>
            </div>
            <input type="SUBMIT" name="action" title="Invoke consultaLibres operation" value="consultaLibres">

            <br/><br/><br/>
            <form method="POST"> Reservar Habitación<br>
                <div>
                    <label for="id_hotel"> Identificador de Hotel: </label>
                    <input type="TEXT" name="PARAMreservaHabitacion0" title="reservaHabitacion parameter of type int"><br/><br/>
                </div>

                <div>
                    <label for="fecha"> Fecha: </label>
                    <input type="TEXT" name="PARAMreservaHabitacion1" title="reservaHabitacion parameter of type int"><br/><br/>
                </div>
                <input type="SUBMIT" name="action" title="Invoke reservaHabitacion operation" value="reservaHabitacion">

                <br></form></body>
</head>

</html>


