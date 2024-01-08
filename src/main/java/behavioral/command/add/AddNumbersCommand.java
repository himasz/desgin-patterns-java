package behavioral.command.add;

public class AddNumbersCommand extends BaseCommand<Integer> {
    public AddNumbersCommand(int value) {
        super(value);
    }

    @Override
    public Integer add(Integer value) {
        entries.add(value);
        internalValue += value;
        return getValue();
    }

    @Override
    public Integer remove() {
        // Should add error checking here
        int lastEntry = entries.get(entries.size() - 1);
        internalValue -= lastEntry;
        entries.remove(entries.size() - 1);
        return getValue();
    }
}
