public class predmet {
    private int velikost ;
    private int objemnost;

    public int getVelikost() {
        return velikost;
    }

    public void setVelikost(int velikost) {
        this.velikost = velikost;
    }

    public int getObjemnost() {
        return objemnost;
    }

    public void setObjemnost(int objemnost) {
        this.objemnost = objemnost;
    }


    public predmet(int velikost, int objemnost) {
        this.velikost = velikost;
        this.objemnost = objemnost;
    }
}
