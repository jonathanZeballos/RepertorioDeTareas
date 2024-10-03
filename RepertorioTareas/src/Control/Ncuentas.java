
package Control;

import Modelo.Cuenta;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Ncuentas {
    String direccion = "DOCUMENTOS//BD_CUENTA.txt";
    BufferedReader br;
    FileReader fr;
    FileWriter fw;
    public ArrayList<Cuenta> array = new ArrayList<>();
    Cuenta c;
    public void insertar (Cuenta c)throws FileNotFoundException, IOException{
        fw = new FileWriter(direccion, true);
        String cad = c.getUser() + "-" + c.getUsuario() + "-" + c.getPassword();
            fw.write(cad);
            fw.write(10);
            fw.close();
    
    }
    public void leer()throws FileNotFoundException, IOException{
        array.clear();
        fr = new FileReader(direccion);  
        br = new BufferedReader(fr);
        
        String cad=br.readLine();
        String vec[];
        
        while(cad != null){
            vec=cad.split("-");
            c = new Cuenta(vec[0],vec[1],vec[2]);
            array.add(c);
            cad = br.readLine();
        }
    }
    
}
