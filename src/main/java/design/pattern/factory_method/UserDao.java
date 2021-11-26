package design.pattern.factory_method;

import java.sql.Connection;

public class UserDao extends BaseDao{

  @Override
  public Connection getConnection() {
    return null;
  }
}
