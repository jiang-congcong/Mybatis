package Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import entity.User;
import mapper.IUserMapper;


public class Test {
	public static void main(String[] args) throws IOException {
        String resource = "mybatis/mybatis-config.xml";   
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //String statement = "mapper.userMapper.getUserById";    //namespace+id找到映射sql串
        //User user = sqlSession.selectOne(statement, 1);
        //String statement = "mapper.userMapper.getUserByUsername"; 
        //User user =sqlSession.selectOne(statement, "zz");
        /*String statement = "mapper.userMapper.getUser";
        User u=new User();
        u.setUsername("qqq");
        u.setPassword("222");
        User user=sqlSession.selectOne(statement,u);
        */
        /*String statement = "mapper.userMapper.getAllUsers";
        List<User> users=sqlSession.selectList(statement); 
        sqlSession.close();
        for(int i = 0;i<users.size();i++) {
             System.out.println(users.get(i));
        }*/
        /*String statement = "mapper.userMapper.getAllUsernames";
        List<String> names=sqlSession.selectList(statement,3);
        sqlSession.close();
        for(int i = 0;i<names.size();i++) {
             System.out.println(names.get(i));
        }
        */
        /*String statement = "mapper.userMapper.getUser_like";
        List<User> users=sqlSession.selectList(statement,"%z%");
        sqlSession.close();
        for(int i = 0;i<users.size();i++) {
            System.out.println(users.get(i));
        }*/
        /*String statement = "mapper.userMapper.addUser";
        User u=new User();
        u.setUsername("test");
        u.setPassword("test");
        int cnt = sqlSession.insert(statement,u);
        sqlSession.commit();
        sqlSession.close();*/
        /*String statement = "mapper.userMapper.deleteUser";
        int cnt = sqlSession.delete(statement,6);   // 删除id=4的记录
        sqlSession.commit();
        sqlSession.close();*/
        /*String statement = "mapper.userMapper.updateUser";
        User u=new User();
        u.setId(5);   //修改id=39记录
        u.setUsername("test");
        u.setPassword("test");
        int cnt = sqlSession.update(statement,u);
        sqlSession.commit();
        sqlSession.close();*/
        
        IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);
        User users= mapper.getUserById(1); 
        sqlSession.close();
        System.out.println(users);


        
     }


}
