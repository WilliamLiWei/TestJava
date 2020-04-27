public class testMain {

	public static void main(final String[] args) {
        // Auto-generated method stub
        System.out.println("Begin");
        String tempStr = "";
        for (int i = 0; i < 10; i++) {
            tempStr += i;
        }
        System.out.println(tempStr);
        // 两维数组
        final char[][] cArr = { { 'a', 'b' }, { 'c', 'd' } };
        for (final char[] cs : cArr) {
            for (final char c : cs) {
				System.out.print(c);
			}
		}
		System.out.println("\nEnd;");
	}	
}
