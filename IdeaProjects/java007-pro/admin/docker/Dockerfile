FROM java:8
VOLUME /tmp
WORKDIR /coldest
ENV LANG C.UTF-8
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone
ADD admin.jar admin.jar
EXPOSE 7001
RUN bash -c 'touch /coldest/admin.jar'
ENTRYPOINT ["java", "-jar", "/coldest/admin.jar"]
