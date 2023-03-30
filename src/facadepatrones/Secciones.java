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
      archivo.write("<section>\n" +
"  <h2>Tecnología</h2>\n" +
"  <article>\n" +
"    <h3>ChatGPT: la nueva tecnología de lenguaje natural</h3>\n" +
"    <img src=\"C:\\Users\\santi\\OneDrive - Universidad Sergio Arboleda\\Documentos\\Materias 6 semestre\\Patrones de diseño de software\\FacadePatrones\\FacadePatrones\\chatgpt.png\" alt=\"ChatGPT\">\n" +
"    <p>ChatGPT es una nueva tecnología de lenguaje natural desarrollada por OpenAI. Utiliza un modelo de inteligencia artificial llamado GPT (Generative Pre-trained Transformer) para generar respuestas coherentes y relevantes en conversaciones con humanos.</p>\n" +
"    <p>Con ChatGPT, las empresas pueden automatizar su servicio al cliente y mejorar la experiencia del usuario al proporcionar respuestas rápidas y precisas a las preguntas comunes. Además, ChatGPT se puede utilizar en una variedad de aplicaciones, como chatbots de ventas, asistentes virtuales y más.</p>\n" +
"    <p>En resumen, ChatGPT es una tecnología emocionante que está transformando la forma en que interactuamos con las máquinas y que tiene el potencial de mejorar significativamente la eficiencia y la satisfacción del usuario.</p>\n" +
"  </article>\n" +
"</section>");
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
