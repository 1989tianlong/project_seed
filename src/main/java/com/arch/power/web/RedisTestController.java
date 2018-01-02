package com.arch.power.web;

import com.arch.power.core.Result;
import com.arch.power.core.ResultGenerator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jh on 2018-01-02.
 */
@RestController
@RequestMapping("/redis")
public class RedisTestController {

	@RequestMapping("/first")
	public Result setSessionInRedis(HttpServletRequest request) {
		request.getSession().setAttribute("test", "test");
		return ResultGenerator.genSuccessResult();
	}

	@RequestMapping(value = "/sessions", method = RequestMethod.GET)
	public Result sessions (HttpServletRequest request){
		return ResultGenerator.genSuccessResult(request.getSession().getAttribute("test"));
	}

}
