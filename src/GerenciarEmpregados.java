import java.util.ArrayList;
import java.util.List;

public class GerenciarEmpregados {
    List<Empregado> listaEmpregados;

    public GerenciarEmpregados(){
        listaEmpregados = new ArrayList<>();
    }
    public void adicionarEmpregado(Empregado e){
        listaEmpregados.add(e);
    }
    public void removerEmpregado(Empregado e) {
        if (verificarExistencia(e)) {
            listaEmpregados.remove(e);
        }
    }
    public void listarEmpregados(){
        System.out.println("LISTA DE EMPREGADOS");
        for (Empregado e: listaEmpregados) {
            System.out.println(e.toString());
        }
    }
    private boolean verificarExistencia(Empregado e){
        return listaEmpregados.contains(e);
    }

}
