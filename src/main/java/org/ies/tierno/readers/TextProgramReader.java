package org.ies.tierno.readers;

import org.ies.tierno.files.TextFile;
import org.ies.tierno.program.Program;

public class TextProgramReader implements Reader<Program<TextFile>> {
    @Override
    public Program<TextFile> read() {
        TextFile[] files = {
                new TextFile(1456, "Escritorio/trabajo de programación.docx", "java mola un montón, mas que C++ o Python, aunque es muy dificil. Lorem ipsum bla bla bla..."),
                new TextFile(645, "Escritorio/apuntes CSS.txt", "css es para dar estilos a mi pagina web. tiene cosas interesantes, por ejemplo con 'text-decoration: underline' puedo subrayar cualquier texto"),
                new TextFile(7342, "/Usuario/rodrigo/Documentos/Rockstar Games/GTAVI/crash.log", "Vaya! El programa se ha cerrado inesperadamente... Se han enviado todos tus datos fiscales a Rockstar Games"),
                new TextFile(210, "Documentos/notas.txt", "hoy he aprendido herencia en java y es complicao"),
                new TextFile(980, "Descargas/manual.txt", "Manual de usuario: pulsa boton de encendido y listo."),
                new TextFile(1200, "Documentos/diario.txt", "Querido diario, hoy estaba bebiendo mi cocacola del burger king y el vaso de papel biodegradable se estaba biodegradando en mis manos, pero no pasa nada porque taylor swift solo ha cogido su yet privado por quinta vez hoy asi que estamos salvando el planeta"),
                new TextFile(540, "Escritorio/recordatorio.txt", "ejercicio de programacion: tarea4, entregar este finde"),
                new TextFile(360, "Documentos/receta.txt", "Ingredientes: cebolla, ajo y tomate. hacemos el sofrito hasta que dore, luego ponemos pimenton dulce y picante. disfruta el sofrito y usalo con lo que quieras."),
                new TextFile(890, "Descargas/proyectoFgewr95wy.txt", "Proyecto Soterramiento de la A-5: se planea terminar en noviembre de 2036."),
                new TextFile(130, "Escritorio/mensaje.txt", "probando probando 123")
        };
        return new Program<>(files, "Bloc de notas");
    }

}
