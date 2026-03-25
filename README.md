# VHK-Game-Companion
# VHK游戏陪玩小程序

## 项目简介

VHK游戏陪玩小程序是一个面向全平台游戏玩家的专业陪玩服务平台，提供高质量的游戏陪玩服务。平台连接游戏玩家与专业陪玩师，支持多种热门游戏，提供便捷的订单管理、即时通讯、会员体系等功能。

**团队信息**
- 团队名称：VKHbug团队
- 官方链接：https://vkhbug-team.vercel.app

## 技术栈

### 后端服务
- **运行环境**: Java 11
- **框架**: Spring Boot 2.7.18
- **数据库**: MongoDB 6.0+
- **缓存**: Redis 7.0+
- **认证**: JWT (JSON Web Token)
- **API文档**: SpringDoc OpenAPI 3 (Swagger)
- **构建工具**: Maven 3.9.x

### 前端管理后台
- **运行环境**: Node.js v24.14.0
- **包管理器**: npm 11.9.0
- **框架**: Vue 3.4+
- **构建工具**: Vite 5.0+
- **UI框架**: Element Plus 2.6+
- **状态管理**: Pinia 2.1+

### 微信小程序
- **开发工具**: 微信开发者工具
- **SDK版本**: 基础库 3.3.4
- **开发语言**: JavaScript (ES6+)
- **样式**: WXSS

## 项目结构

```
VHK/
├── vhk-backend/           # 后端服务
│   ├── src/               # 源代码
│   ├── pom.xml            # Maven配置
│   └── README.md          # 后端文档
├── vhk-admin/             # 管理后台
│   ├── src/               # 源代码
│   ├── package.json       # 依赖配置
│   └── README.md          # 管理后台文档
├── vhk-miniprogram/       # 微信小程序
│   ├── pages/             # 页面
│   ├── components/        # 组件
│   ├── utils/             # 工具类
│   └── README.md          # 小程序文档
└── README.md              # 项目总文档
```

## 快速开始

### 环境准备

#### 1. 安装Java 11
```bash
# 下载并安装JDK 11
# 配置JAVA_HOME环境变量
java -version
```

#### 2. 安装Maven 3.9.x
```bash
# 下载并安装Maven
# 配置M2_HOME环境变量
mvn -version
```

#### 3. 安装Node.js v24.14.0
```bash
# 下载并安装Node.js
node -v  # v24.14.0
npm -v   # 11.9.0

# 切换npm镜像源为国内镜像
npm config set registry https://registry.npmmirror.com
```

#### 4. 安装MongoDB
```bash
# Windows: 下载安装包安装
# 或使用Docker
docker run -d --name mongodb -p 27017:27017 mongo:6.0
```

#### 5. 安装Redis
```bash
# Windows: 下载安装包安装
# 或使用Docker
docker run -d --name redis -p 6379:6379 redis:7.0
```

#### 6. 安装微信开发者工具
从微信官网下载并安装微信开发者工具

### 启动服务

#### 1. 启动后端服务
```bash
cd vhk-backend
mvn clean install
mvn spring-boot:run
```

#### 2. 启动管理后台
```bash
cd vhk-admin
npm install
npm run dev
```

#### 3. 启动小程序
1. 使用微信开发者工具打开 `vhk-miniprogram` 目录
2. 配置小程序AppID
3. 点击编译预览

## 环境变量清单

### 后端服务环境变量

| 变量名 | 说明 | 默认值 |
|--------|------|--------|
| `SERVER_PORT` | 服务端口 | 8080 |
| `SPRING_DATA_MONGODB_URI` | MongoDB连接地址 | mongodb://localhost:27017/vhk_game |
| `SPRING_REDIS_HOST` | Redis主机地址 | localhost |
| `SPRING_REDIS_PORT` | Redis端口 | 6379 |
| `SPRING_REDIS_PASSWORD` | Redis密码 | (空) |
| `JWT_SECRET` | JWT签名密钥 | vhk-gamecompanion-jwt-secret-key-2024... |
| `JWT_EXPIRATION` | JWT过期时间(毫秒) | 604800000 (7天) |
| `WECHAT_MINIPROGRAM_APPID` | 微信小程序AppID | your-wechat-appid |
| `WECHAT_MINIPROGRAM_SECRET` | 微信小程序Secret | your-wechat-secret |
| `WECHAT_PAY_MCH_ID` | 微信支付商户号 | your-mch-id |
| `WECHAT_PAY_API_KEY` | 微信支付API密钥 | your-api-key |
| `WECHAT_PAY_API_V3_KEY` | 微信支付APIv3密钥 | your-api-v3-key |
| `WECHAT_PAY_NOTIFY_URL` | 支付回调地址 | https://your-domain.com/api/pay/callback |

### 管理后台环境变量

