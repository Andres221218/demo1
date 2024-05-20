package org.holamundo.servlet.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Seteo el tipo de contenido que va devolver
        //el servidor
        resp.setContentType("text/html");
        /*definimos una variable del tipo PrintWriter
         * Para mostrar el contenido en pantalla*/
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>RESPUESTAS FORMULARIO</h1>");
        out.println("<h2>NOMBRE:</h2>");
        out.println("<h2>APELLIDO: </h2>");
        out.println("<h2>EDAD</h2>");
        out.println("<h2>CURSO</h2>");
        out.println("<h2>GENERO</h2>");
        out.println("<h2>LENGUAJE DE PROGRAMACION</h2>");
        out.println("<h2>DESCRIPCION</h2>");
        out.println("</body>");
        out.println("</html>");
    }
}
