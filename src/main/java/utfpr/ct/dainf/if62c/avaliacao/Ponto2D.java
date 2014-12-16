/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author a1618393
 */
public abstract class Ponto2D extends Ponto{
      public double x, y, z;
    protected Ponto2D(){
        x=y=z=0;
    }
    protected Ponto2D(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
}
