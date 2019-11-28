public class LinkedList {
    Element first;

    public LinkedList() {
    }

    public LinkedList(Element element) {
        first = element;
    }


    public void addElementAtBegin(Element elementToAdd) {
        elementToAdd.next = first;
        first = elementToAdd;
    }
    
    public void addElementAtEnd(Element elementToAdd) {
        Element element = this.first;

        while (element.next != null) {
            element = element.next;
        }
        element.next = elementToAdd;
    }

    public void addElementAtIndex(Element elementToAdd, int index) {
        Element element = this.first;
        int i = 0;

        while (i != index - 1 && element.next != null) {
            element = element.next;
            i++;
            //System.out.println("i = " + i);
        }
        elementToAdd.next = element.next;
        element.next = elementToAdd;
        if (index == 0)
            this.first = elementToAdd;
    }


    public void deleteElementAtIndex(int index) {
        Element element = this.first;
        int i = 0;

        while (i != index - 1 && element.next != null) {
            element = element.next;
            i++;
        }
        element.next = element.next.next;
    }

    public void deleteElementWithElement(Element elementToRemove) {
        Element element = this.first;

        while (element.next != null) {
            if (elementToRemove.equals(element.next))
                element.next = element.next.next;
            element = element.next;
        }
    }


    public Element getElementWithIndex(int index) {
        Element element = this.first;
        int i = 0;
        
        while (element != null && i != index) {
            element = element.next;
        }
        return element;
    }


    public int getSize() {
        Element element = this.first;
        int i = 0;

        while (element != null) {
            element = element.next;
        }
        return i;
    }

    public int getIndexFirstOccurence(Element elementToFind) {
        Element element = this.first;
        int i = 0;

        while (element != null) {
            if (elementToFind.equals(element) == true)
                return (i);
            i++;
            element = element.next;
        }
        return i;
    }

    public int getIndexLastOccurence(Element elementToFind) {
        Element element = this.first;
        int i = 0;
        int last = 0;

        while (element != null) {
            if (elementToFind.equals(element) == true)
                last = i;
            i++;
            element = element.next;
        }
        return last;
    }

    public void printList() {
        Element elem = this.first;

        while (elem != null) {
            System.out.println(elem.value + " ");
            elem = elem.next;
        }
    }

}