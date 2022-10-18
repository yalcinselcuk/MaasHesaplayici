public class Employee {

//	name : Çalışanın adı ve soyadı
//	salary : Çalışanın maaşı
//	workHours : Haftalık çalışma saati
//	hireYear : İşe başlangıç yılı

	public Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;

	public double tax() {
		if(salary >= 1000) {
			return salary*(0.03);
		}
		return 0;
	}

	public int bonus() {
		//haftalık 40 saat limit varsa aylık hesaplamak icin 4 ile carptim
//		if(workHours*4 > 160) {
//			return ((workHours*4)-160)*30;
//		}
		if(workHours > 40) {
			return ((workHours)-40)*30;
		}
		return 0;
	}
	
	public double raiseSalary() {
		if((2021-hireYear) < 10) {
			return (salary)*(0.05);
		}
		else if((2021-hireYear) >= 10 && (2021-hireYear) < 20) {
			return (salary)*(0.10);
		}
		return (salary)*(0.15);
	}

	
	public String toString() {
		return "Adi : "+name+"\nMaas : "+salary+"\nCalisma Saati :"+workHours+"\nBaslangic Yili : "+hireYear+
				"\nVergi : "+tax()+"\nBonus : "+bonus()+"\nMaas Artisi : "+raiseSalary()
				+"\nVergi ve Bonuslarla Birlikte Maas : "+(salary-tax()+bonus())+"\nToplam Maas : "+(salary+raiseSalary());
	}
}

class FirstCaseMain {
	public static void main(String[] args) {
		Employee employee = new Employee("kemal", 2000, 45, 1985);
		System.out.println(employee.toString());
	}
}
