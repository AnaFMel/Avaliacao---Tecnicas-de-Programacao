import java.util.List;

public class ParametrosInss {
    private static final double FAIXA1 = 0.075;
    private static final double LIMITEFAIXA1 = 1100.0;
    private static final double FAIXA2 = 0.09;
    private static final double LIMITEFAIXA2 = 2203.48;
    private static final double FAIXA3 = 0.12;
    private static final double LIMITEFAIXA3 = 3300.22;
    private static final double FAIXA4 = 0.14;
    private static final double LIMITEFAIXA4 = 6433.57;

    public void calcularInss(Empregado e){
            double salario = e.getSalarioBruto();
            if (salario <= LIMITEFAIXA1){
                double inss = salario * FAIXA1;
                e.setRecInss(inss);
            }
            if (salario > LIMITEFAIXA1 && salario <= LIMITEFAIXA2){
                double parcela1 = (LIMITEFAIXA1 * FAIXA1);
                double inss = parcela1 + ((salario - LIMITEFAIXA1) * FAIXA2);
                e.setRecInss(inss);
            }
            if (salario > LIMITEFAIXA2 && salario <= LIMITEFAIXA3){
                double parcela1 = (LIMITEFAIXA1 * FAIXA1);
                double parcela2 = (LIMITEFAIXA2 * FAIXA2);
                double inss = parcela1 + parcela2 + (((salario - LIMITEFAIXA1) - LIMITEFAIXA2) * FAIXA3);
                e.setRecInss(inss);
            }
            if (salario > LIMITEFAIXA3 && salario <= LIMITEFAIXA4){
                double parcela1 = (LIMITEFAIXA1 * FAIXA1);
                double parcela2 = (LIMITEFAIXA2 * FAIXA2);
                double parcela3 = (LIMITEFAIXA3 * FAIXA3);
                double inss = parcela1 + parcela2 + parcela3 + ((((salario - LIMITEFAIXA1) - LIMITEFAIXA2) - LIMITEFAIXA3) * FAIXA4);
                e.setRecInss(inss);
            }
            if (salario > LIMITEFAIXA4){
                double inss = LIMITEFAIXA4 * FAIXA4;
                e.setRecInss(inss);
            }
        }
    }

