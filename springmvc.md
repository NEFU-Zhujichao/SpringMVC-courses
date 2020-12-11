#######新建一个SpringMVC工程##########
1.新建一个web项目
2.导入相关jar包
3.编写web.xml , 注册DispatcherServlet
4.编写springmvc配置文件
5.接下来就是去创建对应的控制类 , controller
6.最后完善前端视图和controller之间的对应
7.测试运行调试.
使用springMVC必须配置的三大件：
处理器映射器、处理器适配器、视图解析器
通常，我们只需要手动配置视图解析器，而处理器映射器和处理器适配器只需要开启注解驱动即可，而省去了大段的xml配置
##########SpringMVC底层原理################
1.用户发出一个请求，DispatcherServlet 去找到HandlerMapping寻找相应的处理器，
2.HandlerAdapter去适配响应的处理类，找到Controller，然后调用具体的Service层方法，
返回ModelAndView-->HandlerAdapter-->DispatcherServlet
3.视图解析-->ViewResolver-->DispatcherServlet-->展示具体的视图