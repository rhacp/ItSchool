package session18.challenge.challenge16.models;

public class ClassPair <T, U> {

    private T ttype;
    private U utype;

    public T getTtype() {
        return ttype;
    }

    public void setTtype(T ttype) {
        this.ttype = ttype;
    }

    public U getUtype() {
        return utype;
    }

    public void setUtype(U utype) {
        this.utype = utype;
    }
}
