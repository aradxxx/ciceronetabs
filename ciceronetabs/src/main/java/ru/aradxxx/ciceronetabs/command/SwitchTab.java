package ru.aradxxx.ciceronetabs.command;

import androidx.annotation.NonNull;
import ru.terrakok.cicerone.Screen;
import ru.terrakok.cicerone.commands.Command;

/**
 * Переключение таба.
 */
public final class SwitchTab implements Command {
    @NonNull
    private final Screen screen;

    public SwitchTab(@NonNull Screen screen) {
        this.screen = screen;
    }

    @NonNull
    public Screen getScreen() {
        return screen;
    }
}