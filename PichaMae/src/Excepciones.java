import java.io.BufferedReader;
import  java.io.File;
import java.io.FileNotFoundException;
import  java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;

import javax.swing.JOptionPane;
public class Excepciones{
    public void LeerArchivo() throws FileNotFoundException,IOException{
        File archivo = new File("ruta");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;
        while ( (linea = bf.readLine()) != null);{
            System.out.println(linea);

        }
    }
    public void LeerArchivo2(){
        try {
            LeerArchivo();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"No se ha encontrado el archivo");

        }catch (IOException e){
            JOptionPane.showMessageDialog(null,"Ha ocurrido una exepcion");
        }finally {
            System.out.println("Programa termniado");
        }
    }public static void main(String args[]){
        Excepciones prueba = new Excepciones();
        prueba.LeerArchivo2();
    }
}
