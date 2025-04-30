FROM eclipse-temurin:23-jdk

LABEL student.id="26499"

WORKDIR /app

COPY out/production/assignment_one/ ./

COPY start.sh .

RUN chmod +x start.sh

CMD ["/bin/bash", "start.sh"]
