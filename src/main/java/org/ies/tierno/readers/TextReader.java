package org.ies.tierno.readers;

import org.ies.tierno.files.TextFile;

public class TextReader implements  Reader<TextFile> {

    @Override
    public TextFile read() {
        return new TextFile(67, "Documentos/carpeta privada/contraseñas.txt", "Contraseña: pensabasQueEstoEraUnaContraseña?");
    }
}
