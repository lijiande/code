# code

使用spring-boot、mybatis-plus。     
this project is a practice.

1. 不能够使用`yml`配置文件,比较令人费解。。。     
报错：`no profiles are currently active`
    
    ````
    这个解决了。大概的原因是        
    - 没有将resource的yml文件引入。在pom.xml文件中增加resource,将多个yml文件引入。
    - 主application.yml 的spring.profiles.active诡异地需要@包着...(@﹏@)~ 
    同时，也要在pom.xml中，增加profiles
    
