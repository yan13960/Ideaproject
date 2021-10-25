FROM java:8
VOLUME /tmp
WORKDIR /coldest
ENV LANG C.UTF-8
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone
ADD eureka.jar eureka.jar
EXPOSE 3000
RUN bash -c 'touch /coldest/eureka.jar'
ENTRYPOINT ["java", "-jar", "/coldest/eureka.jar"]
