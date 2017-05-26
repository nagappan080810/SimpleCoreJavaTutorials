public class NumbersInPyramidTriangle {
	public static void main(String args[]) {
		Integer numberLimit = Integer.parseInt(args[0]);
		int rowCount = 1;
		int totalNumbers = 0;
		while (true) {
			totalNumbers = totalNumbers + rowCount;
			if (totalNumbers >= numberLimit) {
				break;
			}
			rowCount++;
		}
		System.out.println("total number of rows to be printed "+rowCount);
		int number = 1;
		int spacesCount = rowCount;
		for (int i=1; i<=rowCount; i++) {
			String numbersInLine = "";
			for (int k=1; k<=spacesCount; k++) {
				numbersInLine = numbersInLine + "  ";
			}
			spacesCount--;
			for (int j=1; j<=i; j++) {
				String prefixing = number<10 ? "0" : "";
				numbersInLine = numbersInLine + prefixing + number + "  ";
				number++;
			}
			System.out.println(numbersInLine);
		}
	}
}