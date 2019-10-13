package test;


import javax.annotation.Resource;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("applicationContext.xml")
public class UsersMapperTest {
	@Resource
	private UsersMapper usersMapper;
	@Test
	public void testInsUsers() {
		Users users = new Users();
		users.setPassword("123456");
		users.setUsername("123456");
		users.setPhoto("开玩笑.png");
		int index =usersMapper.insUsers(users);
		assertThat(index,is(1));
	}

}
