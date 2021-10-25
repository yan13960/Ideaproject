FROM java:8
VOLUME /tmp
WORKDIR /coldest
ENV LANG C.UTF-8
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone
ADD gateway.jar gateway.jar
EXPOSE 80
RUN bash -c 'touch /coldest/gateway.jar'
ENTRYPOINT ["java", "-jar", "/coldest/gateway.jar"]
