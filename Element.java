public class Element {
    Element next;
    String value;

    public Element(String data) {
        value = data;
        next = null;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        else
            return false;
    }

}