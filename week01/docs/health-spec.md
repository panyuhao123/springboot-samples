# 系统健康检查接口规格文档

## 1. 核心目标
- 提供一个系统健康检查接口，方便快速确认服务是否正常运行。

## 2. 业务规则
- 接口路径：GET /api/health
- 返回字段：
  - appName：应用名称
  - version：应用版本
  - time：当前服务器时间
  - status：运行状态（UP/DOWN）

## 3. 技术约束
- 使用 Spring Boot 3.x
- 统一返回类型 ResultVO
...