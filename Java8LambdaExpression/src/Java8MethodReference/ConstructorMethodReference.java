package Java8MethodReference;

interface Messageable{
	Message getMessage(String msg);
}
class Message{
	//Constructor
	Message(String msg){
		System.out.println(msg);
	}
}
public class ConstructorMethodReference {

	public static void main(String[] args) {
		Messageable object = Message::new;
		object.getMessage("GoodAfternoon Guys");

	}

}
