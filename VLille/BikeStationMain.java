public class BikeStationMain{
	public static void main(String[] args) {
		BikeStation s1 = new BikeStation("Timoleon",10);
	  	Bike b1 = new Bike("b001", BikeModel.CLASSICAL);
	 	Bike b2 = new Bike("b002", BikeModel.ELECTRIC);
	    s1.dropBike(b1);
	    s1.dropBike(b2);
	    int verif = 0;
	    try {int index = Integer.parseInt(args[0]);}
	    catch (NumberFormatException e){
	    	System.out.println("Wrong parameter, not int");
	    	verif=1;
	    }
	    catch (ArrayIndexOutOfBoundsException e){
	    	System.out.println("Miss parameter");
	    	verif=1;
	    }
	    if (verif==0){
	    	int index = Integer.parseInt(args[0]);
	    	Bike b3 = s1.takeBike(index);
	   		if (b3!=null){
	    	 	System.out.println(b3.toString());
	    	 	System.out.println(b3.getPrice());
	    	}
	    	else {
	    	System.out.println("No bike in this slots");
	    	}
		}
	}	
}
