package hojadetrabajo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;
/**
 * 
 * @author Rodrigo
 */
public class App {
    public static void main(String[] args) throws Exception {

        ArbolBinario arbolito=new ArbolBinario();
        List<Integer>listita=new ArrayList<>();
        int opc=0,numero=0;
        do{
            numero=0;opc=0;
        numero=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor a ingresar al arbol:","Ingreso",JOptionPane.QUESTION_MESSAGE));
        arbolito.insertar(numero);
        opc=JOptionPane.showConfirmDialog(null, "Desea ingresar otro elemento al arbol?", "Seguir?", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        }while(opc==JOptionPane.YES_OPTION);
        arbolito.fronterasDelArbol(arbolito.R,listita);
        JOptionPane.showMessageDialog(null, "Las Fronteras del arbol son: "+Arrays.asList(listita), "Fronteras",JOptionPane.INFORMATION_MESSAGE);
    }
}
