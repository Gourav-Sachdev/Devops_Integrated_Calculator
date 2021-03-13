FROM openjdk:8
COPY ./target/DevOps_Integrated_Calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-cp","DevOps_Integrated_Calculator-1.0-SNAPSHOT.jar","Main"]