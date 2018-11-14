package model;

import lombok.Data;

/***
 *@author sq
 *@date2018/11/1316:08
 */
@Data
public class ResultModel<T> {
    private int cmd;
    private int code;
    private String msg;
    private T data;
}
