
package Control;

import Modelo.Tarea;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;


public class Proceso extends JFrame {
    String ruta = "DOCUMENTOS//BD_TAREAS.txt"; 
    
    FileReader fr;
    BufferedReader br;
    
    FileWriter fw;
    
    Tarea t;
    
    public ArrayList<Tarea> array = new ArrayList<>();
            
        public void insertar(Tarea t)throws FileNotFoundException, IOException{
            fw = new FileWriter(ruta,true); //abrir archivos
            String cad = t.getTareas()+"-"+t.getCompleted();
            fw.write(cad); //grabar en archivo abierto
            fw.write(10); //enter
            fw.close(); //cerrar
        }
    
    public void leer()throws FileNotFoundException, IOException{
        array.clear(); //limpiar arraylist
        fr = new FileReader(ruta);  
        br = new BufferedReader(fr); //copiar informacion a la memoria
        
        String cad=br.readLine(); //leer la primera linea del archivo
        String vec[]; //division de cadena
        
        while(cad!=null){
            vec=cad.split("-");
            t = new Tarea(vec[0],Integer.parseInt(vec[1]));
            array.add(t);
            cad = br.readLine(); //repetir bucle
        }
    }
}
