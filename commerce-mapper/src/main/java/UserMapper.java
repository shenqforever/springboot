import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/***
 *@author sq
 *@date2018/11/159:58
 */
@Mapper
public interface UserMapper {
    @Select("SELECT *FROM users WHERE name=#{name} AND passwrod")
    User login(User user);
}
