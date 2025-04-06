package com.example.commands;

import com.example.commands.dwarvenMines.changePosCommand;
import com.example.commands.dwarvenMines.toggleMithrilCommand;
import net.minecraftforge.client.ClientCommandHandler;

public class Commands {
    public Commands() {
        ClientCommandHandler.instance.registerCommand(new changePosCommand());
        ClientCommandHandler.instance.registerCommand(new toggleMithrilCommand());
    }
}
