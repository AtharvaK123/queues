public class carStack implements Comparable<carStack>
{
    String car;
    String id;
    String mpg; 
    String engineSize;
    String hp;
    String weight;
    String accel;
    String numCyl;

    public carStack (String car, String id, String mpg, String engineSize, String hp, String weight, String accel, String numCyl)
    {
        car = this.car;
        id = this.id;
        mpg = this.mpg;
        engineSize = this.engineSize;
        hp = this.hp;
        weight = this.weight;
        accel = this.accel;
        numCyl = this.numCyl;
    }
    public String toString()
    {
		return "";
	}
    
    public String getCar()
    {
        return car;
    }
    public String getID()
    {
        return id;
    }
    public String getMPG()
    {
        return mpg;
    }
    public String getEngineSize()
    {
        return engineSize;
    }
    public String getHP()
    {
        return hp;
    }
    public String getWeight()
    {
        return weight;
    }
    public String getAccel()
    {
        return accel;
    }
    public String getnumCyl()
    {
        return numCyl;
    }


  	public int compareTo (carStack otherGolfer)
    {

		return 0;
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