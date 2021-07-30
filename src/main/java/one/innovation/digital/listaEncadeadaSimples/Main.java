package one.innovation.digital.listaEncadeadaSimples;

public class Main {
    public static void main(String[] args) {
        ListaEncadeadaSimples<String> minhaListaEncadeada = new ListaEncadeadaSimples<>();

        minhaListaEncadeada.add("teste 1");
        minhaListaEncadeada.add("teste 2");
        minhaListaEncadeada.add("teste 3");
        minhaListaEncadeada.add("teste 4");

        System.out.println(minhaListaEncadeada);

        System.out.println("O tamanho da minha lista é: " + minhaListaEncadeada.size());

        System.out.println(minhaListaEncadeada.remove(3));

        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.get(2));
    }
}
