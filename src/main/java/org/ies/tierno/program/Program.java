package org.ies.tierno.program;

import org.ies.tierno.files.File;

public class Program <T extends File> {
    private T[] files;
    private String name;

    public Program(T[] files, String name) {
        this.files = files;
        this.name = name;
    }

    public void execute(String outputPath) {
        System.out.println("Ejecutando " + name + " ...");
        for (T file : files) {
            file.open();
            file.move(outputPath);
        }
    }
}
