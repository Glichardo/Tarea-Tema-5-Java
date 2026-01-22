package org.ies.tierno.main;

import org.ies.tierno.files.AudioFile;
import org.ies.tierno.files.ImageFile;
import org.ies.tierno.files.TextFile;
import org.ies.tierno.program.Program;
import org.ies.tierno.readers.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            option = showMenu(scanner);

            if (option == 1) {
                textProgram(scanner);
            } else if (option == 2) {
                imageProgram(scanner);
            }else if (option == 3) {
                audioProgram(scanner);
            }else if (option == 4) {

            } else{
                System.out.println("Opción invalida. Vuelve a intentarlo.");
            }
        } while (option != 4);

    }

    public static int showMenu(Scanner scanner) {
        System.out.println("");
        System.out.println("Elige el programa para ejecutar: ");
        System.out.println("1. Bloc de notas");
        System.out.println("2. Visor de imágenes");
        System.out.println("3. Reproductor de audio");
        System.out.println("4. Salir");
        System.out.println("");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;

    }

    public static void textProgram(Scanner scanner) {
        Reader<Program<TextFile>> textReader = new TextProgramReader();
        Program<TextFile> program = textReader.read();

        System.out.println("Introduce output path: ");
        String outputPath = scanner.nextLine();
        program.execute(outputPath);
    }

    public static void imageProgram(Scanner scanner) {
        Reader<Program<ImageFile>> imageReader = new ImageProgramReader();
        Program<ImageFile> program = imageReader.read();

        System.out.print("Introduce el path de salida: ");
        String outputPath = scanner.nextLine();
        program.execute(outputPath);
    }

    public static void audioProgram(Scanner scanner) {
        Reader<Program<AudioFile>> audioReader = new AudioProgramReader();
        Program<AudioFile> program = audioReader.read();

        System.out.print("Introduce el path de salida: ");
        String outputPath = scanner.nextLine();
        program.execute(outputPath);
    }
}
