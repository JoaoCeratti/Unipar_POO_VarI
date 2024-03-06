import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int awser = 0;
        int n[] = new int[3];

        double n1 = 0.0;

        System.out.println("1 - soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Média de duas notas");
        System.out.println("4 - Média de quatro notas");
        System.out.println("5 - Operações");
        System.out.println("6 - Produto Preço");
        awser = sc.nextInt();

        switch (awser) {
            case 1:
                System.out.println("informe o primeiro número: ");
                n[0] = sc.nextInt();
                System.out.println("Informe o segundo número: ");
                n[1] = sc.nextInt();
                System.out.println("Informe o terceiro número: ");
                n[2] = sc.nextInt();
                int soma = (n[0] + n[1] + n[2]);
                System.out.println("A soma desses números é: " + soma);
                break;
            case 2:
                System.out.println("Informe o primeiro número: ");
                n[0] = sc.nextInt();
                System.out.println("Informe o segundo número: ");
                n[1] = sc.nextInt();
                int sub = (n[0] - n[1]);
                System.out.println("A subtração desses números é: " + sub);
                break;
            case 3:
                System.out.println("Informe a primeira nota: ");
                n1 = sc.nextDouble();
                System.out.println("Informe a segunda nota: ");
                double n2 = sc.nextDouble();
                double media = (n1 + n2) / 2;
                if (media >= 6) {
                    System.out.println("A média das notas é: " + media + "! Você está aprovado!");
                } else {
                    System.out.println("A média das notas é: " + media + "! Você está reprovado!");
                }
                break;
            case 4:
                System.out.println("Informe a primeira nota: ");
                n1 = sc.nextDouble();
                System.out.println("Informe a segunda nota: ");
                n2 = sc.nextDouble();
                System.out.println("Informe a terceira nota: ");
                double n3 = sc.nextDouble();
                System.out.println("Informe a quarta nota: ");
                double n4 = sc.nextDouble();
                media = (n1 + n2 + n3 + n4) / 4;
                if (media >= 6) {
                    System.out.println("A média das notas é:" + media + "! Você está aprovado!");
                } else {
                    System.out.println("A média das notas é:" + media + "! Você está reprovado!");
                }
                break;
            case 5:
                System.out.println("Informe o primeiro número");
                n1 = sc.nextDouble();
                System.out.println("Informe o segundo número:");
                n2 = sc.nextDouble();
                System.out.println("Soma: " + (n1 + n2));
                System.out.println("Subtração: " + (n1 - n2));
                if (n2 == 0) {
                    System.out.println("Impossível dividir um número por 0!");
                } else {
                    System.out.println("Divisão: " + (n1 / n2));
                }
                System.out.println("Multiplicação: " + (n1 * n2));
                break;
            case 6:
                System.out.println("Informe o nome do produto:");
                String name = sc.next();
                System.out.println("Informe o preço do produto:");
                n1 = sc.nextDouble();
                System.out.println("Informe a % de desconto:");
                n2 = sc.nextDouble();

        

                double desc =  n1 * (n2 / 100);

                System.out.println(desc);

                System.out.println("Produto:" + name + "          Valor: " + (n1 - desc));

                sc.close();

        }

    }
}
