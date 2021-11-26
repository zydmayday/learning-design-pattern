package design.pattern.factory_method;

import java.sql.Connection;

public abstract class BaseDao implements IDao {

  void execute(String sql) {
    // open connection
    // execute sql
    // commit / rollback
  }

  public abstract Connection getConnection();
}
