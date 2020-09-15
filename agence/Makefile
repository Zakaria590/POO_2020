Game:
	cd src;\
	  javac rental/Main.java -d ../classes

BrandTest:
	javac -classpath test-1.7.jar test/rental/BrandFilterTest.java
	java -jar test-1.7.jar rental.BrandFilterTest

ClientTest:
	javac -classpath test-1.7.jar test/rental/ClientTest.java
	java -jar test-1.7.jar rental.ClientTest

MaxTest:
	javac -classpath test-1.7.jar test/rental/MaxPriceFilterTest.java
	java -jar test-1.7.jar rental.MaxPriceFilterTest

RentalTest:
	javac -classpath test-1.7.jar test/rental/RentalAgencyTest.java
	java -jar test-1.7.jar rental.RentalAgencyTest

VehicleTest:
	javac -classpath test-1.7.jar test/rental/VehicleTest.java
	java -jar test-1.7.jar rental.VehicleTest

Doc:
	cd src;\
	  javadoc rental -d ../docs

Play:
	cd classes;\
	  java rental.Main