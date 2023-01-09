# Projet

Modèle de projet gradle pour couverture de tests.

Les commandes gradle les plus utiles :

- `gradle test` pour lancer les tests (rapports dans `build/reports/tests/test`),
- `gradle run` pour lancer le programme,
- `gradle jacocoTestReport` pour lancer la couverture de code via l'outil [Jacoco](https://www.eclemma.org/jacoco/) (rapports dans `build/reports/jacoco/test`).

Le fichier `build.gradle` contient la configuration du projet avec notamment la définition de la classe contenant la méthode `main` à exécuter pour l'application.

Le projet est configuré (via le fichier `.gitlab-ci.yml`) pour produire un jar et lancer les tests sur le serveur à chaque *push*. Si la suite de tests échoue, vous recevrez un mail avec `Failed pipeline` dans l'intitulé de la part d'etulab.


## Membre(s) du projet

- NOM, prénom du premier membre du projet
- NOM, prénom du deuxième membre du projet (optionnel)