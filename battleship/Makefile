Game:
	cd src;\
	  javac battleship/*.java -d ../classes

ShipTest:
	javac -classpath test-1.7.jar test/ShipTest.java
	java -jar test-1.7.jar ShipTest

CellTest:
	javac -classpath test-1.7.jar test/CellTest.java
	java -jar test-1.7.jar CellTest

PositionTest:
	javac -classpath test-1.7.jar test/PositionTest.java
	java -jar test-1.7.jar PositionTest

SeaTest:
	javac -classpath test-1.7.jar test/SeaTest.java
	java -jar test-1.7.jar SeaTest

Doc:
	cd src;\
	  javadoc battleship battleship.util -d ../docs

Play:
	cd classes;\
	  java battleship.GameMain

