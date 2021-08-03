package day38_CustomClass.SalaryCalculatorTask;

public class salary {

    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public int weeklyHours;


//setInfo(): sets all the fields of SalaryCalculator
public void setInfo(double hourlyRate,double stateTaxRate,double federalTaxRate,int weeklyHours){
    this.hourlyRate = hourlyRate;
    this.stateTaxRate = stateTaxRate;
    this.federalTaxRate = federalTaxRate;
    this.weeklyHours = weeklyHours;
}
//salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
public double salary(){
    return ( hourlyRate * weeklyHours) * 52;
}

//stateTax(): calculates the totalStateTax
public double getStateTax(){
    return  ((hourlyRate*weeklyHours)*52)*stateTaxRate;
}

//federalTax(): calculates the total federal tax

    public double getFederalTaxRate(){
        return  ((hourlyRate*weeklyHours)*52)*federalTaxRate;
    }
   //salaryAfterTax(): calculates the salary after tax
    public double salaryAfterTax(){

    return salary()-getStateTax()-getFederalTaxRate();

    }

    public String toString() {
        return "salary{" +
                "hourlyRate= $" + hourlyRate +
                ", stateTaxRate= $" + stateTaxRate +
                ", federalTaxRate= $" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                '}';
    }
}

/*
SalaryCalculator
    	Attributes:
    		hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

		Actions:
			setInfo(): sets all the fields of SalaryCalculator
			salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
			stateTax(): calculates the totalStateTax
			federalTax(): calculates the total federal tax
			salaryAfterTax(): calculates the salary after tax
			toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object


 */