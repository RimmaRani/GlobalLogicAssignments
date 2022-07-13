package comparableAndComparators;

class Author implements Comparable<Author>{
	String firstname;
	String lastname;
	String bookname;
	
	public Author(String firstname, String lastname, String bookname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.bookname = bookname;
	}

	@Override
	public int compareTo(Author o) {
		int last=this.lastname.compareTo(o.lastname);
		return last==0?this.firstname.compareTo(o.firstname):last;
	}
	
}

public class Comparators {

	public static void main(String[] args) {
		

	}

}
