**前言** 
小程序基于主要基于uniapp SpringBoot node 

## 功能演示
[哔哩哔哩视频演示](https://www.bilibili.com/video/BV19L411y7nZ/?spm_id_from=333.999.0.0)

以下功能介绍 基于第二版本实现 效果图在最后面
## 快速体验
![224472294-45bd1dd2-95ee-4a50-8789-d3005e4fdd3c](https://user-images.githubusercontent.com/87460202/226098142-18dff969-171b-4ea0-a4ce-065af8c34e79.jpg)


##  (1.12丢弃)第一版源代码已被丢弃(故意丢的) 不再进行维护和后续更新 请使用第二版
参照第一版的影响对第二版某些功能进行了删减 至于原因你们应该都懂(完整功能源码可私信找我 至少能让我知道你在sc~)~ 
#### 不过这一版我还是会继续维护的 比如 添加 可控标签功能 可轮换保存 , 另外接入GPTPS也有在搞 会在~~26~~号左右push(功能会额外集成至悬浮球上) 
#### 另外IDEA插件版也有做 可找我拿(不提供源码)
#### 喜欢可以点个star😁支持作者
#### 此版本适用于VPN 如果需要海外服务器部署需要找我拿 懒得上传了,只是参考群友大部分都没得海外服务器的原因所以第二版直接使用代理,这样对某些小白也很方便能玩上 如果用code能力可以自己将代理code注释 即可部署到海外服务器
#### 如果想要参与维护 可以加入协作者
#### 如果newBing服务提示失效 大概是因为微软老是 改数据格式以及屏蔽外部访问, 如果出现这个问题私信我 我会重新push newBing包的代码

##### 额外的信息
ps: 居然在咸鱼能看到第一版源码售卖(main) 我擦 ~

## 主要功能
* **敏感词拦截**
* **历史片段切换**
* **支持Stream流数据控制**
* **Ai回复内容选择性copy**
* **Ai回复内容包含code 可实时高亮渲染以及md渲染**
* **微软必应对话能力**
* **GPT3.5对话能力**
* **GPT绘制图像能力**
* **支持清理页面数据或会话数据**
* **输入console可打开数据面板**
* **接入微信客服(可定义为自己)**
* **移除key捐献功能**
* **移除了003模型支持**
* **新增Key池 可设置单个或多个Key**
* **支持第三方Key 可在yml中切换或控制面板中选择使用哪种加载方式**
* **长按悬浮球3秒打开支持面板**
* **引入NewBing对话能力**
* **单击悬浮球可轮换功能**
* **支持黑夜模式**
* **支持小程序分享功能**
* **新增一些过程动画**
* ps: 输入框最左为清理会话 中间为 设置面板 最右边表示清理当前页面所有数据(包括会话)

### 支持的平台

* [**ios**](https://github.com/tensorflow/tensorflow/tree/master/tensorflow/tools/tf_sig_build_dockerfiles):
  可正常编译至ios平台
* [**android**](tensorflow_runtime_dockerfiles):
  可正常编译至android平台
* [**微信小程序**](manylinux2014_docker_images):
  可正常编译至微信小程序平台 (部分功能不支持 详细请查看控制面板)
* [**字节小程序**](https://github.com/uvarc/rivanna-docker):
  可正常编译至字节小程序平台
* [**支付宝小程序**](devinfra_windows_rbe):
  可正常编译至支付宝小程序平台 (部分功能不支持 详细请查看控制面板)

### 项目环境(必需)

* [**JDK>=17**](golang_install_guide)
* [**CentOS>=8**](golang_install_guide)
* [**NodeJS>=18**](golang_install_guide)
* [**海外服务器**](golang_install_guide)
* [**国内服务器(小程序平台接入需备案)**](golang_install_guide)
* [**海外服务器 nginx反向代理自己接入一下**](golang_install_guide)
* [**如果没有海外服务器则可在国内服务器中使用VPN(Clash)**](golang_install_guide)

### 部署
教程已砍!!!!! 最近发现人拿去 卖 挂咸鱼什么的  部署请看下面

<code >
npm install
</code>

<code>
npm run start
</code>
### 有问题可以找我 WX: SeatimeIsland
### 交流群
![758a0f1efd74702df0ed7f2473b6a69](https://user-images.githubusercontent.com/87460202/226114752-cb316297-cf97-4bc3-bdc1-2f0436d52303.jpg)


