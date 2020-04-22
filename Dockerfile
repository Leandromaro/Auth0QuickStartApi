FROM gradle:6.3-jdk8

WORKDIR /tmp
ADD . /tmp

RUN gradle build

CMD ["gradle", "clean", "bootRun"]
EXPOSE 3010