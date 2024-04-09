package ro.ase.cts.s08.adapter;

import java.util.ArrayList;
import java.util.List;

interface FileSystemItem {
    void printName();
}
public class File implements FileSystemItem {
    private String name;
    public File(String name) {
        this.name = name;
    }
    @Override
    public void printName() {
        System.out.println("Name: " + name);
    }
}

class Directory implements FileSystemItem {
    private List<FileSystemItem> items = new ArrayList<>();
    private String name;
    public Directory(String name) {
        this.name = name;
    }
    @Override
    public void printName() {
        System.out.println("Directory: " + name);
        for (FileSystemItem item : items) {
            item.printName();
        }
    }
    public void addItem(FileSystemItem item) {
        items.add(item);
    }
}

class Main1 {
    public static void main(String[] args) {
        // Creating files
        File file1 = new File("File1.txt");
        File file2 = new File("File2.docx");
        File file3 = new File("File3.pdf");

        // Creating the root directory
        Directory rootDirectory = new Directory("RootDirectory");

        // Adding files to the root directory
        rootDirectory.addItem(file1);
        rootDirectory.addItem(file2);

        // Creating a sub-directory
        Directory subDirectory = new Directory("SubDirectory");

        // Adding files to the sub-directory
        subDirectory.addItem(file3);

        // Adding the sub-directory to the root directory
        rootDirectory.addItem(subDirectory);

        // Printing the contents of the root directory
        rootDirectory.printName();
    }
}
