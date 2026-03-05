package org.example.springboothello.controller;

import org.example.springboothello.vo.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello 接口控制器
 * 处理 /api/hello 的 GET 请求
 */
@RestController
@RequestMapping("/api") // 接口根路径
public class HelloController {

    /**
     * Hello 接口实现
     * 路径：GET /api/hello
     * 无参数，返回统一格式的欢迎信息
     */
    @GetMapping("/hello")
    public ResultVO<String> hello() {
        // 调用统一返回类的成功方法，传入欢迎语
        return ResultVO.success("Hello Spring Boot");
    }
}