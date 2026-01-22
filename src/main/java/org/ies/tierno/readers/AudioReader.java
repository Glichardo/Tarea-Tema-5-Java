package org.ies.tierno.readers;

import org.ies.tierno.files.AudioFile;

public class AudioReader implements Reader<AudioFile> {

    @Override
    public AudioFile read() {
        return new AudioFile(1024, "Música/mis óperas favoritas/la traviatta.mp3", 7200);
    }
}