| 变量名 | 说明 | 默认值 |
|--------|------|--------|
| `VITE_APP_TITLE` | 应用标题 | VHK游戏陪玩管理后台 |
| `VITE_API_BASE_URL` | API基础路径 | http://localhost:8080/api |
| `VITE_TOKEN_KEY` | Token存储键名 | vhk_admin_token |
| `VITE_UPLOAD_SIZE` | 上传文件大小限制(MB) | 10 |

### 小程序配置

| 配置项 | 说明 | 默认值 |
|--------|------|--------|
| `api.devBaseUrl` | 开发环境API地址 | http://localhost:8080/api |
| `api.prodBaseUrl` | 生产环境API地址 | https://api.vhk-game.com/api |
| `websocket.devUrl` | 开发环境WebSocket地址 | ws://localhost:8080/ws |
| `websocket.prodUrl` | 生产环境WebSocket地址 | wss://api.vhk-game.com/ws |

## 端口映射

| 服务 | 端口 | 说明 |
|------|------|------|
| 后端服务 | 8080 | Spring Boot应用端口，API路径前缀 /api |
| 管理后台 | 3000 | Vue开发服务器 |
| MongoDB | 27017 | MongoDB数据库端口 |
| Redis | 6379 | Redis缓存端口 |

## 默认账号

### 数据库账号

#### MongoDB
- 数据库名：`vhk_game`
- 开发环境无密码

#### Redis
- 开发环境无密码

### 管理后台账号

| 系统 | 账号 | 密码 | 说明 |
|------|------|------|------|
| 管理后台 | admin | admin123 | 超级管理员（首次启动后创建） |

### 微信小程序
- 通过微信授权登录，首次登录自动注册

## 数据库初始化

### MongoDB初始化

```bash
# 连接MongoDB
mongosh

# 执行初始化脚本
use vhk_game
load('/path/to/vhk-backend/src/main/resources/db/init-collections.js')
```

初始化脚本将创建以下集合：
- `users` - 用户集合
- `games` - 游戏集合
- `companions` - 陪玩师集合
- `orders` - 订单集合
- `chat_sessions` - 聊天会话集合
- `chat_messages` - 聊天消息集合
- `memberships` - 会员集合
- `member_privileges` - 会员特权集合
- `withdrawals` - 提现集合
- `balance_records` - 余额记录集合
- `sensitive_words` - 敏感词集合
- `configs` - 系统配置集合

## API接口文档

### 访问Swagger文档

启动后端服务后，访问以下地址查看API文档：

- Swagger UI: http://localhost:8080/api/swagger-ui.html
- API Docs: http://localhost:8080/api/v3/api-docs

### 主要接口模块

| 模块 | 路径前缀 | 说明 |
|------|----------|------|
| 认证管理 | `/api/auth` | 登录、注册、Token刷新 |
| 用户管理 | `/api/user` | 用户信息、头像更新 |
| 游戏管理 | `/api/games` | 游戏列表、详情 |
| 陪玩师管理 | `/api/companions` | 陪玩师列表、详情、申请 |
| 订单管理 | `/api/orders` | 订单创建、支付、状态管理 |
| 会员管理 | `/api/membership` | 会员购买、续费、特权 |
| 余额管理 | `/api/balance` | 余额查询、记录 |
| 支付管理 | `/api/pay` | 支付回调、状态查询 |
| 聊天管理 | `/api/chat` | 会话列表、消息发送 |

### 认证方式

所有需要认证的接口，请在请求头中携带JWT Token：

```
Authorization: Bearer <your_jwt_token>
```

## 常见问题排查

### 1. MongoDB连接失败

**症状**: 启动时报错 `Connection refused`

**排查步骤**:
1. 检查MongoDB服务是否启动
   ```bash
   # Windows
   net start MongoDB
   
   # 或使用Docker
   docker ps | grep mongo
   ```
2. 检查端口是否被占用
   ```bash
   netstat -ano | findstr 27017
   ```
3. 检查配置文件中的连接地址是否正确
4. 检查防火墙是否放行27017端口

### 2. Redis连接失败

**症状**: 启动时报错 `Unable to connect to Redis`

**排查步骤**:
1. 检查Redis服务是否启动
   ```bash
   redis-cli ping
   # 应返回 PONG
   ```
2. 检查端口是否被占用
   ```bash
   netstat -ano | findstr 6379
   ```
3. 如设置了密码，检查配置文件中的密码是否正确
4. 检查Redis配置文件中 `bind` 是否正确

### 3. 微信登录失败

**症状**: 小程序登录接口返回错误

**排查步骤**:
1. 检查微信小程序AppID和Secret是否正确配置
2. 确认小程序是否已发布或设置为体验版
3. 检查微信开发者工具中是否勾选"不校验合法域名"
4. 查看后端日志获取详细错误信息
5. 确认微信开放平台配置的服务器域名白名单

### 4. 支付回调失败

**症状**: 支付成功但订单状态未更新

