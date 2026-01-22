package org.ies.tierno.readers;

import org.ies.tierno.files.ImageFile;

public class ImageReader implements Reader<ImageFile> {

    @Override
    public ImageFile read() {
        return new ImageFile(2056, "Imágenes/Capturas de pantalla/foto coche 1.jpg", 1920, 1080);
    }
}
