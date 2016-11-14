/**
 * @author ayotti2s
 *
 */
public interface Feld<T> {
	int size();

	T get(int i);

	T set(int i, T e);

}
