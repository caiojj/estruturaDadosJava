package one.innovation.digital.arvoreBinaria.model;

public abstract class ObjArvore<T> implements Comparable<T> {
    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract int compareTo(Obj outro);
    public abstract String toString();
}
