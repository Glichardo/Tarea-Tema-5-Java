package org.ies.tierno.files;

public class ImageFile extends File {
    private int width;
    private int height;

    public ImageFile(int size, String path, int width, int height) {
        super(size, path);
        this.width = width;
        this.height = height;
    }

    @Override
    public void open(){
        System.out.println("Esto es una imagen.");
        System.out.println("Ruta del archivo: " + path);
        System.out.println("Tamaño: " + size + "kb");
        System.out.println("Resolución: " + width + "x" + height);
        System.out.println("");
    }
}
