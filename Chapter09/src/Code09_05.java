public class Code09_05 {
	public static void main(String[] args) {
		int ary[] = { 10, 20, 30, 40, 50 };
		int count, size;

		count = ary.length;
		size = count * Integer.BYTES;

		System.out.println("배열 ary[]의 요소의 개수 : " + count);
		System.out.println("배열 ary[]의 요소의 전체 크기 : " + size);
	}
}