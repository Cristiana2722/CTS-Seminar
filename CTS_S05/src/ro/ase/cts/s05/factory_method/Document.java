package ro.ase.cts.s05.factory_method;

// Product interface
public interface Document {
    void open();
    void save();
}

// Concrete products
class TextDocument implements Document {
    @Override
    public void open() {
        System.out.println("Text document is opened.");
    }

    @Override
    public void save() {
        System.out.println("Text document is saved.");
    }
}

class ImageDocument implements Document {
    @Override
    public void open() {
        System.out.println("Image document is opened.");
    }

    @Override
    public void save() {
        System.out.println("Image document is saved.");
    }
}

// Creator interface (Factory Method)
interface DocumentFactory {
    Document createDocument();
}

// Concrete creators
class TextDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}

class ImageDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new ImageDocument();
    }
}

// Client code
class MainEx2 {
    public static void main(String[] args) {
        // Using factory Method to create instances
        DocumentFactory textDocumentFactory = new TextDocumentFactory();
        Document textDocument = textDocumentFactory.createDocument();
        textDocument.open();
        textDocument.save();

        DocumentFactory imageDocumentFactory = new ImageDocumentFactory();
        Document imageDocument = imageDocumentFactory.createDocument();
        imageDocument.open();
        imageDocument.save();
    }
}