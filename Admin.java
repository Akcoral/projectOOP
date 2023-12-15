package projectFinal;

  public class Admin extends Employee  implements Comparable<Object>{
	    
	    public Admin() {
	    }
	    
	    public Admin(String firstname, String lastname, String login, String password, double salary) {
			super(firstname, lastname, login, password, salary);
		}
	    
	    public void addUser(User user) {
	    	
			Database.users.add(user);
			
			if (user instanceof Student) {
				Student s = (Student)user;
				Database.students.add(s);
			}
			else if (user instanceof Teacher) {
				Teacher t = (Teacher)user;
				Database.teachers.add(t);
			}
			else if (user instanceof Manager) {
				Manager m = (Manager)user;
				Database.managers.add(m);
			}
			else if (user instanceof Admin) {
				Admin a = (Admin)user;
				Database.admins.add(a);
			}
			else if (user instanceof Employee) {
				Employee e = (Employee)user;
				Database.employees.add(e);
			}     
	    }
	    public void removeUser(User user) {
	    	
			Database.users.remove(user);
			
			if (user instanceof Student) {
				Student s = (Student)user;
				Database.students.remove(s);
			}
			else if (user instanceof Teacher) {
				Teacher t = (Teacher)user;
				Database.teachers.remove(t);
			}
			else if (user instanceof Manager) {
				Manager m = (Manager)user;
				Database.managers.remove(m);
			}
			else if (user instanceof Admin) {
				Admin a = (Admin)user;
				Database.admins.remove(a);
			}
			else if (user instanceof Employee) {
				Employee e = (Employee)user;
				Database.employees.remove(e);
			}
		}
		public void updateUser(User user) {
			Database.users.add(user);
		}
	}
