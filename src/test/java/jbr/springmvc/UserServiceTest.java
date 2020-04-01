package jbr.springmvc;

import jbr.springmvc.service.UserServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;
import jbr.springmvc.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:jbr/config/user-beans.xml" })
public class UserServiceTest {

  @Autowired
  private UserServiceImpl userService;

  @Test
  public void testRegister() {
    User user = new User();
    user.setUsername("");
    user.setPassword("sekar");
    user.setFirstname("Ranjithsa");
    user.setLastname("Sekar");
    user.setAddress("chennai, t.nagar");
    user.setEmail("ranjith@gmail.com");
    user.setPhone(222);

    int result = userService.register(user);
    Assert.assertEquals(1, result);
  }



}
