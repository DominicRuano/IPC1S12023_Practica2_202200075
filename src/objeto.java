
import java.util.ArrayList;

public class objeto {

    public int tInv, costoInv, tProd, costoProd, tEmpa, costoEmpa, tsal, costoSal;
    public static ArrayList<objeto> misobjetos = new ArrayList<>();

    public objeto(int tInv, int costoInv, int tProd, int costoProd, int tEmpa, int costoEmpa, int tsal, int costoSal) {
        this.tInv = tInv;
        this.costoInv = costoInv;
        this.tProd = tProd;
        this.costoProd = costoProd;
        this.tEmpa = tEmpa;
        this.costoEmpa = costoEmpa;
        this.tsal = tsal;
        this.costoSal = costoSal;
    }

    @Override
    public String toString() {
        return "objeto{" + "tInv=" + tInv + ", costoInv=" + costoInv + ", tProd=" + tProd + ", costoProd=" + costoProd + ", tEmpa=" + tEmpa + ", costoEmpa=" + costoEmpa + ", tsal=" + tsal + ", costoSal=" + costoSal + '}';
    }

    public int gettInv() {
        return tInv;
    }

    public void settInv(int tInv) {
        this.tInv = tInv;
    }

    public int getCostoInv() {
        return costoInv;
    }

    public void setCostoInv(int costoInv) {
        this.costoInv = costoInv;
    }

    public int gettProd() {
        return tProd;
    }

    public void settProd(int tProd) {
        this.tProd = tProd;
    }

    public int getCostoProd() {
        return costoProd;
    }

    public void setCostoProd(int costoProd) {
        this.costoProd = costoProd;
    }

    public int gettEmpa() {
        return tEmpa;
    }

    public void settEmpa(int tEmpa) {
        this.tEmpa = tEmpa;
    }

    public int getCostoEmpa() {
        return costoEmpa;
    }

    public void setCostoEmpa(int costoEmpa) {
        this.costoEmpa = costoEmpa;
    }

    public int getTsal() {
        return tsal;
    }

    public void setTsal(int tsal) {
        this.tsal = tsal;
    }

    public int getCostoSal() {
        return costoSal;
    }

    public void setCostoSal(int costoSal) {
        this.costoSal = costoSal;
    }

    

    
}
