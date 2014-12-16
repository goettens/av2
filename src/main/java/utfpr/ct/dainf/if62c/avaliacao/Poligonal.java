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
public class Poligonal {
    int  num;
    char plano='n';
    Ponto2D[] vertices;
    protected Poligonal(int num){
        this.num=num;
        if(num<3){
            throw new RuntimeException("Poligonal deve ter ao menos 2 vértices");
        }
        vertices= new Ponto2D[num];
    }
    public int getN(){
        return num;
    }
    public Ponto2D get(int num){
        try{
        return vertices[num-1];
        }
        catch(Exception e){
            return null;
        }
    }
    public double getComprimento(){
        double soma=0;
        for(int i=1;i<num;i++){
            soma= Math.sqrt(Math.pow(vertices[i-1].x-vertices[i].x,2)+Math.pow(vertices[i-1].y-vertices[i].y,2)+Math.pow(vertices[i-1].z-vertices[i].z,2))+soma;
        }
        return  soma;
    }  
    public void set(int num,Ponto2D p){
        if(plano =='x'){
            if(p.x!=0){
                throw new RuntimeException("Vértices devem estar no mesmo plano"); 
            }
        }
        else if(plano =='y'){
            if(p.y!=0){
                throw new RuntimeException("Vértices devem estar no mesmo plano"); 
            }
        }
        else if(plano =='z'){
            if(p.z!=0){
                throw new RuntimeException("Vértices devem estar no mesmo plano"); 
            }
        }
        try{
            
        vertices[num-1]=p;
        }
        catch(Exception e){
            //do NADA
        }
         if(plano=='n')
            if(p.x==0)
                plano='x';
            else  if(p.y==0)
                plano='y';
            else
                plano='z';
    }
    
}
