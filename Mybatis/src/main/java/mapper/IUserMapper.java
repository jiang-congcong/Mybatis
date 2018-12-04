package mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;

import entity.User;

public interface IUserMapper {
	
	@Insert("insert into users(username,password) values(#{username},#{password})")
    public int addUser(User user);	
	
    @Delete("delete from users where id=#{id}")
    public int deleteUser(int id);
	
    @Update("update users set username=#{username},password=#{password} where id=#{id}")
    public int updateUser(User user);
	
    @Select("select * from users where id=#{id}")
    public User getUserById(int id);
	
    @Select("select * from users")
    public List<User> getAllUsers();

}
