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
public class PontoYZ extends Ponto2D{
    private double x, y, z;
    public PontoYZ(){
        x=y=z=0;
    }
    public PontoYZ(double y,double z){
        this.x=0;
        this.y=y;
        this.z=z;
    }
    @Override
    public String toString(){
        return String.format("%s(%f,%f)",this.getNome(),y,z);
    }
}
