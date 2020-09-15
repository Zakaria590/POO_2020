


public class BikeStation {

    // DEFINIR LES ATTRIBIUTS
    private String name;
    private int capacity;
    private Bike[] slots;

    /**
     * Build BikeStation object with name and capacity defined
     * @param name The string name of the bike station
     * @param capacity The int capacity of the bike station
     */
	public BikeStation(String name, int capacity) {
	    this.name = name;
	    this.capacity = capacity;
/*	    for(int x=0; x<capacity; x++){
	    	System.out.println(x);
	    	this.slots[x]=null;
	    }*/
	    this.slots=new Bike[capacity];
	}

    /**
     * Return the name of the station
     * @return String name of the station
     */
	public String getName() {
		return this.name;
	}

    /**
     * Return the capacity of the station
     * @return Int capacity of station
     */
	public int getCapacity() {
		return this.capacity;
	}

    /**
     * Return number of bike in the station
     * @return Int number of bikes in the station
     */
	public int getNumberOfBikes() {
		int cpt=0;
		for (int i=0; i<capacity; i++){
			if (this.slots[i]!=null){
				cpt++;
			}
		}
		return cpt;
	}

    
    /**
     * Return the position of the first free slot or
     * return -1 if not free slot
     * @return First slot free in the station or -1 if any slot are free
     */
	public int firstFreeSlot() {
		for (int i=0; i<capacity; i++){
			if (null==this.slots[i]){
				return i;
			}
		}
		return -1;
	}
	
    /**
     * Return true when the bike was drop in the store or false when not 
	 * @return Return true when the bike was stock in the array slots or false when not
     * @param bike A bike object
     */
	public boolean dropBike(Bike bike) {
		int place = this.firstFreeSlot();
		if (place!=-1){
			this.slots[place]=bike;
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
    /**
     * Return the bike at index or return null if no bike in this index
     * @return the bike at index or return null if no bike in this index
     * @param i position of placemante 
     */
	public Bike takeBike(int i) {
		if (i<0 || i>this.capacity){
			return null;
		}
		Bike test = this.slots[i];
		if (test==null){
			return null;
		}
		else {
			this.slots[i] = null;
			return test;
		}
	}
	
	
}
