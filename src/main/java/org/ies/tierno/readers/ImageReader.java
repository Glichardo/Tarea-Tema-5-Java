package org.ies.tierno.readers;

import org.ies.tierno.files.AudioFile;
import org.ies.tierno.files.ImageFile;

import java.awt.*;
import java.util.Random;

public class ImageReader implements  Reader<ImageFile> {
    private final Random random = new Random();

    private final static String[] PATHS = {"Capturas de pantalla/Minecraft.png", "Fotos/puesta_de_sol.jpg", "Capturas/juego1.png", "Capturas/juego2.png", "Iconos/flecha.png", "Iconos/usuario.png", "Fondos/ciudad.jpg", "Iconos/estrella.png", "Fotos/fiesta.jpg", "Fondos/montaña.jpg", "Fotos/naturaleza.jpg", "Capturas/app.png", "Fotos/galaxia.jpg", "Iconos/mazda3.png", "Fotos/niños.jpg", "Capturas/ventana.png", "Fondos/abstracto.png", "Iconos/corazon.png", "Fotos/playa.jpg", "Capturas/diagram.png", "Fotos/bosque.jpg"};

    String path = PATHS[random.nextInt(PATHS.length)];

    @Override
    public ImageFile read() {
        return new ImageFile(random.nextInt(100, 10000), path, random.nextInt(100, 10000), random.nextInt(100, 10000));
    }
}
