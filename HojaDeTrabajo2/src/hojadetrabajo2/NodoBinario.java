package hojadetrabajo2;

import javax.swing.JOptionPane;
/**
 * 
 * @author Rodrigo
 */
public class NodoBinario {

  final Comparable valor;
  NodoBinario iz;
  NodoBinario dr;

  private static int correlativo=1;
  private final int id;

public NodoBinario(Comparable valor) {
    this.valor = valor;
    this.iz = null;
    this.dr = null;
    this.id = correlativo++;
}
  
void insertar(Comparable valo){
    if(valo.compareTo(valor)<0){
        if(iz==null){
iz=new NodoBinario(valo);
        }else{
            iz.insertar(valo);
        }
    }else if(valo.compareTo(valor)>0){
        if(dr==null){
            dr=new NodoBinario(valo);
                    }else{
                        dr.insertar(valo);
                    }
    }else{
        JOptionPane.showMessageDialog(null, "No se permiten valores duplicados", "Error Duplicados", JOptionPane.INFORMATION_MESSAGE);
    }
}
    


}
