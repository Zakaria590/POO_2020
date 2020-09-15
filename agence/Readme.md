Dépôt des TP de POO de Salah Zakaria OUAICHOUCHE Groupe3.
=========================================================
TP agence de location de voitures
==================================
Les objectifs du tp étaient :
-----------------------------
## Les objectifs du tp étaient :
* Créer une agence de vente de véhicules
* Utiliser les héritages

## Remarque:
Un bon TP pour manipuler l'heritage.

## Etapes:

# Pour compiler manuellement :

## Ce positionner dans agence/src

```
javac rental/AndFilter.java -d ../Classes
```
```
javac rental/BrandFilter.java -d ../Classes
``` 
```
javac rental/Client.java -d ../Classes
```
```
javac rental/MaxPriceFilter.java -d ../Classes
```
```
javac rental/RentalAgency.java -d ../Classes
```
```
javac rental/VehicleFilter.java -d ../Classes
```
```
javac rental/UnknownVehicleException.java -d ../Classes
```
```
javac rental/Main.java -d ../Classes
```
## Ce positionner dans agence/classes
```
java rental.Main
```
# Pour compiler les test:

## Ce positionner à la racine
```
javac -classpath test-1.7.jar test/rental/RentalAgencyTest.java
```
```
javac -classpath test-1.7.jar test/rental/BrandFilterTest.java
```
```
javac -classpath test-1.7.jar test/rental/VehicleTest.java
```
```
javac -classpath test-1.7.jar test/rental/MaxPriceFilterTest.java
```
```
javac -classpath test-1.7.jar test/rental/ClientTest.java
```
# Pour créé le jar executable:
## Depuis le dossier classes
```
jar cvfm ../appli.jar ../manifest-ex rental
```

# Pour l'executer
## Depuis la racine :
```
java -jar appli.jar
```
# Pour utiliser le makefile :

* Se placer à la racine (agence)

## Pour compiler :
* make Game


## Pour les differents test :

* make BrandTest
* make ClientTest
* make MaxTest
* make RentalTest
* make VehicleTest


## Pour lancer le main :
* make Play

## Pour générer la documentation :

* make Doc





