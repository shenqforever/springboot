package model;

import com.google.gson.Gson;
import lombok.Data;

/***
 *@author sq
 *@date2018/11/1316:07
 */
@Data
public class JsonResult {

    private ResultModel<Object> model;

    public JsonResult() {
        model = new ResultModel<>();
    }

    public JsonResult setCode(int code) {
        model.setCode(code);
        return this;
    }

    public JsonResult setCmd(int cmd) {
        model.setCmd(cmd);
        return this;
    }

    public JsonResult setMsg(String msg) {
        model.setMsg(msg);
        return this;
    }

    public JsonResult setData(Object data) {
        model.setData(data);
        return this;
    }

    public String toJson() {
        return new Gson().toJson(model);
    }

}
