package org.example.springboothello.controller;

import org.example.springboothello.vo.ResultVO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * 系统健康检查接口控制器
 */
@RestController
@RequestMapping("/api")
public class HealthCheckController {

    /**
     * 应用名称（从配置文件读取，无配置时默认值）
     */
    @Value("${spring.application.name:unknown-app}")
    private String appName;

    /**
     * 应用版本（从配置文件读取，无配置时默认值）
     */
    @Value("${app.version:1.0.0}")
    private String version;

    /**
     * 健康检查接口
     * GET /api/health
     */
    @GetMapping("/health")
    public ResultVO<Map<String, Object>> healthCheck() {
        Map<String, Object> healthData = new HashMap<>(4);
        // 应用名称
        healthData.put("appName", appName);
        // 应用版本
        healthData.put("version", version);
        // 服务器当前时间（格式化）
        healthData.put("time", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        // 运行状态（固定UP，如需判断可扩展）
        healthData.put("status", "UP");

        return ResultVO.success(healthData);
    }
}