import lombok.Data;
import org.springframework.stereotype.Component;

/***
 *@author sq
 *@date2018/11/159:30
 */
@Data         //get/set封装
@Component  //使用Spring Boot的依赖注入（IOC） 把普通pojo实例化到spring容器中，相当于配置文件中的
public class User {
    private String name;
    private String pwd;

}
