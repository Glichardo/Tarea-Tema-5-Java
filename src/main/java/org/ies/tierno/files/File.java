package org.ies.tierno.files;

public abstract class File {
    protected int size;
    protected String path;

    public File(int size, String path) {
        this.size = size;
        this.path = path;
    }

    //abstracto porque todos los archivos se abren pero el hijo solo puede saber como
    public abstract void open();

    public void move(String newPath){
        if (this.path.equals(newPath)) {
            System.out.println("No hay cambios.");
            System.out.println("");
            System.out.println("");
        } else {
            this.path = newPath;
            System.out.println("Se ha movido el fichero a " + newPath);
            System.out.println("");
            System.out.println("");
        }
    }
}
