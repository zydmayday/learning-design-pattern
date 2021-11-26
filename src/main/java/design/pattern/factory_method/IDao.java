package design.pattern.factory_method;

import java.sql.Connection;

public interface IDao {
  Connection getConnection();
}
