# SmartFeedback

SmartFeedback IA+ est une application permettant aux utilisateurs de laisser des avis sur des produits ou services. Une intelligence artificielle (IA) analyse l'avis pour en extraire le produit/service mentionné et génère un résumé général du sentiment exprimé dans l'avis.

## Fonctionnalités principales
- **Écriture d'avis** : Les utilisateurs peuvent rédiger des avis sur des produits ou services.
- **Analyse par IA** : L'IA extrait les entités (produits/services) mentionnées dans les avis et analyse le sentiment.
- **Résumé généré** : L'IA génère un résumé général du sentiment (positif, négatif, neutre) de l'avis.
- **Base de données** : Les avis et les produits/services sont stockés dans une base de données PostgreSQL.

## Technologies utilisées
- **Frontend** : Angular
- **Backend** : Spring Boot
- **Base de données** : PostgreSQL
- **IA** : Microservice Python pour l'analyse de texte (utilisation de modèles NLP)
- **Conteneurisation** : Docker

## Outils utilisés
- **IDE pour le Backend** : IntelliJ IDEA Community Edition (pour Spring Boot)
- **IDE pour le Frontend et IA** : VS Code (pour Angular et Python)

## Installation
1. Clonez ce dépôt :
   ```bash
   git clone https://github.com/ton-username/SmartFeedback.git

2. Backend :
Allez dans le répertoire du projet backend (backend/) et exécutez :

    ```bash
    mvn spring-boot:run
   
3. Frontend :
Allez dans le répertoire du projet frontend (frontend/) et exécutez :

    ```bash
    npm install
    npm start
   
4. Base de données :
Configurez votre base de données PostgreSQL.
Assurez-vous que la base de données est en fonctionnement avant de lancer l'application.

Microservice Python (IA) :
Lancez votre microservice Python pour l'analyse de texte.
## License

This project is licensed under the Creative Commons Attribution-NonCommercial 4.0 International License - see the [LICENSE](LICENSE) file for details.

