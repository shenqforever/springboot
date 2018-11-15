import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

/***
 *@author sq
 *@date2018/11/1416:23
 */

@RestController
@RequestMapping("/api")
public class UserService {
    @Autowired
    private UserMapper userMapper;

    private User users = null;

    /***
     * 用户登录
     */
    @GetMapping(value = "/user/{name},{pwd}")
    public String login(@PathVariable("name") String name, @PathVariable("pwd") String pwd) {
        users = new User();
        users.setName(name);
        users.setPwd(pwd);
        User login = userMapper.login(users);
        String json = null;
        if (login != null) {
            json = new ApiResult().setCmd(0).setCode(0).setMsg("登录成功").setData(users).toJson();
        } else {
            json = new ApiResult().setCmd(-1).setCode(-1).setMsg("登录失败").setData(users).toJson();
        }
        return json;
    }
}
