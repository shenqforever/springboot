/***
 *@author sq
 *@date2018/11/1416:42
 */

import com.google.gson.Gson;

/**
 * API返回值对象
 *
 * @param
 */
public class ApiResult {
    private ApiResultCode<Object> model;

    public ApiResult() {
        model = new ApiResultCode<Object>();
    }

    public ApiResult setCode(int code) {
        model.setCode(code);
        return this;
    }

    public ApiResult setCmd(int cmd) {
        model.setCmd(cmd);
        return this;
    }

    public ApiResult setMsg(String msg) {
        model.setMsg(msg);
        return this;
    }

    public ApiResult setData(Object data) {
        model.setData(data);
        return this;
    }

    public String toJson(){
        return new Gson().toJson(model);
    }
}
