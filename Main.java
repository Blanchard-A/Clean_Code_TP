public class Main {
    
    public static void main(String[] args) {
        //System.out.println("Salut");
        LinkedList list = new LinkedList();

        Element test = new Element("D");

        list.addElementAtBegin(new Element("B"));
        list.addElementAtBegin(new Element("A"));
        list.addElementAtEnd(test);
        list.addElementAtIndex(new Element("C"), 2);
        list.addElementAtEnd(new Element("E"));
        list.addElementAtIndex(new Element("A"), 1);

        list.deleteElementAtIndex(1);
        //list.deleteElementWithElement(test);


        //list.addElementAtBegin(test);
        list.addElementAtIndex(test, 3);


        list.printList();
    }
}