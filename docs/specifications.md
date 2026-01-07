
# II. Spécifications fonctionnelles

En réponse aux besoins exprimés par le client, l’application de vente de formations comporte les fonctionnalités suivantes :

----------
## 1. Pour tous les utilisateurs (Guest & User)
**UC1 – Afficher toutes les formations**
-   Affiche la liste complète des formations disponibles, avec : nom, description, durée (jours), type (présentiel / distanciel), prix.
-   Accessibles par : Guest, User

**UC2 – Rechercher formations par mot-clé**
-   Permet de filtrer la liste des formations selon un mot-clé présent dans le nom ou la description.
-   Inclus dans UC1.

**UC3 – Filtrer formations Présentiel / Distanciel**
-   Permet de filtrer les formations selon le type (présentiel ou distanciel).
-   Inclus dans UC1.

----------
## 2. Pour les utilisateurs non connectés (Guest)
**UC4 – S’inscrire / se connecter**
-   Permet de créer un compte utilisateur (username + mot de passe) ou de se connecter.
-   Après connexion, l’utilisateur devient User.

----------
## 3. Pour les utilisateurs connectés (User)
**UC5 – Ajouter formation au panier**
-   Permet de sélectionner une ou plusieurs formations et de les ajouter au panier. 

**UC6 – Retirer formation du panier**
-   Permet de retirer une formation précédemment ajoutée.
-   Inclus dans UC5.

**UC7 – Passer commande**
-   Permet de finaliser l’achat des formations présentes dans le panier.
-   Déclenche UC8 pour associer la commande à un client.

**UC8 – Associer commande à un client**
-   Vérifie si le client existe (par email) :
    -   Si oui, utilise le client existant.
    -   Si non, crée un nouveau client en demandant : nom, prénom, adresse, téléphone.
-   Chaque commande est associée à au moins un client et peut contenir une ou plusieurs formations.

**UC9 – Consulter la liste de clients**
-   Permet à un utilisateur de visualiser tous les clients qu’il a enregistrés (clients pour lesquels il a passé des commandes).

----------

## Règles et contraintes métier
1.  Un utilisateur (User) peut passer plusieurs commandes pour différents clients.
2.  Un client peut être global : récupéré si email existe, sinon créé automatiquement.
3.  Une formation ne peut être ajoutée qu’une seule fois au panier par User.
4.  La commande ne peut être finalisée que si le panier contient au moins une formation.
5.  L’application est initialement en mode console mais doit être prête pour intégration web multi-couche.