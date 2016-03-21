package home.work.collection;

import java.util.ArrayList;

public class ListElements<T>{
	private ArrayList<T> list = new ArrayList<>();
	
	public void deleteElem() {
		if(list.size() > 3){
			list.remove(0);
			list.remove(0);
			list.remove(list.size() - 1);
		}
	}

	public void addElem(T elem) {
		if(elem != null)
			list.add(elem);
	}

	@Override
	public String toString() {
		return "ListElements [list=" + list + "]";
	}
	
	
}
