package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo
{
    public static void main(String[] args)
    {
        imprimirSelecionados();
    }

    static void imprimirSelecionados()
    {
        String [] selecionado = {"ANA","ROBERTO","LUCAS","BEATRIZ","FELIPE","ROGER","MARIA","JOAO","DIEGO","SAMARA"};

        System.out.println("Imprimir candiatos selecionados");

        for(int i=0;i<selecionado.length;i++)
            System.out.println("Candidato(a) "+selecionado[i]+" foi selecionado!");
    }

    static void selecaoCandidatos()
    {
        String [] candidatos = {"ANA","ROBERTO","LUCAS","BEATRIZ","FELIPE","ROGER","MARIA","JOAO","DIEGO","SAMARA"};
        int candidatoAtual = 0, candidatosSelecionado=0;
        double salarioBase = 2000;

        while (candidatoAtual<candidatos.length&&candidatosSelecionado<5)
        {
            String nome = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+nome+" solicitou esse salario: "+ salarioPretendido);
            if(salarioPretendido<=salarioBase)
            {
                System.out.println("O candidato "+nome+" foi selecionado para vaga");
                candidatosSelecionado++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido()
    {
        return ThreadLocalRandom.current().nextDouble(1800,2000);
    }
    static void analisarCandidato(double salarioPretendido)
    {
        double salarioBase = 2000;
        if(salarioPretendido<salarioBase)
            System.out.println("ligar para candidato");
        else
            if(salarioPretendido==salarioBase)
                System.out.println("aguardando candidatos");
            else
                System.out.println("ligar para candidato para contra proposta");
    }

}
