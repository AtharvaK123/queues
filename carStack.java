public class carStack implements Comparable<carStack>
{
    int car;
    int id;
    int mpg;
    int engineSize;
    int hp;
    int weight;
    int accel;
    int numCyl;

    public carStack (String car, String id, String mpg, String engineSize, String hp, String weight, String accel, String numCyl)
    {
        this.car=Integer.parseInt(car);
        this.id = Integer.parseInt(id);
        this.mpg = Integer.parseInt(mpg);
        this.engineSize = Integer.parseInt(engineSize);
        this.hp = Integer.parseInt(hp);
        this.weight = Integer.parseInt(weight);
        this.accel = Integer.parseInt(accel);
        this.numCyl = Integer.parseInt(numCyl);
    }
    public String toString()
    {
		return car + "\t" + id + "\t" + mpg + "\t" + engineSize + "\t" + hp + "\t" + weight + "\t" + accel + "\t" + numCyl + "\n";
	}

    public int getCar()
    {
        return car;
    }
    public int getID()
    {
        return id;
    }
    public int getMPG()
    {
        return mpg;
    }
    public int getEngineSize()
    {
        return engineSize;
    }
    public int getHP()
    {
        return hp;
    }
    public int getWeight()
    {
        return weight;
    }
    public int getAccel()
    {
        return accel;
    }
    public int getnumCyl()
    {
        return numCyl;
    }


  	public int compareTo (carStack other)
    {
		//1. Acceleration
		//2. Miles Per Gallon
		//3. Horsepower
		//4. Engine Size
		//5. Weight
		//6. Cylinders
		//7. CarID
		if(getAccel()>other.getAccel())
			return -1;
		if(getAccel()<other.getAccel())
			return 1;

		return getID()-other.getID();
    }


	/*public int compareTo (Object obj)
    {
		Golfer otherGolfer = (Golfer) obj;

		char a = golferName.charAt(0);
		char b = otherGolfer.golferName.charAt(0);

		if (a>b) return 1;
		if (a<b) return -1;
		return 0;
    }

*/

}