/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepatrones;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author santi
 */
public class Secciones {
    
    public void actualidad() throws IOException{
      
      String nombreArchivo = "actualidad.html";
      String rutaArchivo = "D:\\Users\\santi\\Downloads\\FacadePatrones";
      FileWriter archivo = new FileWriter(rutaArchivo + nombreArchivo);
      archivo.write("<!DOCTYPE html>\r\n"
      		+ "<html>\r\n"
      		+ "<head>\r\n"
      		+ "	<title>Sección de Actualidad - Mi Periódico</title>\r\n"
      		+ "</head>\r\n"
      		+ "<body>\r\n"
      		+ "	<header>\r\n"
      		+ "		<h1>Actualidad</h1>\r\n"
      		+ "		<nav>\r\n"
      		+ "			<ul>\r\n"
      		+ "				<img src=\"C:\\Users\\LENOVO\\Documents\\Patronesdediseño\\facades\\FacadePatrones\\actualidad.jpg\" alt=\"actualidad\">\r\n"
      		+ "				<li><a href=\"#\">Noticias destacadas</a></li>\r\n"
      		+ "				<li><a href=\"#\">Política</a></li>\r\n"
      		+ "				<li><a href=\"#\">Economía</a></li>\r\n"
      		+ "				<li><a href=\"#\">Internacional</a></li>\r\n"
      		+ "				<li><a href=\"#\">Ciencia y Tecnología</a></li>\r\n"
      		+ "			</ul>\r\n"
      		+ "		</nav>\r\n"
      		+ "	</header>\r\n"
      		+ "	<main>\r\n"
      		+ "		<section>\r\n"
      		+ "			<article>\r\n"
      		+ "				<h2>Titular de la noticia</h2>\r\n"
      		+ "				<p>Este es un resumen breve de la noticia...</p>\r\n"
      		+ "				<a href=\"#\">Leer más</a>\r\n"
      		+ "			</article>\r\n"
      		+ "			<article>\r\n"
      		+ "				<h2>Titular de otra noticia</h2>\r\n"
      		+ "				<p>Este es un resumen breve de otra noticia...</p>\r\n"
      		+ "				<a href=\"#\">Leer más</a>\r\n"
      		+ "			</article>\r\n"
      		+ "			<!-- Agregar más artículos aquí -->\r\n"
      		+ "		</section>\r\n"
      		+ "	</main>\r\n"
      		+ "	<footer>\r\n"
      		+ "		<p>Derechos reservados Mi Periódico - 2023</p>\r\n"
      		+ "	</footer>\r\n"
      		+ "</body>\r\n"
      		+ "</html>");
      archivo.close();
      
      try {
    String url = "file:///D:/Users/santi/Downloads/FacadePatronesactualidad.html"; // Reemplaza "ruta/al/archivo.html" con la ruta y nombre del archivo HTML que quieres abrir
    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
} catch (java.io.IOException e) {
    System.out.println(e.getMessage());
}
    }
    public void deportes()throws IOException{
        String nombreArchivo = "deportes.html";
      String rutaArchivo = "D:\\Users\\santi\\Downloads\\FacadePatrones";
      FileWriter archivo = new FileWriter(rutaArchivo + nombreArchivo);
      archivo.write("<html><head><title>Seccion Deportes</title></head><body><h1>Deportes</h1></body></html>");
      archivo.close();
      
      try {
    String url = "file:///D:/Users/santi/Downloads/FacadePatronesdeportes.html"; // Reemplaza "ruta/al/archivo.html" con la ruta y nombre del archivo HTML que quieres abrir
    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
} catch (java.io.IOException e) {
    System.out.println(e.getMessage());
}
    }
    public void farandula() throws IOException{
        String nombreArchivo = "farandula.html";
      String rutaArchivo = "D:\\Users\\santi\\Downloads\\FacadePatrones";
      FileWriter archivo = new FileWriter(rutaArchivo + nombreArchivo);
      archivo.write("<html><head><title>Seccion Farandula</title></head><body><h1>Farandula</h1></body></html>");
      archivo.close();
      
      try {
    String url = "file:///D:/Users/santi/Downloads/FacadePatronesfarandula.html"; // Reemplaza "ruta/al/archivo.html" con la ruta y nombre del archivo HTML que quieres abrir
    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
} catch (java.io.IOException e) {
    System.out.println(e.getMessage());
}
    }
    public void musica() throws IOException{
        String nombreArchivo = "musica.html";
      String rutaArchivo = "D:\\Users\\santi\\Downloads\\FacadePatrones";
      FileWriter archivo = new FileWriter(rutaArchivo + nombreArchivo);
      archivo.write("<html><head><title>Seccion Musica</title></head><body><h1>Musica</h1></body></html>");
      archivo.close();
      
      try {
    String url = "file:///D:/Users/santi/Downloads/FacadePatronesmusica.html"; // Reemplaza "ruta/al/archivo.html" con la ruta y nombre del archivo HTML que quieres abrir
    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
} catch (java.io.IOException e) {
    System.out.println(e.getMessage());
}
    }
    public void tecnologia() throws IOException{
        String nombreArchivo = "tecnologia.html";
      String rutaArchivo = "D:\\Users\\santi\\Downloads\\FacadePatrones";
      FileWriter archivo = new FileWriter(rutaArchivo + nombreArchivo);
      archivo.write("<html><head><title>Seccion Tecnologia</title></head><body><h1>Tecnologia</h1></body></html>");
      archivo.close();
      
      try {
    String url = "file:///D:/Users/santi/Downloads/FacadePatronestecnologia.html"; // Reemplaza "ruta/al/archivo.html" con la ruta y nombre del archivo HTML que quieres abrir
    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
} catch (java.io.IOException e) {
    System.out.println(e.getMessage());
}
    }
    
   /* 
    public static void main(String[] args) throws IOException{
        
        Secciones sc = new Secciones();
        sc.actualidad();
        sc.deportes();
        sc.farandula();
        sc.musica();
        sc.tecnologia();
    }
    */
}
