package org.Gorbachev.view;

import org.Gorbachev.model.User;
import java.util.List;

public interface UserView <T extends User> {
    public void sendOnConsole(List<T> list);
}
