public class Empregado {
    private int codigoEmpregado;
    private String nomeEmpregado;
    private String setor;
    private double salarioBruto;
    private double recInss;

    @Override
    public String toString() {
       return "\n--EMPREGADO--" +
               "\nCódigo do empregado: " + getCodigoEmpregado() +
               "\nNome do empregado: " + getNomeEmpregado() +
               "\nSetor: " + getSetor() +
               "\nSalário Bruto: " + getSalarioBruto() +
               "\nRecolhimento do INSS: " + getRecInss() +
               "\n---------";
    }

    public int getCodigoEmpregado() {
        return codigoEmpregado;
    }

    public void setCodigoEmpregado(int codigoEmpregado) {
        this.codigoEmpregado = codigoEmpregado;
    }

    public String getNomeEmpregado() {
        return nomeEmpregado;
    }

    public void setNomeEmpregado(String nomeEmpregado) {
        this.nomeEmpregado = nomeEmpregado;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getRecInss() {
        return recInss;
    }

    public void setRecInss(double recInss) {
        this.recInss = recInss;
    }
}
