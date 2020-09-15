Dépôt des TP de POO de Salah Zakaria OUAICHOUCHE Groupe3.
=========================================================
TP Pierre-Feuille-Ciseaux
=========================
Les objectifs du tp étaient :
-----------------------------
## Les objectifs du tp étaient :
* Bien suivre les methodes de la creation d'un projet java (Doc/test/code)
* Créer un jeu pierre,feuille,ciseaux
* Utiliser une interface
* Utiliser la console de manière interractive

## Remarque:

* J'ai fait le choix d'indiquer directement le nombre de tours en input pour éviter des erreurs
* J'ai fait le choix d'indiquer le joueur1 et joueur2 directement en paramètre de classe Game pour éviter des erreurs ( lancer une partie sans joueurs)
* J'ai fait le choix de ne pas mettre de return pour la methode Play car cela n'était pas nécessaire
* Les stratégies OnlyRock , OnlyPaper et OnlyScissors n'étaient pas nécessaires grace à la stratégie Sequence ( mettre juste un élement aurait le même effet)
* je voulais bien utiliser le @Before mais dommage j'avais pas du temps 

## Etapes:

# Pour compiler macuellement :

## Ce positionner dans battleship/src

```
javac pfc/Choice.java -d ../Classes
```
```
javac pfc/Player.java -d ../Classes
```
```
javac pfc/Game.java -d ../Classes
```
```
javac pfc/Main.java -d ../Classes
```
Pour éxecuter les  mains :

## Ce positionner dans battleship/classes
```
java pfc.Main
```
# Pour compiler les test:

## Ce positionner à la racine

```
javac -classpath test-1.7.jar test/StrategyTest.java
```
```
javac -classpath test-1.7.jar test/PlayerTest.java
```
```
javac -classpath test-1.7.jar test/GameTest.java
```
# Pour lancer une partie de jeux :
* Se placer dans classes 
```
java pfc.Main
```

# Pour créé le jar executable:
## Depuis le dossier classes
```
jar cvfm ../appli.jar ../manifest-ex pfc
```

# Pour l'executer
## Depuis la racine :
```
java -jar appli.jar
```
# Pour utiliser le makefile :
* Se placer à la racine (pfc)

## Pour compiler :
* make Game

## Pour les differents test :

* make StrategyTest
* make PlayerTest
* make GameTest


## Pour lancer le projet ( jouer ) :
* make Play

## Pour générer la documentation :

* make Doc

## Pour créer le jar

* make Jar

## Pour l'executer

* make Exe

## Pour créer une nouvelle stratégie

* Il est nécessaire de l'inclure au pack pfc.streategy et d'importer le pack pfc.strategy.* et pfc.*
* Il faut que la classe soit public et implémente Strategy
* Il faut créer une méthode public takeChoice() qui renvoie un objet de type Choice 
