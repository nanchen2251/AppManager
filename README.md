# AppManager
An elegant exit application and restart mechanism management.
#### 号外：听说「nanchen」搞了一个 Android 开发者的免费福利，不行你看：[给 Android 开发者的一点福利：免费模拟面试](http://mp.weixin.qq.com/s/WRdSmGxwDp-CpQcSlmJYlg)

博客讲解：[简书地址](http://www.jianshu.com/p/7742ea195bac)

## 效果图<br>
![](https://github.com/nanchen2251/AppManager/blob/master/GIF.gif)

#### ⊙开源不易，希望给个star或者fork奖励
#### ⊙拥抱开源：https://github.com/nanchen2251/
#### ⊙交流群（拒绝无脑问）：118116509 <a target="_blank" href="//shang.qq.com/wpa/qunwpa?idkey=e6ad4af66393684e1d0c9441403b049d2d5670ec0ce9f72150e694cbb7c16b0a"><img border="0" src="http://pub.idqqimg.com/wpa/images/group.png" alt="Android神技侧漏交流群" title="Android神技侧漏交流群"></a>( 点击图标即可加入 )<br>

## 特点
- 支持优雅的退出应用
- 支持崩溃后重启
- 支持不弹出崩溃对话框

## 使用方法
#### 1、添加依赖<br>
##### Step 1. Add it in your root build.gradle at the end of repositories:
```java
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
##### Step 2. Add the dependency
```java
dependencies {
	        compile 'com.github.nanchen2251:AppManager:1.0.1'
	}
```
#### 2、在需要使用的地方使用(我们建议在 Application 中，并且继承库的 CrashApplication )<br>
```java
// 设置崩溃后自动重启 APP
// 参数依次为 上下文（建议是Application），是否是debug模式，是否崩溃后重启，重启延迟时间，重启的Activity
UncaughtExceptionHandlerImpl.getInstance().init(this, BuildConfig.DEBUG, true, 0, MainActivity.class);
```
#### 3、你也可以禁止重启
```java
// 禁止重启
UncaughtExceptionHandlerImpl.getInstance().init(this,BuildConfig.DEBUG);
```

#### 4、你可以通过查看库代码学习到更多

### 关于作者
    南尘<br>
    四川成都<br>
    [其它开源](https://github.com/nanchen2251/)<br>
    [个人博客](https://nanchen2251.github.io/)<br>
    [简书](http://www.jianshu.com/u/f690947ed5a6)<br>
    [博客园](http://www.cnblogs.com/liushilin/)<br>
    交流群：118116509<br>
    欢迎投稿(关注)我的唯一公众号，公众号搜索 nanchen 或者扫描下方二维码：<br>
    ![](http://images2015.cnblogs.com/blog/845964/201707/845964-20170718083641599-1963842541.jpg)

#### 有码走遍天下 无码寸步难行（引自网络）

> 1024 - 梦想，永不止步!  
爱编程 不爱Bug  
爱加班 不爱黑眼圈  
固执 但不偏执  
疯狂 但不疯癫  
生活里的菜鸟  
工作中的大神  
身怀宝藏，一心憧憬星辰大海  
追求极致，目标始于高山之巅  
一群怀揣好奇，梦想改变世界的孩子  
一群追日逐浪，正在改变世界的极客  
你们用最美的语言，诠释着科技的力量  
你们用极速的创新，引领着时代的变迁  
  
------至所有正在努力奋斗的程序猿们！加油！！  
    
## Licenses
```
 Copyright 2017 nanchen(刘世麟)

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
```
