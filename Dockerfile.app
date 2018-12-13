FROM gradle

EXPOSE 8080 3000
WORKDIR /app

RUN gradle bootRun

