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
      archivo.write("<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Revista de Música</title>
	<style>
		body {
			margin: 0;
			padding: 0;
			font-family: Arial, sans-serif;
			background-color: #f5f5f5;
		}
		header {
			background-color: #333;
			color: #fff;
			padding: 20px;
			text-align: center;
		}
		h1 {
			margin-top: 0;
			font-size: 48px;
		}
		.container {
			max-width: 800px;
			margin: 0 auto;
			padding: 20px;
		}
		.article {
			margin-bottom: 30px;
		}
		.article h2 {
			margin-top: 0;
			font-size: 36px;
			color: #333;
		}
		.article p {
			font-size: 18px;
			line-height: 1.5;
			color: #666;
		}
		.article img {
			max-width: 100%;
			height: auto;
			margin-bottom: 20px;
		}
		.article .meta {
			font-size: 14px;
			color: #999;
			margin-top: 20px;
		}
	</style>
</head>
<body>
	<header>
		<h1>Farandula</h1>
	</header>
	<div class="container">
		<div class="article">
			<h2>Sebastian Lletget, prometido de Becky G, reconoció que engañó a la artista y se disculpó públicamente</h2>
			<p>La vida amorosa de Becky G se volvió tema de conversación después de que surgieron rumores de que Sebastian Lletget, su prometido, la engañó con una joven en una discoteca de Madrid, España.</p>
			<img src="https://e.rpp-noticias.io/normal/2023/03/24/034803_1406169.jpg" alt="Foto">
			<p>El novio de Becky G rompió el silencio y reconoció públicamente que sí engañó a la artista. El hombre compartió un comunicado en sus redes sociales en el que aprovechó para disculparse con la intérprete de 'Sin pijama'.</p>
			<p>"Has sido una luz en mi vida, mi fuerza, quien siempre me ha mostrado amor incondicional. En vez de honrar ese amor cada día, he hecho lo contrario, te he hecho daño e irrespetado a la persona que más amo. Lo siento y sé que tengo que hacer todo y más para ganarme tu confianza y el amor que mereces". Dijo el deportista</p>
            <img src="https://intn24.lalr.co/old/Becky%20G%20y%20su%20novio%2C%20Sebastian%20Lletget.jpg?w=480" alt="Foto">
			<div class="meta">Publicado el 27 de Marzo de 2023</div>
		</div>
	</div>
</body>
</html>");
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
