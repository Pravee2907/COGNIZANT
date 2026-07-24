interface Document {
    void show();
}

class WordDocument implements Document {
    public void show() {
        System.out.println("This is Word Document");
    }
}

class PdfDocument implements Document {
    public void show() {
        System.out.println("This is PDF Document");
    }
}

class ExcelDocument implements Document {
    public void show() {
        System.out.println("This is Excel Document");
    }
}

abstract class DocumentFactory {
    abstract Document getDocument();
}

class WordFactory extends DocumentFactory {
    Document getDocument() {
        return new WordDocument();
    }
}

class PdfFactory extends DocumentFactory {
    Document getDocument() {
        return new PdfDocument();
    }
}

class ExcelFactory extends DocumentFactory {
    Document getDocument() {
        return new ExcelDocument();
    }
}

public class Ex2 {
    public static void main(String[] args) {

        DocumentFactory word = new WordFactory();
        Document d1 = word.getDocument();
        d1.show();

        DocumentFactory pdf = new PdfFactory();
        Document d2 = pdf.getDocument();
        d2.show();

        DocumentFactory excel = new ExcelFactory();
        Document d3 = excel.getDocument();
        d3.show();
    }
}