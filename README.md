# GSB
Auteur : Evsen Arsène
## Sommaire :
- Présentation
- Fonctionnalitées
- Prérequis

## Présentation
GSB est une application de gestion d'employés pour l'entreprise fictive "GSB".
Les employés sont appelé "**visiteurs**". Ils ont pour métier d'aller visiter des medecins pour leur proposer de nouveaux **médicaments** à vendre, via des donations d'**échantillons** de médicaments.

## Fonctionnalitées
L'application GSB a plusieurs fonctionnalitées, notamment :
- Créer un nouveau visiteur.
- Consulter la liste des visiteurs existants.
- Gérer le stock d'échantillons de médicaments que possède un visiteur donnée (créer/ajouter).

### Créer un nouveau visiteur :
![Alt Text](https://github.com/ArseneEvsen/GSB-Java-Repository/blob/master/Screenshots%20application/Cr%C3%A9er-un-visiteur.gif?raw=true)

### Consulter la liste des visiteurs existants :
![Alt Text](https://github.com/ArseneEvsen/GSB-Java-Repository/blob/master/Screenshots%20application/Consulter-un-visiteur.gif?raw=true)
### Gérer un stock d'échantillon pour un visiteur donnée
Choisir sa fonctionnalitée "Consulter" ou "Ajouter" :
![alt text](https://github.com/ArseneEvsen/GSB-Java-Repository/blob/master/Screenshots%20application/Stocker_Selectionner.png?raw=true)
#### Consulter :
Voici l'IHM de la consultation, l'utilisateur peut choisir le matricule d'un visiteur dans la barre déroulante de droite :
![alt text](https://github.com/ArseneEvsen/GSB-Java-Repository/blob/master/Screenshots%20application/Stocker_Liste_ChoisirVisiteur.png?raw=true)
Voici un exemple, l'IHM affiche tout les stocks d'échantillons de médicament que possède le visiteur "a131" :
![alt text](https://github.com/ArseneEvsen/GSB-Java-Repository/blob/master/Screenshots%20application/Stocker_Liste_ChoisirVisiteur.png?raw=true)

#### Créer ou ajouter du stock :
La fonctionnalitée permet de créer ou ajouter du stock, à un visiteur donnée.
Après l'ajout de la quantité d'échantillon, l'application est capable de vérifier si le visiteur possède déjà le stock et donc de créer ou ajouter en base de donnée.
![alt text](https://github.com/ArseneEvsen/GSB-Java-Repository/blob/master/Screenshots%20application/Stocker_Ajouter_Exemple.png?raw=true)

## Prérequis
- Eclipse Version: 2022-06 (4.24.0)
- java.runtime.version=17.0.4.1+1
- Les drivers (exemple : mysqlconnector) sont disponnibles dans le repository.
- Base de donnée MySql Version 8
- Logiciel de gestion et d'administration de bases de données MySQL favoris (exemple : MySQL Workbench)

## Comment se procurer l'application + méthode d'installation
- Télécharger le fichier "GSB Java Project".
- Décompresser le fichier téléchargé
- Avec l'IDE Eclipse 2022-06, ouvrir l'application avec le dossier décompressé
- Ouvrir MySql Workbench, déployer la base de donnée
- Avec l'adresse localhost, l'identifiant "admin" et "mot de passe", configurer le fichier ConnexionMySQL téléchargé dans le projet.

## Licence 
MIT License

Copyright (c) [year] [fullname]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
