package org.ies.tierno.readers;

import org.ies.tierno.files.AudioFile;
import org.ies.tierno.files.TextFile;
import org.ies.tierno.program.Program;
import java.util.Random;

public class AudioProgramReader implements Reader<Program<AudioFile>> {

    private final Random random;

    public AudioProgramReader(Random random, AudioReader audioReader) {
        this.random = random;
        this.audioReader = audioReader;
    }

    private final AudioReader audioReader;

    @Override
    public Program<AudioFile> read() {
        int number = random.nextInt(1, 9);

        AudioFile[] files = new AudioFile[number];

        for (int i = 0; i < number; i++) {

            files[i] = audioReader.read();
        }
        return new Program<>(files, "Reproductor de audio");
    }
}
