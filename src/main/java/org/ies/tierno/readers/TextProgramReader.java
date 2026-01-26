package org.ies.tierno.readers;

import org.ies.tierno.files.TextFile;
import org.ies.tierno.program.Program;
import java.util.Random;

public class TextProgramReader implements Reader<Program<TextFile>> {

    private final Random random;

    public TextProgramReader(Random random, TextReader textReader) {
        this.random = random;
        this.textReader = textReader;
    }

    private final TextReader textReader;

    @Override
    public Program<TextFile> read() {
        int number = random.nextInt(1, 9);

        TextFile[] files = new TextFile[number];

        for (int i = 0; i < number; i++) {

            files[i] = textReader.read();
        }
        return new Program<>(files, "Bloc de notas");
    }
}
