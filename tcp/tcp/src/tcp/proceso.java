/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp;

/**
 *
 * @author Alumno
 */
public class proceso {
    int x,y;
    public proceso(int x, int y){
        this.x=x;
        this.y=y;
    }
    //\n
    public String operacion(){
        String resultado="";
        resultado="="+x+"\u00B2"+" + 2("+x+")"+"("+y+") + "+y+"\u00B2\n => ";
        resultado+="="+(x*x)+" + "+(2*x*y)+" + "+(y*y)+"\n => ";
        resultado+="El resultado es: "+((x*x)+(2*x*y)+(y*y));
        System.out.println(resultado);
        return resultado;
    }
}
