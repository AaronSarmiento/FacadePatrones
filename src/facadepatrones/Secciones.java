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
      archivo.write("<html><head><title>Seccion Actualidad</title></head><body><h1>Actualidad</h1></body></html>");
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
      archivo.write("<!DOCTYPE html>\n" +
"<html>\n" +
"<head>\n" +
"	<meta charset=\"UTF-8\">\n" +
"	<title>Revista de Música</title>\n" +
"	<style>\n" +
"		body {\n" +
"			margin: 0;\n" +
"			padding: 0;\n" +
"			font-family: Arial, sans-serif;\n" +
"			background-color: #f5f5f5;\n" +
"		}\n" +
"		header {\n" +
"			background-color: #333;\n" +
"			color: #fff;\n" +
"			padding: 20px;\n" +
"			text-align: center;\n" +
"		}\n" +
"		h1 {\n" +
"			margin-top: 0;\n" +
"			font-size: 48px;\n" +
"		}\n" +
"		.container {\n" +
"			max-width: 800px;\n" +
"			margin: 0 auto;\n" +
"			padding: 20px;\n" +
"		}\n" +
"		.article {\n" +
"			margin-bottom: 30px;\n" +
"		}\n" +
"		.article h2 {\n" +
"			margin-top: 0;\n" +
"			font-size: 36px;\n" +
"			color: #333;\n" +
"		}\n" +
"		.article p {\n" +
"			font-size: 18px;\n" +
"			line-height: 1.5;\n" +
"			color: #666;\n" +
"		}\n" +
"		.article img {\n" +
"			max-width: 100%;\n" +
"			height: auto;\n" +
"			margin-bottom: 20px;\n" +
"		}\n" +
"		.article .meta {\n" +
"			font-size: 14px;\n" +
"			color: #999;\n" +
"			margin-top: 20px;\n" +
"		}\n" +
"	</style>\n" +
"</head>\n" +
"<body>\n" +
"	<header>\n" +
"		<h1>Revista de Música</h1>\n" +
"	</header>\n" +
"	<div class=\"container\">\n" +
"		<div class=\"article\">\n" +
"			<h2>La muerte de Spinetta conmueve al mundo de la música</h2>\n" +
"			<p>El músico argentino Luis Alberto Spinetta falleció a los 62 años en su casa de Buenos Aires, dejando un gran vacío en la música latinoamericana. Spinetta fue uno de los fundadores del rock argentino y es considerado uno de los artistas más influyentes de la música en español.</p>\n" +
"			<img src=\"https://th.bing.com/th/id/OIP.ASKzFzEQkQb0NRSMLvgW_gDREq?pid=ImgDet&rs=1\" alt=\"Foto de Spinetta\">\n" +
"			<p>La noticia de su muerte ha sido recibida con tristeza y conmoción por parte de fans y músicos de todo el mundo. Muchos han expresado su gratitud y admiración por el legado musical que dejó Spinetta.</p>\n" +
"			<p>\"Lamentamos profundamente la partida de Luis Alberto Spinetta, uno de los grandes artistas de nuestra historia. Su música y su poesía seguirán vivas en el corazón de todos los que lo admiramos\", dijo el presidente de Argentina, Alberto Fernández.</p>\n" +
"			<div class=\"meta\">Publicado el 9 de febrero de 2012</div>\n" +
"		</div>\n" +
"	</div>\n" +
"</body>\n" +
"</html>");
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
