package xakea;



public abstract class Pieza {
    private boolean zuria;
    private int errenkada;
    private int zutabea;

    public Pieza(boolean kolorea, int errenkada, int zutabea) {
        this.zuria = kolorea;
        this.errenkada = errenkada;
        this.zutabea = zutabea;
    }

    public boolean getKolorea() {
        return zuria;
    }

    public int getErrenkada() {
        return errenkada;
    }

    public int getZutabea() {
        return zutabea;
    }

    public void setErrenkada(int x) {
        this.errenkada = x;
    }
    
    public void setZutabea(int y) {
        this.zutabea = y;
    }

    public abstract boolean mugituDaiteke(int zeinErrenkadara, int zeinZutabera);
}
