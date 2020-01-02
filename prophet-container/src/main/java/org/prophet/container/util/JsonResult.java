package org.prophet.container.util;

public class JsonResult<T> {

  private T data;
  private String code;
  private String msg;

  public T getData() {
    return data;
  }

  public String getCode() {
    return code;
  }

  public String getMsg() {
    return msg;
  }

  public void setData(T data) {
    this.data = data;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public JsonResult() {
    this.code = "0";
    this.msg = "success";
  }

  /**
   *
   * @param code code number
   * @param msg message
   */
  public JsonResult(String code, String msg) {
    this.code = code;
    this.msg = msg;
  }

  /**
   *
   * @param data response data
   */
  public JsonResult(T data) {
    this.data = data;
    this.code = "0";
    this.msg = "success";
  }

  /**
   *
   * @param data response data
   * @param msg message
   */
  public JsonResult(T data, String msg) {
    this.data = data;
    this.code = "0";
    this.msg = msg;
  }
}
