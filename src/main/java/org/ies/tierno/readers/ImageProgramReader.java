package org.ies.tierno.readers;

import org.ies.tierno.files.ImageFile;
import org.ies.tierno.program.Program;

public class ImageProgramReader implements Reader<Program<ImageFile>> {

    @Override
    public Program<ImageFile> read() {
        ImageFile[] files = {
                new ImageFile(945, "Capturas de pantalla/Minecraft.png", 1600, 900),
                new ImageFile(1120, "Fotos/puesta_de_sol.jpg", 2048, 1152),
                new ImageFile(980, "Capturas/juego1.png", 1280, 720),
                new ImageFile(1340, "Capturas/juego2.png", 1920, 1080),
                new ImageFile(670, "Iconos/flecha.png", 48, 48),
                new ImageFile(890, "Iconos/usuario.png", 64, 64),
                new ImageFile(2500, "Fondos/ciudad.jpg", 3840, 2160),
                new ImageFile(150, "Iconos/estrella.png", 32, 32),
                new ImageFile(760, "Fotos/fiesta.jpg", 1600, 1200),
                new ImageFile(1950, "Fondos/montaña.jpg", 2560, 1440),
                new ImageFile(540, "Fotos/naturaleza.jpg", 1024, 768),
                new ImageFile(880, "Capturas/app.png", 1366, 768),
                new ImageFile(4100, "Fotos/galaxia.jpg", 4096, 2160),
                new ImageFile(300, "Iconos/mazda3.png", 128, 128),
                new ImageFile(720, "Fotos/niños.jpg", 1600, 900),
                new ImageFile(600, "Capturas/ventana.png", 800, 600),
                new ImageFile(1280, "Fondos/abstracto.png", 1920, 1200),
                new ImageFile(520, "Iconos/corazon.png", 64, 64),
                new ImageFile(1700, "Fotos/playa.jpg", 2048, 1536),
                new ImageFile(1010, "Capturas/diagram.png", 1600, 1200),
                new ImageFile(930, "Fotos/bosque.jpg", 1280, 960)
        };
        return new Program<>(files, "Visor de imágenes de Windows 98");
    }
}
