package home.work.collection;

public class Main {

	public static void main(String[] args) {
		ListElements<Integer> list = new ListElements<>();
		list.addElem(5);
		list.addElem(4);
		list.addElem(3);
		list.addElem(2);
		list.addElem(1);
		list.addElem(0);
		list.addElem(6);
		list.addElem(7);
		list.addElem(8);
		list.addElem(9);
		list.deleteElem();
		System.out.println(list.toString());
	}

}
