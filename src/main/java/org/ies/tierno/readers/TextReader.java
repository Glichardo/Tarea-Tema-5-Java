package org.ies.tierno.readers;

import org.ies.tierno.files.TextFile;

import java.util.Random;

public class TextReader implements  Reader<TextFile> {
private final Random random = new Random();

    private final static String[] PATHS = {"Escritorio/trabajo.docx", "Escritorio/apuntesCSS.txt", "Documentos/nota.txt", "Descargas/manual.txt", "Documentos/diario.txt", "Escritorio/recordatorio.txt", "Documentos/receta.txt", "Descargas/proyecto.txt", "Escritorio/mensaje.txt", "Documentos/informe.txt"};
    private final static String[] TEXTS = {"java mola un montón, mas que C++ o Python...", "css es para dar estilos a mi pagina web...", "hoy he aprendido herencia en java y es complicao", "Manual de usuario: pulsa boton de encendido...", "Querido diario, hoy estaba bebiendo mi cocacola...", "ejercicio de programacion: tarea4, entregar este finde", "Ingredientes: cebolla, ajo y tomate...", "Proyecto Soterramiento de la A-5...", "probando probando 123", "Este texto es un ejemplo de archivo aleatorio"};



    String path = PATHS[random.nextInt(PATHS.length)];
    String text = TEXTS[random.nextInt(TEXTS.length)];

    @Override
    public TextFile read() {
        return new TextFile(random.nextInt(100, 10000), path, text);
    }
}
