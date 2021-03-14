package hojadetrabajo2;

import java.util.List;
/**
 * 
 * @author Rodrigo
 */
public class ArbolBinario {
    
    public NodoBinario R;

    public ArbolBinario() {
        R = null;
    }

    public void insertar(Comparable valo){
        if (R==null) {
            R=new NodoBinario(valo);
        } else {
            R.insertar(valo);
        }
    }

    

    public void fronterasDelArbol(NodoBinario r2, List<Integer> front) {
        if(r2==null){
            return;
        }else if(r2.dr==null && r2.iz==null){
            front.add((Integer)r2.valor);
        }else{
            this.fronterasDelArbol(r2.iz, front);
            this.fronterasDelArbol(r2.dr, front);
        }
    }

}
