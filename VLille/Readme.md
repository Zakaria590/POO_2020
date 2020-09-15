Salah Zakaria OUAICHOUCHE Groupe 3
==================================

Les objectifs du tp étaient :
-----------------------------
# premièrement d'apprendre à utiliser java
# deuxièment de créer de 2 objets  Bike et BikeStation ( qui contient Bike)  avec leurs mains et test ( opérationels ) respectifs

Question 4:
----------
# C'est un enum qui définit les differents models de la classe Bike

Question 8.1:
------------
# De mettre le prix en attribut privé static final

# Récupérer le projet par git pull, puis placer vous dans le dossier TP3

# Pour generer et consulter la documentation :
```
javadoc Bike.java -d docs
javadoc BikeStation.java -d docs
javadoc BikeMain.java -d docs
javadoc BikeStationMain.java -d docs
```
# Pour compiler :
```
javac Bike.java
javac BikeStation.java
javac BikeMain.java
javac BikeStationMain.java
```
# Pour compiler  les tests :
```
javac -classpath test-1.7.jar test/BikeTest.java 
javac -classpath test-1.7.jar test/BikeStationTest.java 
```
# Pour executer les tests
```
java -jar test-1.7.jar BikeTest 
```
# Pour éxecuter BikeStation:
```
java BikeStationMain 0 --> bike id: b001, model : CLASSICAL  10
java BikeStationMain 5 --> No bike in this slots
java BikeStationMain a --> Wrong parameter, not int
java BikeStationMain   --> Miss parameter
```