import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCorrigido {

    public static void main(String[] args) {
        /* Primeira parte do print */
        imprimirDecoracao();
        System.out.println("Exemplo do calculo do retângulo com funções");
        imprimirDecoracao();

        calcularSomaAreas();

        /* Segunda parte do print */
        imprimirDecoracao();
        System.out.println("Exemplo de mostrar lista de números com funções");
        imprimirDecoracao();

        List<Integer> listaNumerosArray = retornarListaNumeros();
        mostrarTodosOsValoresListaNumero(listaNumerosArray);

        imprimirDecoracao();

        /* Terceira parte do print */
        List<String> listaNomesComQuantidade = retornarListaNomes();
        imprimirDecoracao();
        System.out.println("Exemplo de mostrar lista de quantidade de nomes com funções");
        imprimirDecoracao();
        System.out.println("Exemplo de array = " + listaNomesComQuantidade);
        mostrarNomesComPosicao(listaNomesComQuantidade);

    }

    public static void calcularSomaAreas() {
        double somaAreas = calcularAreaRetanguloComInputUsuario() + calcularAreaRetanguloComInputUsuario();
        System.out.println("A area total de construção é de " + somaAreas);
    }

    public static double calcularAreaRetanguloComInputUsuario() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a base: ");
        double base = ler.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = ler.nextDouble();

        return calcularAreaRetangulo(base, altura);
    }

    public static double calcularAreaRetangulo(double base, double altura) {
        double areaRetangulo = base * altura;
        System.out.println("O valor da área do retangulo é " + areaRetangulo);
        return areaRetangulo;
    }

    public static void mostrarTodosOsValoresListaNumero(List<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }

    public static List<Integer> retornarListaNumeros() {
        Scanner sc = new Scanner(System.in);

        List<Integer> listaNumero = new ArrayList<>(3);

        System.out.println("Digite a quantidade de números: ");
        int capacidade = sc.nextInt();

        for (int i = 1; i <= capacidade; i++) {
            System.out.printf("Digite o %dª número inteiro: ", i);
            listaNumero.add(sc.nextInt());
        }

        return listaNumero;
    }

    public static void mostrarNomesComPosicao(List<String> nomesExibir) {
        for (int i = 0; i < nomesExibir.size(); i++) {
            System.out.println(i + ": " + nomesExibir.get(i));
        }
    }

    public static List<String> retornarListaNomes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de nomes: ");
        int capacidade = scanner.nextInt();
        scanner.nextLine();

        List<String> listaNomes = new ArrayList<>();

        for (int i = 0; i < capacidade; i++) {
            System.out.println("Digite um nome: ");
            listaNomes.add(scanner.nextLine());
        }
        return listaNomes;
    }

    public static void imprimirDecoracao() {
        System.out.println("=========================================================");
    }
}


