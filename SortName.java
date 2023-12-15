package projectFinal;

	import java.util.Comparator;

	public class SortName implements Comparator<User>{
		public int compare(User u1, User u2) {
			return u1.getLastname().compareTo(u2.getLastname());
		}
	}

