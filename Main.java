package TrongHieu;
class Solution{
	public String Convert(String s,int numRows) {
		if(numRows==1||s.length()<=numRows) return s;
		StringBuilder[] rowsvalue = new StringBuilder[numRows];
		for(int i=0;i<numRows;i++) {
			rowsvalue[i] = new StringBuilder();
		}
		int curr=0;
		boolean isGoingDown = false;
		for(char chr:s.toCharArray()) {
			rowsvalue[curr].append(chr);
			if(curr==0||curr==numRows-1) {
				isGoingDown = !isGoingDown;
			}
			curr+=(isGoingDown)?1:-1;
		}
		StringBuilder res = new StringBuilder();
		for(StringBuilder i:rowsvalue) {
			res.append(i);
		}
		return res.toString();
	}
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input = "TRONGHIEU";
        int numRows = 4;

        String result = solution.Convert(input, numRows);
        System.out.println("Kết quả ZigZag: " + result);
    }
}