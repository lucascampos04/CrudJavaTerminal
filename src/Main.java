import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int escolha;

        do {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Adicionar um valor");
            System.out.println("2. Listar valores");
            System.out.println("3. Atualizar um valor");
            System.out.println("4. Deletar um valor");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            escolha = scan.nextInt();
            scan.nextLine(); // Consumir a nova linha após ler o número

            switch (escolha) {
                case 1:
                    System.out.println("Digite o valor a ser adicionado");
                    String valor = scan.nextLine();
                    lista.add(valor);
                    System.out.println("Valor adicionado com sucesso.");
                    break;
                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("Lista vazia.");
                    } else {
                        System.out.println("Valores na lista:");
                        for (String item : lista) {
                            System.out.println(item);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o índice do valor a ser atualizado: ");
                    int indiceAtualizado = scan.nextInt();
                    scan.nextLine();
                    if (indiceAtualizado >= 0 && indiceAtualizado < lista.size()) {
                        System.out.println("Digite o novo valor: ");
                        String novoValor = scan.nextLine();
                        lista.set(indiceAtualizado, novoValor);
                        System.out.println("Valor atualizado com sucesso.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Digite o índice a ser deletado: ");
                    int indiceDeletado = scan.nextInt();
                    scan.nextLine();
                    if (indiceDeletado >= 0 && indiceDeletado < lista.size()) {
                        String valorDeletado = lista.remove(indiceDeletado);
                        System.out.println("Valor '" + valorDeletado + "' deletado com sucesso.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (escolha != 5);

        scan.close();
    }
}
