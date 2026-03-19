package btvn.bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class RemoteControl {
    private List<Command> onCommands = new ArrayList<>();
    private List<Command> offCommands = new ArrayList<>();
    private Stack<Command> history = new Stack<>();

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        while (onCommands.size() <= slot) {
            onCommands.add(null);
            offCommands.add(null);
        }
        onCommands.set(slot, onCommand);
        offCommands.set(slot, offCommand);
    }

    public void pressOnButton(int slot) {
        if (slot >= 0 && slot < onCommands.size() && onCommands.get(slot) != null) {
            Command cmd = onCommands.get(slot);
            cmd.execute();
            history.push(cmd);
        } else {
            System.out.println("Chưa gán lệnh cho nút ON slot " + slot);
        }
    }

    public void pressOffButton(int slot) {
        if (slot >= 0 && slot < offCommands.size() && offCommands.get(slot) != null) {
            Command cmd = offCommands.get(slot);
            cmd.execute();
            history.push(cmd);
        } else {
            System.out.println("Chưa gán lệnh cho nút OFF slot " + slot);
        }
    }

    public void undoLastCommand() {
        if (!history.isEmpty()) {
            Command last = history.pop();
            System.out.print("(UNDO) ");
            last.undo();
        } else {
            System.out.println("Không còn lệnh nào để undo.");
        }
    }

    public void showSlots() {
        System.out.println("Các nút hiện có:");
        for (int i = 0; i < onCommands.size(); i++) {
            if (onCommands.get(i) != null) {
                System.out.println("Slot " + i + ": có lệnh");
            }
        }
    }
}
