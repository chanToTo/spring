### spring错误
1.  Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.orange.spring.Person' available: expected single matching bean but found 2: person,person1
    
    > spring配置文件中，bean工厂管理定义了两个及两个以上相同的对象，获取时使用applicationContext.getBean(Person.class);获取具体类的方式从而引发此错误
   
2. 