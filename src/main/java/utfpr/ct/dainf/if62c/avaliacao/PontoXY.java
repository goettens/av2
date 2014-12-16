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
public class PontoXY extends Ponto2D{
    private double x, y, z;
    public PontoXY(){
        x=y=z=0;
    }
    public PontoXY(double x,double y){
        this.x=x;
        this.y=y;
        this.z=0;
    }
    @Override
    public String toString(){
        return String.format("%s(%f,%f)",this.getNome(),x,y);
    }
}
