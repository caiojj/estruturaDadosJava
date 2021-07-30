package one.innovation.digital.listaDuplamenteEncadeada;

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();

        minhaLista.add("C1");
        minhaLista.add("C2");
        minhaLista.add("C3");
        minhaLista.add("C4");
        minhaLista.add("C5");
        minhaLista.add("C6");
        minhaLista.add("C7");
        System.out.println(minhaLista);

        minhaLista.remove(6);

        System.out.println(minhaLista);

        minhaLista.add(3, "Test");

        System.out.println(minhaLista);

        System.out.println("Conteúdo do indice 3 = " + minhaLista.get(3));
    }
}
