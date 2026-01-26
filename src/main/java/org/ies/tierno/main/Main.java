package org.ies.tierno.main;

import org.ies.tierno.files.AudioFile;
import org.ies.tierno.files.ImageFile;
import org.ies.tierno.files.TextFile;
import org.ies.tierno.program.Program;
import org.ies.tierno.readers.*;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int option;

        do {
            option = showMenu(scanner);

            if (option == 1) {
                textProgram(scanner, random);
            } else if (option == 2) {
                imageProgram(scanner, random);
            }else if (option == 3) {
                audioProgram(scanner, random);
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

    public static void textProgram(Scanner scanner, Random random) {
        TextReader textReader = new TextReader();
        Reader<Program<TextFile>> textProgramReader = new TextProgramReader(random, textReader);
        Program<TextFile> program = textProgramReader.read();

        System.out.println("Introduce output path: ");
        String outputPath = scanner.nextLine();
        program.execute(outputPath);
    }

    public static void imageProgram(Scanner scanner, Random random) {
        ImageReader imageReader = new ImageReader();
        Reader<Program<ImageFile>> imageProgramReader = new ImageProgramReader(random, imageReader);
        Program<ImageFile> program = imageProgramReader.read();

        System.out.print("Introduce el path de salida: ");
        String outputPath = scanner.nextLine();
        program.execute(outputPath);
    }

    public static void audioProgram(Scanner scanner, Random random) {
        AudioReader audioReader = new AudioReader();
        Reader<Program<AudioFile>> audioProgramReader = new AudioProgramReader(random, audioReader);
        Program<AudioFile> program = audioProgramReader.read();

        System.out.print("Introduce el path de salida: ");
        String outputPath = scanner.nextLine();
        program.execute(outputPath);
    }
}
