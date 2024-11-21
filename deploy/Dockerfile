# 该镜像需要依赖的基础镜像, 需要指定支持字体的java8
FROM bladex/alpine-java:8_server-jre_cn_unlimited

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone

# 将当前目录下的jar包复制到docker容器的/目录下
ADD /boot/sofa-smy.jar /sofa-smy.jar
# 运行过程中创建一个webapp-exec.jar文件
# RUN bash -c 'touch /webapp-exec.jar'
# 声明服务运行在8080端口
EXPOSE 8080 28888
# 指定docker容器启动时运行jar包
ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=28888","-jar","/sofa-smy.jar", "--spring.profiles.active=k8s"]
# 指定维护者的名字
MAINTAINER luman yeyinghaog@gmail.com
