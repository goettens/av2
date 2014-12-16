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
public class PoligonalFechada extends Poligonal{

    public PoligonalFechada(int num){
        super(num);
    }
    @Override
    public double getComprimento(){
        double soma=0;
        for(int i=0;i<num-1;i++){
            soma= vertices[i].dist(vertices[i+1]);
        }
        soma= Math.sqrt(Math.pow(vertices[0].x-vertices[num-1].x,2)+Math.pow(vertices[0].y-vertices[num-1].y,2)+Math.pow(vertices[0].z-vertices[num-1].z,2))+soma;
        return  soma;
    }
    
}
