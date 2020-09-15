Dépôt des TP de POO de Salah Zakaria OUAICHOUCHE Groupe3.
=========================================================
TP Battleship
=============
Les objectifs du tp étaient :
-----------------------------
## Les objectifs du tp étaient :

* Bien suivre les methodes de la creation d'un projet java (Doc/test/code)
* Créer un jeu battleship
* Utiliser un package exterieur
* Utiliser la console de manière interractive

## Remarque:
* tres bon  TP

## Etapes:

# Pour compiler macuellement :

## Ce positionner dans battleship/src

```
javac battleship/Cell.java -d ../Classes
```
```
javac battleship/Ship.java -d ../Classes
```
```
javac battleship/Sea.java -d ../Classes
```
```
javac battleship/Game.java -d ../Classes
```
```
javac battleship/BattleshipMain.java -d ../Classes
```
```
javac battleship/GameMain.java -d ../Classes
```

# Pour éxecuter les  mains :

## Ce positionner dans battleship/classes
```
java battleship.BattleshipMain
```
# Pour compiler les test:

## Ce positionner à la racine
```
javac -classpath test-1.7.jar test/ShipTest.java
```
```
javac -classpath test-1.7.jar test/SeaTest.java
```

```
javac -classpath test-1.7.jar test/PositionTest.java
```
```
javac -classpath test-1.7.jar test/CellTest.java
```

# Pour executer les test :

## Ce positionner à la racine
```
java -jar test-1.7.jar ShipTest
```
```
java -jar test-1.7.jar SeaTest
```
```
java -jar test-1.7.jar PositionTest
```
```
java -jar test-1.7.jar CellTest
```
# Pour lancer une partie de jeux :
* Se placer dans classes 
```
java battleship.GameMain
```

# Pour créé le jar executable:
## Depuis le dossier classes
```
jar cvfm ../appli.jar ../manifest-ex battleship
```

# Pour l'executer
## Depuis la racine :
```
java -jar appli.jar
```

# Pour utiliser le makefile :
* Se placer à la racine (battleship)

## Pour compiler :
* make Game


## Pour les differents test :

* make ShipTest
* make CellTest
* make PositionTest
* make SeaTest


## Pour lancer le projet ( jouer ) :
* make Play

## Pour générer la documentation :
* make Doc