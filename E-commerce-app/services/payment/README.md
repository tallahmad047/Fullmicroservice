# Microservice Payment

Le microservice **Payment** est responsable de la gestion des paiements dans le système. Il s'intègre avec d'autres microservices comme **Order** et **Product** pour traiter les paiements, vérifier la validité des commandes, et émettre des notifications après la réussite ou l'échec d'un paiement.

## Fonctionnalités principales

- Gestion des paiements pour les commandes clients.
- Communication avec le microservice **Order** pour récupérer les informations sur la commande.
- Communication avec le microservice **Product** pour vérifier la disponibilité des produits.
- Gestion des notifications de succès ou d'échec de paiement via **Kafka**.

## Structure du Projet

Le projet est structuré de manière modulaire avec des packages distincts pour chaque composant :

- **exception** : Contient les exceptions spécifiques au microservice comme `PaymentPurchaseException`.
- **handler** : Gère les exceptions globales via `GlobalExceptionHandler` et la réponse d'erreur est standardisée dans `ErrorResponse`.
- **mapper** : Utilisé pour convertir des objets de requêtes ou réponses avec `PaymentMapper`.
- **product1** : Contient les entités de base comme `Client` et `Payment`.
- **repository** : Interface `PaymentRepository` pour interagir avec la base de données.
- **request** : Contient les objets de requête comme `PaymentRequest` et `PaymentPurchaseRequest`.
- **response** : Définit les objets de réponse comme `ProductResponse` et `PaymentPurchaseResponse`.
- **service** : Contient la logique métier dans `PaymentService`.
- **web** : Contient le point d'entrée principal de l'application avec `PaymentApplication`.

## Architecture

Le microservice **Payment** est construit en utilisant l'architecture **Spring Boot** avec les composants suivants :

- **Spring Cloud OpenFeign** pour communiquer avec les microservices **Order** et **Product**.
- **Kafka** pour envoyer des notifications sur les événements de paiement (succès/échec).
- **PostgreSQL** pour la persistance des transactions de paiement.
- **Spring Boot Starter Web** pour l'exposition des endpoints RESTful.
- **Spring Boot Starter Data JPA** pour la gestion des données.

## Configuration du projet

### Dépendances Maven

(voir le fichier pom.xml)
