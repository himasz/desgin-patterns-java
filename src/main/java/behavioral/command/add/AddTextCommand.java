package behavioral.command.add;

public class AddTextCommand extends BaseCommand<String> {
    public AddTextCommand(String value) {
        super(value);
    }

    @Override
    public String add(String textToAdd) {
        entries.add(textToAdd);
        internalValue += textToAdd;
        return getValue();
    }

    @Override
    public String remove() {
        // Should add error handling
        String lastEntry = entries.get(entries.size() - 1);
        int lastIndex = internalValue.lastIndexOf(lastEntry);
        if (lastIndex != -1) {
            internalValue = internalValue.substring(0, lastIndex);
        }
        entries.remove(entries.size() - 1);
        return getValue();
    }
}
