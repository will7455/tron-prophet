package org.prophet.container.util;

public class JsonResult<T> {

  private T data;
  private int status;
  private String msg;

  public T getData() {
    return data;
  }

  public int getStatus() {
    return status;
  }

  public String getMsg() {
    return msg;
  }

  public void setData(T data) {
    this.data = data;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public JsonResult() {
    this.status = 0;
    this.msg = "success";
  }

  /**
   *
   * @param status code number
   * @param msg message
   */
  public JsonResult(int status, String msg) {
    this.status = status;
    this.msg = msg;
  }

  /**
   *
   * @param data response data
   */
  public JsonResult(T data) {
    this.data = data;
    this.status = 0;
    this.msg = "success";
  }

  /**
   *
   * @param data response data
   * @param msg message
   */
  public JsonResult(T data, String msg) {
    this.data = data;
    this.status = 0;
    this.msg = msg;
  }
}
