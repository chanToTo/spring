### 一、spring概述

1.spring的优良特性

> - 非侵入式：基于spring开发的应用中的对象可以不依赖于spring的api
> - 依赖注入：DI-Dependency injection，反转控制（IOC）是经典的实现
> - 面向切面编程：Aspect Oriented Programming —— AOP
> - 容器：spring是一个容器，因为他包含并且管理应用对象的生命周期
> - 组件化：spring实现了使用简单的组件配置组合成一个复杂的应用，在spring中可以使用xml和java注解组合这些对象
> - 一站式：在IOC和AOP的基础上可以整合各种企业应用的开源框架和优秀的第三方类库（实际spring自身也提供了表述层的springmvc和持久层的spring jdbc）

2.spring模块

![image](assets/spring模块.jpg)

3.IOC和DI

IOC（Inversion Of Control）反转控制

    原先由开发人员管理的对象，都将统一交由spring容器同一管理

DI(Dependency Injection)依赖注入：

    IOC的另一种表达方式，即组件以一些预先定义好的方式接受来自于容器的资源注入，IOC为一种思想，DI为具体的实现方式
    
使用bean工厂管理的对象，使用java的反射原理，反射使用的为对象的无参构造

4.IOC容器在spring中的实现

    spring中由IOC思想，IOC思想必须基于IOC容器来完成，而IOC容器在最底层实质上就是一个对象工厂。
> 在通过IOC容器读取bean实例之前，需要先将IOC容器本身实例化
> spring提供了IOC容器的两种实现方式：
    
    ① BeanFactory：IOC的基本是实现，是spring内部的基础设施，是面向spring本身的，不是提供给开发人员使用的
    ② ApplicationContext：BeanFatory的子接口，提供更多高级特性，面向spring的使用者，几乎所有场合都使用ApplicationContext而不是底层的BeanFactory