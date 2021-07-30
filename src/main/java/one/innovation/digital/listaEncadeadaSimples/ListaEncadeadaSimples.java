package one.innovation.digital.listaEncadeadaSimples;

public class ListaEncadeadaSimples<T> {

    private No<T> referenciaEndada;

    public ListaEncadeadaSimples() {
        this.referenciaEndada = null;
    }

    public boolean isEmpty() {
        return this.referenciaEndada == null;
    }

    public int size() {
        int tamanhoLista = 0;

        No<T> referenciaAux  = referenciaEndada;

        while(true) {
            if(referenciaAux != null) {
                tamanhoLista++;

                if(referenciaAux.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        if(this.isEmpty()) {
            this.referenciaEndada = novoNo;
            return;
        }

        No<T> noAuxiliar = this.referenciaEndada;

        for(int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    private No<T> getNo(int index) {

        validaIndice(index);

        No<T> noAuxiliar = this.referenciaEndada;
        No<T> noRetorno = null;

        for(int i = 0; i < index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    private void validaIndice(int index) {
        if(index >= size()) {
            int ultimoIndice = this.size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteudo no indice " + index + "desta lista" + "Esta lista so vai até o indice " + ultimoIndice + ".");
        }
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    public T remove(int index) {
        validaIndice(index);
        No<T> noPivor = this.getNo(index);

        if(index == 0) {
            this.referenciaEndada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }

        No<T> noAnterios = getNo(index - 1);

        noAnterios.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    @Override
    public String toString() {

        String strRetorno = "";

        No<T> noAuxiliar = this.referenciaEndada;

        for(int i = 0; i < this.size(); i++) {
            strRetorno += "No{Conteudo=" + noAuxiliar.getConteudo() + "}\n";

            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return strRetorno;
    }
}
