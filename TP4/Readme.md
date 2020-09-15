Dépôt des TP de POO de Salah Zakaria OUAICHOUCHE Groupe3.
=========================================================
TP4 Manipulations
=================

Les objectifs du tp étaient :
-----------------------------
* d'apprendre à structurer un projet java (package et sous package)
* générer la documentation
* écrire des test
* bien commenter un projet
* faire une fonction main
* générer un .jar (gestion d'archives)
* créé le projet date


Remarque:
---------
Pour la méthode daysLater j'ai considéré que le nom de jour plus tard était au minimum 1

Etapes:
-------
# Pour compiler :

## Ce positionner dans TP4/src
```
javac example/Robot.java -d ../classes
```
```
javac date/DateMain.java -d ../classes
```

# Pour éxecuter les deux mains :

## Ce positionner dans TP4/classes
```
java example.Robot
```
```
java date.DateMain
```

# Pour générer la documentation :

## Ce poisitionner dans TP4/src
```
 javadoc example example.util -d ../docs
```
```
javadoc date date.util -d ../docs
```
# Pour compiler les test:

## Ce positionner à la racine
```
javac -classpath test-1.7.jar test/RobotTest.java
```
```
javac -classpath test-1.7.jar test/DateTest.java
```

# Pour executer les test :

## Ce positionner à la racine
```
java -jar test-1.7.jar RobotTest
```
```
java -jar test-1.7.jar DateTest
```

# Pour créé le jar de date:

## Ce positionner dans le dossier classes
```
jar cvf ../appli.jar date
```
# Pour le visualiser :
```
 jar tvf ../appli.jar date
```
# Pour l'executer :

## Depuis la racine
```
java -classpath appli.jar date.DateMain
```
# Pour en faire un executable :

## Depuis le dossier classes
```
jar cvfm ../appli.jar ../manifest-ex date
```
# Pour l'executer

## Depuis la racine :
```
java -jar appli.jar
```