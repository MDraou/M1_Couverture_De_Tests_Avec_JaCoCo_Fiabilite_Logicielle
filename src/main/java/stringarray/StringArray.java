package stringarray;

import java.util.*;

/**
 * Cette classe n'est pas documentée
 * Le constructeur prend un tableau de chaines
 * de caractère et fait des opérations sur ce tableau
 * en lien avec du tri et de l'elimination de doublon
 * @version unknown
 * @author web 
 *
 */
public class StringArray {

	private final String [] mlist;

	public StringArray(String[] list){
		int dupl = 0;
		if (list.length > 0) {
			String last = list[0];
			int index = 0;
			while (++index < list.length){
				String comp = list[index];
				int diff = last.compareTo(comp);
				if (diff > 0){
					Arrays.sort(list);
					last=list[index];
				} else if (diff < 0) {
					last = comp;
				} else {
					dupl++;
				}
			}	
		}
		if (dupl > 0){
			String [] uniques = new String[list.length - dupl];
			String last = uniques[0] = list[0];
			int index = 0;
			int fill = -1;
			while (++index < list.length) {
				if (!last.equals(list[index])) {
					last = list[index];
					uniques[fill++] = last;
				}
			}
			mlist = uniques;
		} else {
			mlist = list;		
		}
	}
	
	public  String [] getMlist() {
		return mlist;
	}

	public String getString(int index){
		return mlist[index];
	}

	public int IndexOf( String value){
		int base = 0;
		int limit = mlist.length -1;
		while (base <= limit){
			int cur = (base + limit) >> 1;
		int diff = value.compareTo(mlist[cur]);
		if (diff < 0){
			limit = cur - 1;
		} else if (diff > 0) {
			base = cur + 1;
		} else {
			return cur;
		}
		}
		return -1;
	}

	public int size(){
		return mlist.length;
	}

}
