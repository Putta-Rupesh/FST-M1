package activities;

class conv
{
	public void getResult(String name,double result)
	{
	System.out.println(String.format(name +"%.2f",result)+" Earth Years old");
	}
}
public class Activity3 {
	public static void main(String[] args) {
		double seconds = 1000000000;
		double result;
		
        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;
        
        conv obj = new conv();
        result = (seconds / EarthSeconds / MercurySeconds);
        obj.getResult("Age on Mercury: ",result);
        
        result= (seconds / EarthSeconds / VenusSeconds);
        obj.getResult("Age on Venus: ",result);
        
        result=(seconds / EarthSeconds);
        obj.getResult("Age on Earth: ",result);
        
        result=(seconds / EarthSeconds / MarsSeconds);
        obj.getResult("Age on Mars: ",result);
        
        result=(seconds / EarthSeconds / JupiterSeconds);
        obj.getResult("Age on Jupiter: ",result);
        
        result= (seconds / EarthSeconds / SaturnSeconds);
        obj.getResult("Age on Saturn: ",result);
        
        result= (seconds / EarthSeconds / UranusSeconds);
        obj.getResult("Age on Uranus: ",result);
        
        result= (seconds / EarthSeconds / NeptuneSeconds);
        obj.getResult("Age on Neptune: ",result);


	}

}

