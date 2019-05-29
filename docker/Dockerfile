FROM openjdk:11-slim

ARG WORKDIR
ENV WORKDIR=${WORKDIR:-"/opt/fwsas"}
ENV PATH="${WORKDIR}:${PATH}"

COPY target/circle_ci_test.jar ${WORKDIR}/
COPY runExe.sh /
RUN set -eux; chmod +x /runExe.sh

VOLUME ["${WORKDIR}/logs"]
EXPOSE 8080 10001

ENTRYPOINT ["tini", "--"]
CMD ["/runExe.sh"]
