#!/usr/bin/env bash

# "egd"设置是通过为Tomcat提供一个更快的会话keys熵源来加速Tomcat的
export MAVEN_OPTS="-Xmx1024m -Xss128M -Djava.security.egd=file:/dev/./urandom"

# Spring Boot Maven插件包含一个run目标，它可以用来快速编译和运行应用程序。应用程序以一种暴露的方式运行，由于即时"热"加载，你可以编辑资源
mvn clean -U
mvn spring-boot:run