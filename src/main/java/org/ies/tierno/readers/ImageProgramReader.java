package org.ies.tierno.readers;

import org.ies.tierno.files.ImageFile;
import org.ies.tierno.program.Program;
import java.util.Random;

public class ImageProgramReader implements Reader<Program<ImageFile>> {

    private final Random random;

    public ImageProgramReader(Random random, ImageReader imageReader) {
        this.random = random;
        this.imageReader = imageReader;
    }

    private final ImageReader imageReader;

    @Override
    public Program<ImageFile> read() {
        int number = random.nextInt(1, 9);

        ImageFile[] files = new ImageFile[number];

        for (int i = 0; i < number; i++) {

            files[i] = imageReader.read();
        }
        return new Program<>(files, "Visualizador de fotos");
    }
}
