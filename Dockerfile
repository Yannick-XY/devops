FROM scireum/sirius-runtime-jdk18:58
ADD --chown=sirius:sirius target/release-dir /home/sirius
WORKDIR /home/sirius
EXPOSE 9000