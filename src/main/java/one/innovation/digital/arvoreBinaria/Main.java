package one.innovation.digital.arvoreBinaria;

import one.innovation.digital.arvoreBinaria.model.Obj;

/*
* Operações básicas em arvire binaria
* Inserção -> maiores para a direita e os menore para a esquerda
* Exclusão -> pegar o maior elemento entre os menores
*
* */
public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();

        minhaArvore.inserir(new Obj(13));
        minhaArvore.inserir(new Obj(10));
        minhaArvore.inserir(new Obj(25));
        minhaArvore.inserir(new Obj(2));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(20));
        minhaArvore.inserir(new Obj(31));
        minhaArvore.inserir(new Obj(29));

        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();
    }

}
