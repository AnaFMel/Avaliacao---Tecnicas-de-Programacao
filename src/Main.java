import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empregado empregado =  new Empregado();
        empregado.setCodigoEmpregado(1);
        empregado.setNomeEmpregado("Jorge");
        empregado.setSetor("Varejo");
        empregado.setSalarioBruto(2000);
        Empregado empregado2 =  new Empregado();
        empregado2.setCodigoEmpregado(2);
        empregado2.setNomeEmpregado("Gabriel");
        empregado2.setSetor("Varejo");
        empregado2.setSalarioBruto(4000);
        Empregado empregado3 =  new Empregado();
        empregado3.setCodigoEmpregado(3);
        empregado3.setNomeEmpregado("Álice");
        empregado3.setSetor("RH");
        empregado3.setSalarioBruto(1000);
        Empregado empregado4 =  new Empregado();
        empregado4.setCodigoEmpregado(4);
        empregado4.setNomeEmpregado("Lúcia");
        empregado4.setSetor("Varejo");
        empregado4.setSalarioBruto(6000);
        Empregado empregado5 =  new Empregado();
        empregado5.setCodigoEmpregado(5);
        empregado5.setNomeEmpregado("Amanda");
        empregado5.setSetor("RH");
        empregado5.setSalarioBruto(2900);


        GerenciarEmpregados gerenciarEmpregados = new GerenciarEmpregados();
        gerenciarEmpregados.adicionarEmpregado(empregado);
        gerenciarEmpregados.adicionarEmpregado(empregado2);
        gerenciarEmpregados.adicionarEmpregado(empregado3);
        gerenciarEmpregados.adicionarEmpregado(empregado4);
        gerenciarEmpregados.adicionarEmpregado(empregado5);

        gerenciarEmpregados.listarEmpregados();

        ParametrosInss inss = new ParametrosInss();
        inss.calcularInss(empregado);
        inss.calcularInss(empregado2);
        inss.calcularInss(empregado3);
        inss.calcularInss(empregado4);
        inss.calcularInss(empregado5);

        System.out.println("-APÓS INSERÇÃO DO INSS-");
        gerenciarEmpregados.listarEmpregados();

        gerenciarEmpregados.removerEmpregado(empregado2);


    }
}