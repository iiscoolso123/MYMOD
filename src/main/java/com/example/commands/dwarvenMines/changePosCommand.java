package com.example.commands.dwarvenMines;

import com.example.commands.ClientCommandBase;
import com.example.features.dwarvenmines.MithrilPowderTracker;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

import java.text.NumberFormat;
import java.text.ParseException;

public class changePosCommand extends ClientCommandBase {
    NumberFormat nf = NumberFormat.getInstance();

    public changePosCommand() {
        super("changeMithrilPos");
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if (args.length > 1) {
            try {
                int dx = nf.parse(args[0]).intValue();
                int dy = nf.parse(args[1]).intValue();
                MithrilPowderTracker.x += dx;
                MithrilPowderTracker.y += dy;
            } catch (ParseException e) {
                throw new CommandException("Invalid number format. Use plain numbers or numbers with commas.");
            }
        } else {
            throw new CommandException("Usage: /changeMithrilPos <x> <y>");
        }
    }
}
