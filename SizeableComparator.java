
public class SizeableComparator<T extends Sizeable> {

	public boolean areSame(T s1, T s2) {
		return s1.getClothingSize().equals(s2.getClothingSize());
	}
}
