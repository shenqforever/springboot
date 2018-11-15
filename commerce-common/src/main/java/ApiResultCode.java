import lombok.Data;
import org.omg.CosNaming.NamingContextPackage.NotFound;

/***
 *@author sq
 *@date2018/11/1416:42
 * json  返回码
 */
@Data
public class ApiResultCode<T> {
    private int cmd;
    private int code;
    private String msg;
    private T data;
}
