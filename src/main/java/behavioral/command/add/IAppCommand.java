// Copyright Information
// ==================================
// DesignPatterns - BehaviorPatterns - IAppCommand.java
// All samples copyright Philip Japikse
// http://www.skimedic.com 2023/07/18
// ==================================

package behavioral.command.add;

public interface IAppCommand<T> {
    T getValue();
    T add(T value);
    T remove();
}
