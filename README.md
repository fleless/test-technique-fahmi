# Test Technique myCANAL Android

Ce test se déroulera en 2 parties:
1- Afficher la page détail d'un programme
2- Faire des retours sur le code


Prenez le temps que vous souhaitez pour réaliser ce test technique et n'hésitez pas à nous contacter pour toute question.

En résultat il faudra partager les sources de l'application via un projet Git

Lors de la review je porterai attention à:
- l'utilisation de git
- le respect de l'architecture
- l'implémentation des fonctionnalités
- Si vous avez envie d'aller plus loin faites vous plaisir dans des commits dédiés

Let's go! :)

## 0 - Présentation de l'application

### Fonctionnellement
- Elle affiche au démarrage une liste de programme (émissions de télé et films)

### Techniquement
- Elle a été développée en architecture MVVM en suivant les principes de clean architecture
- La première page répond à l'api https://static.canal-plus.net/exoplayer/api/programmes.json
- Les apis sont normalement fonctionnelles (contactez nous si ce n'est pas le cas)
- La navigation dans l'application:
   - Elle utilise un nav graph (nav_graph.xml)
   - La gestion du clic sur les programmes n'est pas faite, ce sera a vous de trouver une solution pour ouvrir les différentes pages
   - Pour savoir quelle page ouvrir vous pourrez utiliser l'objet domain NavigateTo inclus dans ProgramUi

## 1 - Afficher une page détail
Lorsqu’on clique sur un programme ayant le champ `NavigateTo` de type `DetailPage` il faudra afficher une nouvelle page qui correspond à la page détail. 

La page détail devra respecter le design défini sur Figma : https://www.figma.com/file/XeCXQ7v9sYlvhWtxgHIkqQ/Android---Test-Technique?node-id=32%3A584

Il faudra donc implémenter :
   - les layouts mobile et tablette (à partir de 960 px)
   - le theme dark / light
   - sur chacun des écrans il faudra afficher:
       - le titre (title)
       - le sous-titre (subtitle)
       - l'image (URLImage)
       - la description (summary)
       - le bouton lecture

## 2 - Retours du test (Vous pouvez etre succint dans les réponses)

- Y a t'il une erreur dans la classe `ProgramView` ? Si oui quel bug fonctionnel cela produit ?
    NaN
- Quel risque courent les mappers OnClickMapper et ProgramMapper ? Comment pourrait-on les améliorer ?
    null safety
- Voyez vous d'autres améliorations que l'on aurait pu faire ?
- Avez vous rencontré des difficultés dans le développement / compréhension du projet ?
    Oui, vu que ça fait 2 ans que je travaille sur Flutter j'ai du prendre beaucoup de temps pour me documenter sur des nouveaux aspects et visions de l'android et surtout du kotlin.
    L'utilisation du nav_graph, mappers (comme dans ce projet)  et contrats (never used them) comme dans ce projet m'ont poussé vers des recherches avancés 
    Le projet est compréhensible j'ai trouvé mon rituel avec les jeux de swotch entre darkMode/LightMode
- Y a t-il des améliorations de votre code qui aurait pu etre faites ?
    tests unitaires
- Combien de temps avez vous mis pour le faire ?
  2 jours de documentation et 1 jour de dev

