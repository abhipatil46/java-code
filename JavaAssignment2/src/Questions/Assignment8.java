package Questions;
import java.util.Scanner;

class Construction{
	public String construction_name;
	public float area;
	public int estimate_time;
	public float estimate_cost;
	public float sCharg;
	
	public void takeConstructionData(String construction_name,float area,int estimate_time,float estimate_cost)
	{
		this.construction_name=construction_name;
		this.area=area;
		this.estimate_time=estimate_time;
		this.estimate_cost=estimate_cost;
	}
	public void showConstructionData() 
	{
		if(this.estimate_time>=300) {
			estimate_cost=estimate_cost*10;
			
			System.out.println(String.format("%20s %10.2f %10d %10.2f" ,this.construction_name
					,this.area,this.estimate_time,this.estimate_cost));
		}
		else if(this.estimate_time>=500) {
			estimate_cost=estimate_cost*8;
			
			System.out.println(String.format("%20s %10.2f %10d %10.2f" ,this.construction_name
					,this.area,this.estimate_time,this.estimate_cost));	
			}
		else if(this.estimate_time>=600) {
			estimate_cost=estimate_cost*7;
			
			System.out.println(String.format("%20s %10.2f %10d %20.2f" ,this.construction_name
					,this.area,this.estimate_time,this.estimate_cost));		}
		else {
			System.out.println("Invali Number of days to submit Construction details");
		}
	}
}

public class Assignment8 {

	public static void main(String[] args) {
	
		Construction []data=new Construction[5];
		
		data[0]=new Construction();
		data[0].takeConstructionData("Abhis House", 300.4f, 300, 120000.50f);
		
		data[1]=new Construction();
		data[1].takeConstructionData("Ramnath", 200.4f, 450, 230000.50f);
		
		
		data[2]=new Construction();
		data[2].takeConstructionData("Jaggu House", 540.4f, 400, 200000.50f);
		
		data[3]=new Construction();
		data[3].takeConstructionData("Abhis House", 500.4f, 336, 440000.50f);
		
		data[4]=new Construction();
		data[4].takeConstructionData("Shree", 200.4f, 500, 130000.50f);
		
		for(int i=0;i<data.length;i++) {
			data[i].showConstructionData();
		}
	}

}
