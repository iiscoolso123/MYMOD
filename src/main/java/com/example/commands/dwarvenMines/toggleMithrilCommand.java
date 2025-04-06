package com.example.commands.dwarvenMines;

import com.example.commands.ClientCommandBase;
import com.example.features.dwarvenmines.MithrilPowderTracker;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

import java.text.ParseException;

public class toggleMithrilCommand extends ClientCommandBase {
    public toggleMithrilCommand() {
        super("toggleMithrilTracker");
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        MithrilPowderTracker.showTracker = !MithrilPowderTracker.showTracker;
    }
}
