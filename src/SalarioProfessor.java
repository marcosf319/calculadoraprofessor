
/*Nome: Marcos Felipe da Silva Oliveira
 * RA: 722312100
 */
import java.util.Scanner;

public class SalarioProfessor {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = teclado.nextLine();
        System.out.printf(
                "Informe seu regime de pagamento de acordo com as alternativas a seguir \nCLT:1 \nPJ:2 \nHorista:3\n");
        int regimepag = teclado.nextInt();

        if (regimepag == 1) {
            System.out.print("Informe seu salário mensal:\n");
            float salariomensal = teclado.nextFloat();
            System.out.printf(nome + "\nvalor a receber: R$ " + salariomensal);
        } else if (regimepag == 2) {
            System.out.print("Informe o valor do seu contrato\n");
            double valorcotrato = teclado.nextDouble();
            System.out.print(
                    "Se o valor digitado for correspodente ao valor do seu contrato anual\ndigete '2' se for correpondente ao seu contrato mensal digete '1'\n");
            int tipocontrato = teclado.nextInt();
            if (tipocontrato == 1) {
                System.out.printf(nome + "\nvalor a receber: R$ " + valorcotrato);
            } else if (tipocontrato == 2) {
                double mensalcontrato = (valorcotrato / 12);
                System.out.printf(nome + "\nvalor a receber: R$ " + mensalcontrato);
            } else {
                System.out.print("Erro: Tente novamente");
            }

        } else if (regimepag == 3) {
            System.out.println("Informe o valor que você recebe por hora trabalhada:");
            double valorhora = teclado.nextDouble();
            System.out.println("Informe a quantidade de horas trabalhada nesse mês:");
            double quathoras = teclado.nextDouble();
            double salariohorista = (valorhora * quathoras);
            System.out.printf(nome + "\nvalor a receber: R$ " + salariohorista);

        } else {
            System.out.print("Erro: Tente novamente");
        }
        teclado.close();

    }
}
