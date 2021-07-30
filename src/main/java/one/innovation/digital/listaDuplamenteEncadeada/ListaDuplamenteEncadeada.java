package one.innovation.digital.listaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {

    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return tamanhoLista;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        No<T> noAuxiliar  = primeiroNo;

        for(int i = 0; (noAuxiliar != null) && i < (index); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }

    public void add(T elemento) {
        No<T> novoNo = new No<>(elemento);

        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(this.ultimoNo);

        if(this.primeiroNo == null) {
            this.primeiroNo = novoNo;
        }

        if(this.ultimoNo != null) {
            this.ultimoNo.setNoProximo(novoNo);
        }
        this.ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento) {
        No<T> noAuxiliar = getNo(index);
        No<T> novoNo = new No<>(elemento);

        novoNo.setNoProximo(noAuxiliar);

        if(novoNo.getNoProximo() != null) {
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        } else {
            novoNo.setNoPrevio(this.ultimoNo);
            this.ultimoNo = novoNo;
        }

        if(index == 0) {
            this.primeiroNo = novoNo;
        } else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }

        tamanhoLista++;
    }

    public void remove(int index) {
        if(index == 0) {
            this.primeiroNo = primeiroNo.getNoProximo();

            if(this.primeiroNo != null) {
                this.primeiroNo.setNoPrevio(null);
            }
        } else {
            No<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());

            if(noAuxiliar != this.ultimoNo) {
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            } else {
                ultimoNo = noAuxiliar;
            }
        }
        this.tamanhoLista--;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = this.primeiroNo;

        for(int i = 0; i < this.size(); i++) {
            strRetorno += "[No{conteúdo= " + noAuxiliar.getConteudo() + "}]==>";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        strRetorno += "null";

        return strRetorno;
    }
}
