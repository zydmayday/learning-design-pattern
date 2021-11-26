package design.pattern.factory_method;

import java.sql.Connection;

public class LogDao extends BaseDao{

  @Override
  public Connection getConnection() {
    return null;
  }
}
