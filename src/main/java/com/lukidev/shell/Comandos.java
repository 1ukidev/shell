package com.lukidev.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class Comandos {

    @ShellMethod("Retorna o quadrado de um número")
    public int quadrado(
        @ShellOption(value = "-x", help = "Alvo") int x
    ) {
        return x * x;
    }

}
