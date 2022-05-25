import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try{
            double raio = Double.parseDouble(
                    JOptionPane.showInputDialog("Digite o valor do raio"));
            //A ideia aqui é criar um objeto para acessar os métodos
            //criados na classe circunferencia
            Circunferencia circulo = new Circunferencia();
            circulo.setRaio(raio);
            JOptionPane.showMessageDialog(null,
                    "Área: " + circulo.getArea());
            JOptionPane.showMessageDialog(null,
                    "Volume: " + circulo.getVolume());
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null,
                    "Favor digitar um valor numérico real");
        }


    }
}