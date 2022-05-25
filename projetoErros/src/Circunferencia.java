public class Circunferencia {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getArea(){
        return Math.PI * Math.pow(raio, 2.0);
    }
    public double getVolume(){
        return (4.0 * Math.PI * Math.pow(raio, 3))/3.0;
    }

}
