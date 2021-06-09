class Employee {
	String name;
	int salary;
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
    @Override
    public String toString() {        
        return "<name: "+name+" salary: "+salary+">";
    }
}
class EmployeeInfo
{
	enum SortMethod
	{
		BYNAME,BYSALARY;
	}
	 public List<Employee> sort(List<Employee> emps, final SortMethod method)
	 {
		 List<Employee> result;
		 switch(method)
		 {
		 	case BYNAME:
		 		//result = emps.stream().sorted((Employee emp1,Employee emp2)->emp1.name.compareTo(emp2.name)).collect(Collectors.toList());		 			
		 		Collections.sort(emps,new Comparator<Employee>(){ 
		 				public int compare(Employee emp1,Employee emp2)
		 				{
		 					return emp1.name.compareTo(emp2.name); 
		 				}
		 				}
		 		);
		 		break;
		 	case BYSALARY:
		 		
				Collections.sort(emps,new Comparator<Employee>(){ 
	 				public int compare(Employee emp1,Employee emp2)
	 				{ return emp1.name.compareTo(emp2.name); }
	 			}); 		

		 		Collections.sort(emps,new Comparator<Employee>(){ 
	 				public int compare(Employee emp1,Employee emp2)
	 				{ return emp1.salary - emp2.salary; }
	 			}); 
		 		break; 
	 		default:
	 			result = emps;
	 			break;
		 }
	 	return emps;	
	 }
  
public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character)
	 {
         boolean bool;
         bool = entities.stream().allMatch((emp) ->{ 
            if(emp.name == null) {return false;}
            else if(emp.name.startsWith(character.toUpperCase())) {return true;}
            else if(emp.name.startsWith(character.toLowerCase())) {return true;}
		    else { return false;}
          });
		 return bool;
	 }
}
public class Source {

	public Source() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
    }
}
