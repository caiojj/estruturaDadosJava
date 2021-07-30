package one.innovation.digital.fila;

public class Fila<T> {

    private No<T> refNoentradaFila;

    public Fila() {
        this.refNoentradaFila = null;
    }

    private boolean isEmpty() {
        return this.refNoentradaFila == null;
    }

    public void enqueue(T obj) {
        No novoNo = new No(obj);
        novoNo.setRefNo(this.refNoentradaFila);
        this.refNoentradaFila = novoNo;
    }

    public T first() {
        if(!this.isEmpty()) {
            No primeiroNo = this.refNoentradaFila;

            while(true) {
                if(primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue() {
        if(!this.isEmpty()) {
            No primeiroNo = this.refNoentradaFila;
            No noAuxiliar = this.refNoentradaFila;

            while(true) {
                if(primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = this.refNoentradaFila;

        if(this.refNoentradaFila != null) {
            while(true) {
                stringRetorno += "[No{object=" + noAuxiliar.getObject() + "}]==>";

                if(noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
