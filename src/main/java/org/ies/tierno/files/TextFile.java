package org.ies.tierno.files;

public class TextFile extends File {
    private String text;

    public TextFile(int size, String path, String text) {
        super(size, path);
        this.text = text;
    }

    @Override
    public void open(){
        System.out.println("Esto es un archivo de texto.");
        System.out.println("Ruta del archivo: " + path);
        System.out.println("Tamaño: " + size + "kb");
        System.out.println("Contiene: " + text);
        System.out.println("");
    }
}