**排查步骤**:
1. 检查支付回调地址是否可外网访问
2. 确认微信支付商户平台配置的回调地址正确
3. 检查后端日志是否有回调记录
4. 验证支付签名是否正确
5. 确认服务器防火墙放行HTTPS(443)端口

### 5. 端口被占用

**症状**: 启动时报错 `Port xxx already in use`

**排查步骤**:
1. 查找占用端口的进程
   ```bash
   netstat -ano | findstr <端口号>
   ```
2. 结束占用进程
   ```bash
   taskkill /F /PID <进程ID>
   ```
3. 或修改配置文件中的端口号

### 6. Maven依赖下载失败

**症状**: `Could not resolve dependencies`

**排查步骤**:
1. 检查网络连接
2. 配置Maven阿里云镜像
   ```xml
   <mirror>
     <id>aliyun</id>
     <mirrorOf>central</mirrorOf>
     <name>阿里云公共仓库</name>
     <url>https://maven.aliyun.com/repository/public</url>
   </mirror>
   ```
3. 清理Maven本地仓库缓存
   ```bash
   mvn clean
   ```

### 7. npm依赖安装失败

**症状**: `npm install` 报错

**排查步骤**:
1. 清除npm缓存
   ```bash
   npm cache clean --force
   ```
2. 切换国内镜像源
   ```bash
   npm config set registry https://registry.npmmirror.com
   ```
3. 删除 `node_modules` 目录和 `package-lock.json` 后重新安装

### 8. 小程序真机调试失败

**症状**: 真机预览白屏或网络请求失败

**排查步骤**:
1. 检查服务器域名是否已配置到小程序后台
2. 确认使用HTTPS协议（生产环境）
3. 检查证书是否有效
4. 开发阶段可在开发者工具中勾选"不校验合法域名"

## 编码规范

### 通用规范
1. 所有源代码、配置、脚本、SQL及文档中的注释必须使用中文
2. 所有提交信息、日志输出必须使用中文
3. 禁止使用模拟数据、测试数据、硬编码数据
4. 所有数据必须通过合法的API接口、数据库查询或用户输入获取

### 后端规范
1. 遵循阿里巴巴Java开发规范
2. 使用Lombok简化代码
3. 统一使用UTF-8编码
4. Controller层只做参数校验和结果封装
5. Service层处理业务逻辑
6. Repository层处理数据访问

### 前端规范
1. 使用Composition API
2. 组件命名采用PascalCase
3. 文件命名采用kebab-case
4. 遵循Vue 3最佳实践

### 小程序规范
1. 使用ES6+语法
2. 遵循微信小程序开发规范
3. 组件化开发，提高代码复用

## 设计规范

### 色彩系统
- **背景色**: 主#FFFFFF，辅#F5F5F7
- **文字色**: 主要#1D1D1F，次要#86868B
- **品牌色**: #007AFF
- **功能色**: 成功#34C759，警告#FF9500，危险#FF3B30

### 字体系统
- **字体族**: -apple-system, "PingFang SC", sans-serif
- **字重**: 正文400，按钮500，标题600
- **行高**: 标题1.2，正文1.5

### 布局系统
- **网格基准**: 8px
- **边距**: 移动16px，桌面24px
- **内容宽度**: 1200px

### 圆角与阴影
- **圆角**: 按钮8px，卡片16px
- **阴影**: 悬浮0 2px 8px rgba(0,0,0,0.04)，弹窗0 10px 30px rgba(0,0,0,0.08)

## 部署说明

### 后端部署

```bash
# 打包应用
cd vhk-backend
mvn clean package -DskipTests

# 运行JAR包
java -jar target/gamecompanion-1.0.0.jar

# 或使用Docker
docker build -t vhk-gamecompanion:1.0.0 .
docker run -d -p 8080:8080 vhk-gamecompanion:1.0.0
```

### 管理后台部署

```bash
# 构建
cd vhk-admin
npm run build

# 部署到静态服务器
# 将dist目录内容上传到服务器
```

### 小程序发布

1. 在微信开发者工具中上传代码
2. 在微信公众平台提交审核
3. 审核通过后发布

## 版本历史

- v1.0.0 (2024-01-01): 初始版本发布

## 联系方式

- 团队：VKHbug团队
- 官网：https://vkhbug-team.vercel.app
- 邮箱：douc59442@gmail.com

## 商业合作

> 🚀 **专业定制与部署服务**
> 
> 如果您希望使用本项目但缺乏部署经验，或需要根据业务需求进行定制开发，我们提供专业的技术支持服务：
> - 项目部署与服务器配置
> - 功能定制与二次开发
> - 技术咨询与架构设计
> - 长期运维支持
> 
> 📧 欢迎通过邮箱 **douc59442@gmail.com** 联系我们，获取详细报价与技术方案。

## 许可证

Apache License 2.0
