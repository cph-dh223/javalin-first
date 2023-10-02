package app;

import java.util.List;

import org.postgresql.jdbc2.optional.ConnectionPool;

public interface IUserController {
    public List<User> showUserList (Context cxt, ConnectionPool connectionPool);
}
