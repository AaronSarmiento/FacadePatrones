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
      
      String nombreArchivo = "";
      String rutaArchivo = "";
      FileWriter archivo = new FileWriter(rutaArchivo + nombreArchivo);
      archivo.write("<html><head><title>Seccion Actualidad</title></head><body><h1>Actualidad</h1></body></html>");
      archivo.close();
      //Anterior : C:\\Users\\LENOVO\\Downloads\\secciones\\
      //C:\Users\iuser\Downloads\secciones\
      try {
          
    String url = ""; // Reemplaza "ruta/al/archivo.html" con la ruta y nombre del archivo HTML que quieres abrir
    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
} catch (java.io.IOException e) {
    System.out.println(e.getMessage());
}
    }
    
    public void deportes()throws IOException{
       String nombreArchivo = "Deportes.html";
      String rutaArchivo = "C:\\Users\\iuser\\Downloads\\secciones\\";
      FileWriter archivo = new FileWriter(rutaArchivo + nombreArchivo);
      PrintWriter pw=new PrintWriter(archivo);
      try{
          String dep="<!DOCTYPE html>\n" +
"<html>\n" +
"  <head>\n" +
"    <title>Horóscopo</title>\n" +
"  </head>\n" +
"  <body>\n" +
" <img src=\"C:\\Users\\iuser\\Downloads\\secciones\\foto.jpg"+
"    <h1>Deportes</h1>\n" +
"    <p> El FC Barcelona ha ganado la Copa del Rey de fútbol tras vencer al Athletic Club de Bilbao en la final. El partido se jugó en el Estadio La Cartuja de Sevilla y terminó con un marcador de 4-0 a favor del Barcelona. Lionel Messi fue una vez más la estrella del equipo, anotando dos goles y dando una asistencia. Con esta victoria, el Barcelona logra su 31 Copa del Rey y consigue su primer título desde la temporada 2018-2019 </p>\n" +
"  </body>\n" +
"</html>";
          
          pw.print(dep);
          
      }catch(Exception e){
          
      }
      
      archivo.close();
      
      try {
    String url = "file:///C:/Users/iuser/Downloads/secciones/Deportes.html"; // Reemplaza "ruta/al/archivo.html" con la ruta y nombre del archivo HTML que quieres abrir
    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
} catch (java.io.IOException e) {
    System.out.println(e.getMessage());
}
    }
    public void farandula() throws IOException{
        String nombreArchivo = "";
      String rutaArchivo = "";
      FileWriter archivo = new FileWriter(rutaArchivo + nombreArchivo);
      archivo.write("<html><head><title>Seccion Farandula</title></head><body><h1>Farandula</h1></body></html>");
      archivo.close();
      
      try {
    String url = ""; // Reemplaza "ruta/al/archivo.html" con la ruta y nombre del archivo HTML que quieres abrir
    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
} catch (java.io.IOException e) {
    System.out.println(e.getMessage());
}
    }
    public void musica() throws IOException{
        String nombreArchivo = "";
      String rutaArchivo = "";
      FileWriter archivo = new FileWriter(rutaArchivo + nombreArchivo);
      archivo.write("<html><head><title>Seccion Musica</title></head><body><h1>Musica</h1></body></html>");
      archivo.close();
      
      try {
    String url = ""; // Reemplaza "ruta/al/archivo.html" con la ruta y nombre del archivo HTML que quieres abrir
    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
} catch (java.io.IOException e) {
    System.out.println(e.getMessage());
}
    }
    public void tecnologia() throws IOException{
        String nombreArchivo = "";
      String rutaArchivo = "";
      FileWriter archivo = new FileWriter(rutaArchivo + nombreArchivo);
      archivo.write("<html><head><title>Seccion Tecnologia</title></head><body><h1>Tecnologia</h1></body></html>");
      archivo.close();
      
      try {
    String url = ""; // Reemplaza "ruta/al/archivo.html" con la ruta y nombre del archivo HTML que quieres abrir
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