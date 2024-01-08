package behavioral.command.add;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {
    @Test
    void shouldAddNumbers() {
        int initValue = 12;
        int firstAdd = 5;
        AddNumbersCommand addNumbersCommand = new AddNumbersCommand(initValue);
        addNumbersCommand.add(firstAdd);
        assertEquals(initValue + firstAdd, addNumbersCommand.getValue());
    }

    @Test
    void shouldUndoAddingNumbers() {
        int initValue = 12;
        int firstAdd = 5;
        AddNumbersCommand addNumbersCommand = new AddNumbersCommand(initValue);
        addNumbersCommand.add(firstAdd);
        addNumbersCommand.remove();
        assertEquals(initValue, addNumbersCommand.getValue());
    }

    @Test
    void shouldAddText() {
        String initValue = "Patterns";
        String firstAdd = " are fun";
        AddTextCommand addTextCommand = new AddTextCommand(initValue);
        addTextCommand.add(firstAdd);
        assertEquals(initValue + firstAdd, addTextCommand.getValue());
    }

    @Test
    void shouldUndoText() {
        String initValue = "Patterns";
        String firstAdd = " are fun";
        AddTextCommand addTextCommand = new AddTextCommand(initValue);
        addTextCommand.add(firstAdd);
        addTextCommand.remove();
        assertEquals(initValue, addTextCommand.getValue());
    }
}