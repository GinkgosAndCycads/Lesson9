public class FullTimeEmployee extends Employee{ 
 
    public FullTimeEmployee(){ 
        super(); 
    } 
    public double getPay() { 
		double pay; 
		if(hours >40)pay = (rate*40)+((rate*2)*(hours-40)); 
		else pay = (rate*hours); 
		totalPay += pay; 
		return pay; 
	} 
} 
