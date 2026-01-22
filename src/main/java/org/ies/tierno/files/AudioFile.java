package org.ies.tierno.files;

public class AudioFile extends File {
    private int length;

    public AudioFile(int size, String path, int length) {
        super(size, path);
        this.length = length;
    }

    @Override
    public void open(){
        System.out.println("Esto es un archivo de audio.");
        System.out.println("Ruta del archivo: " + path);
        System.out.println("Tamaño: " + size + "kb");
        System.out.println("Duración: " + length + " segundos.");
        System.out.println("");
    }
}
