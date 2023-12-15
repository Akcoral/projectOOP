package projectFinal;

import java.util.Objects;
import java.util.Vector; 

public abstract class Employee extends User implements Comparable<Object>{
	    private double salary;
	    private Vector<Message> messages;
	    
	    {
	    	messages = new Vector<Message>();
	    }
	    
	    public Employee() {
	    }
	    
	    public Employee(String firstname, String lastname, String login, String password, double salary) {
	    	super(firstname, lastname,login, password, null, null);
	    	this.salary = salary;
	    }
	    
	    public void sendMessage(Employee employee, Message message) {
			employee.messages.add(message);
		}
	    
	    public void addMessage(Message message) {
	        messages.add(message);
	    }
	    
	    public void removeMessage(Message message) {
	        messages.remove(message);
	    }
	    public void sendRequest(Employee employee, Message request) {
	        request.setRequest(true);
	        employee.addMessage(request);
	    }
	    /**
	     * Messages
	     */
	    public Vector<Message> getMessages() {
			return messages;
		}
	    
	    public void setMessages(Vector<Message> messages) {
			this.messages = messages;
		}
	    
	    /**
	    * Salary
	    */
	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	    
	    //                                 Operations

	    public String toString() {
	    	return super.toString() + "Employee [salary=" + salary + "]";
	    }   
	    
	    public int hashCode() {
	    	final int prime = 31;
	    	int result = super.hashCode();
	    	result = prime * result + Object.hash(salary);
	    	return result;
	    }
	    
	    public boolean equals(Object obj) {
	    	if(this == obj)
	    		return true;
	    	if(!super.equals(obj))
	    		return false;
	    	if(getClass() != obj.getClass())
	    		return false;
	    	Employee other = (Employee) obj;
	    	return salary == other.salary;
	    }
	    
	    public int compareTo(Object o) {
	    	if(super.compareTo(o) == 0) {
	    		Employee e = (Employee)o;
	    		if(getSalary() < e.getSalary()) return -1;
	    		else return 1;
	    	} 
	    	return 0;
	    }
	    
	}
