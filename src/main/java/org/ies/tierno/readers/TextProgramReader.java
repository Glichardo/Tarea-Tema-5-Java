package org.ies.tierno.readers;

import org.ies.tierno.files.TextFile;
import org.ies.tierno.program.Program;
import java.util.Random;

public class TextProgramReader implements Reader<Program<TextFile>> {

    private final static String[] PATHS = {"Escritorio/trabajo.docx", "Escritorio/apuntesCSS.txt", "Documentos/nota.txt", "Descargas/manual.txt", "Documentos/diario.txt", "Escritorio/recordatorio.txt", "Documentos/receta.txt", "Descargas/proyecto.txt", "Escritorio/mensaje.txt", "Documentos/informe.txt"};
    private final static String[] TEXTS = {"java mola un montón, mas que C++ o Python...", "css es para dar estilos a mi pagina web...", "hoy he aprendido herencia en java y es complicao", "Manual de usuario: pulsa boton de encendido...", "Querido diario, hoy estaba bebiendo mi cocacola...", "ejercicio de programacion: tarea4, entregar este finde", "Ingredientes: cebolla, ajo y tomate...", "Proyecto Soterramiento de la A-5...", "probando probando 123", "Este texto es un ejemplo de archivo aleatorio"};

    private Random random;
    public TextProgramReader(Random random) {
    this.random = random;
    }
    @Override
    public Program<TextFile> read() {
        int number = random.nextInt(1, 9);

        TextFile[] files = new TextFile[number];

        for (int i = 0; i < number; i++) {
            int size = random.nextInt(100, 2000);
            String path = PATHS[random.nextInt(PATHS.length)];
            String text = TEXTS[random.nextInt(TEXTS.length)];
            files[i] = new TextFile(size, path, text);
        }
        return new Program<>(files, "Bloc de notas");
    }
}
