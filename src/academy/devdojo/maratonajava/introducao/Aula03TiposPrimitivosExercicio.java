package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    /*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
        public static void main(String[] args) {
            String nome = "Rogerio";
            String endereco = "Rua Correa de Mello";
            double salario = 20000000.0D;
            String data = "14 de Julho de 2026";
            String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + data;

            System.out.println(relatorio);
        }

    }

