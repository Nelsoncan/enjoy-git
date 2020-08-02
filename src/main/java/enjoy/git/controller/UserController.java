package enjoy.git.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Nelson
 * @Date 2020/3/26
 * @Version V1.0
 **/

@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/queryUser")
	public String queryUser(){
		System.out.println("测试修改冲突V-1.0");
		System.out.println("测试修改冲突V-1.1");
		System.out.println("测试版本回退V-1.0");
		System.out.println("测试版本回滚V-1.0");
		System.out.println("dev-1.0分支新增功能");
		System.out.println("dev-1.1分支新增功能");
		return "This is branch dev-1.0";
	}
	
}
