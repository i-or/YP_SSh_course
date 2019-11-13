


public class CountElement {
    private String elementToSearch;
    private String sourceOfElements;
    // int counter;


    public String getElementToSearch() {
        return elementToSearch;
    }

    public String getSourceOfElements() {
        return sourceOfElements;
    }

    public CountElement(String elementToSearch) {
        this.elementToSearch = elementToSearch;
        this.sourceOfElements = setSourceOfElements();
    }

    private String setSourceOfElements() {
        return "abbbbbbbbabbbabbbbghfjdfghg54wg3t4dfghaaaaaaafdcvncygfjfghaasfsdfdsfsdfaaabba";
    }

    public int counter(String anyText, String elementToFind) {
        anyText = sourceOfElements;
        elementToFind = elementToSearch;
        int counter;
        int x = anyText.indexOf(elementToFind);
        if (x != -1) {
            counter = 0;
            while (x != -1) {
                x = anyText.indexOf(elementToFind, x + 1);
                counter++;
            }
        } else {
            counter = 0;
        }
        return counter;
    }
}



