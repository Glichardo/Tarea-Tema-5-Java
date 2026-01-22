package org.ies.tierno.readers;

import org.ies.tierno.files.AudioFile;
import org.ies.tierno.files.ImageFile;
import org.ies.tierno.program.Program;

import java.util.Random;

public class ImageProgramReader implements Reader<Program<ImageFile>> {

    private final static String[] PATHS = {"Capturas de pantalla/Minecraft.png", "Fotos/puesta_de_sol.jpg", "Capturas/juego1.png", "Capturas/juego2.png", "Iconos/flecha.png", "Iconos/usuario.png", "Fondos/ciudad.jpg", "Iconos/estrella.png", "Fotos/fiesta.jpg", "Fondos/montaña.jpg", "Fotos/naturaleza.jpg", "Capturas/app.png", "Fotos/galaxia.jpg", "Iconos/mazda3.png", "Fotos/niños.jpg", "Capturas/ventana.png", "Fondos/abstracto.png", "Iconos/corazon.png", "Fotos/playa.jpg", "Capturas/diagram.png", "Fotos/bosque.jpg"};

    private Random random;
    public ImageProgramReader(Random random) {
        this.random = random;
    }
    @Override
    public Program<ImageFile> read() {
        int number = random.nextInt(1, 9);

        ImageFile[] files = new ImageFile[number];

        for (int i = 0; i < number; i++) {
            int size = random.nextInt(100, 2000);
            String path = PATHS[random.nextInt(PATHS.length)];
            int width = random.nextInt(100, 5000);
            int height = random.nextInt(100, 5000);
            files[i] = new ImageFile(size, path, width, height);
        }
        return new Program<>(files, "Reproductor de música");
    }


}
