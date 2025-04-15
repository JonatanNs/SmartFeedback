# Utiliser une image de base avec Java
FROM openjdk:21-jdk-slim

# Dossier de travail dans le conteneur
WORKDIR /app

# Copier le JAR généré (depuis le dossier local "target")
COPY target/SmartFeedback-0.0.1-SNAPSHOT.jar /app/SmartFeedback.jar

# Exposer le port sur lequel Spring Boot écoute
EXPOSE 8080

# Lancer l'application
CMD ["java", "-jar", "SmartFeedback.jar"]
