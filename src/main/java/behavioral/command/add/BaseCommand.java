package behavioral.command.add;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseCommand<T> implements IAppCommand<T> {
    protected T internalValue;
    protected final List<T> entries = new ArrayList<>();

    protected BaseCommand(T value) {
        internalValue = value;
    }

    @Override
    public T getValue() {
        return internalValue;
    }

    @Override
    public abstract T add(T value);

    @Override
    public abstract T remove();
}
