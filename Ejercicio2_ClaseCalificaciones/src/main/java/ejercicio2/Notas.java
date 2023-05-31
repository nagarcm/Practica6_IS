package ejercicio2;

public class Notas {
    public double calculaNota(char tipoAl, double p1, double p2, double trabajo, double teoria) {
        double notaFinal;
        if (tipoAl == 'O') {
            if (teoria >= 5) {
                notaFinal = p1*0.15+p2*0.15+trabajo*0.2+teoria*0.5;
            } else {
                notaFinal = teoria;
            }
        } else {
            if (tipoAl == 'I') {
                if (teoria >= 4) {
                    notaFinal = p1*0.1+p2*0.1+trabajo*0.4+teoria*0.5;
                } else {
                    notaFinal = teoria;
                }
            } else {
                System.out.println("Código erróneo ");
                notaFinal = 0; }
        }
        return notaFinal;
    }
}