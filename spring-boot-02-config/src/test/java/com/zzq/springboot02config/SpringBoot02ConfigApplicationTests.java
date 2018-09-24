package com.zzq.springboot02config;

import com.zzq.springboot02config.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

/**
*   @author ZZQ
*   @date 2018/8/28
*   @description
 *   springboot 单元测试；
 *   可以在测试期间很方便的类似编码一样进行自动注入容器功能
*/
@RunWith(SpringRunner.class) // 用springboot来跑， 不是用junit
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {

    @Autowired
    private  Person person ;

    @Autowired
    private ApplicationContext  ioc ;

	@Test
	public void contextLoads() {
        System.out.println(person);
	}


	/**
	*   @author ZZQ
	*   @date 2018/8/28
	*   @description
     *   看下ioc 容器中是否有xml 中配置的service
	*/
	@Test
	public void contextLoad(){
        System.out.println(ioc.containsBean("helloService"));
    }
}
