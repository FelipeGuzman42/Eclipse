package Empresa;
/**
 *
 * @author Tatiana
 */
public class Producto {
    private String nom, code;
    private int prec;
    public Producto(){
        this.nom = "";
        this.code = "";
        this.prec = 0;
    }

    public Producto(String code, String nom, int prec) {
        this.nom = nom;
        this.code = code;
        this.prec = prec;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPrec() {
        return prec;
    }

    public void setPrec(int prec) {
        this.prec = prec;
    }

    @Override
    public String toString() {
        return this.code + "," + this.nom + "," + this.prec;
    }
    
}
