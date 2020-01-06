//package com.sakary.performance.handlers;
//
//import com.google.gson.JsonObject;
//import org.apache.ibatis.type.BaseTypeHandler;
//import org.apache.ibatis.type.JdbcType;
//import org.apache.ibatis.type.MappedJdbcTypes;
//import org.apache.ibatis.type.MappedTypes;
//
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//@MappedTypes(JsonObject.class)
//@MappedJdbcTypes(JdbcType.VARCHAR)
//public class JsonHandler extends BaseTypeHandler<JsonObject> {
//
//  @Override
//  public void setNonNullParameter(PreparedStatement ps, int i, JsonObject parameter, JdbcType jdbcType) throws SQLException {
//    ps.setString(i,String.valueOf(parameter.toString()));
//  }
//}
