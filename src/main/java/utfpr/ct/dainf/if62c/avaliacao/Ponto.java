package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author 
 */
public class Ponto {
    private double x, y, z;
    public Ponto(){
    x=y=z=0;
}
    public Ponto(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    @Override
    public String toString(){
        return String.format("%s(%f,%f,%f)",this.getNome(),x,y,z);
    }
    
    public boolean equals(Ponto p){
        try{
            return x==p.x&&y==p.y&&z==p.z;
        }
        catch(Exception e){
            return false;
        }
       
    }
    public double dist(Ponto p){
        return Math.sqrt(Math.pow(x-p.x,2)+Math.pow(y-p.y,2)+Math.pow(z-p.z,2));
    }
    /**
     * Retorna no nome não-qualificado da classe.
     * @return O nome não qualificado da classe.
     */
    public String getNome() {
        return getClass().getSimpleName();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.z) ^ (Double.doubleToLongBits(this.z) >>> 32));
        return hash;
    }

}
