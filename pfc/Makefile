Game:
	cd src;\
	  javac pfc/Main.java -d ../classes
	cd src;\
	  javac pfc/strategy/OnlyPaper.java -d ../classes
	cd src;\
	  javac pfc/strategy/OnlyRock.java -d ../classes
	cd src;\
	  javac pfc/strategy/OnlyScissors.java -d ../classes
	cd src;\
	  javac pfc/strategy/Sequence.java -d ../classes

StrategyTest:
	javac -classpath test-1.7.jar test/StrategyTest.java
	java -jar test-1.7.jar StrategyTest

PlayerTest:
	javac -classpath test-1.7.jar test/PlayerTest.java
	java -jar test-1.7.jar PlayerTest

GameTest:
	javac -classpath test-1.7.jar test/GameTest.java
	java -jar test-1.7.jar GameTest

Doc:
	cd src;\
	  javadoc pfc pfc.util pfc.strategy -d ../docs

Play:
	cd classes;\
	  java pfc.Main

Jar:
	cd classes;\
	  jar cvfm ../appli.jar ../manifest-ex pfc

Exe:
	java -jar appli.jar