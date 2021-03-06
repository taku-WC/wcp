package exception;

public class Exception02 {
    public static void main(String[] args) {
    	try {
    		// tryブロック：例外が発生する可能性がある処理を記述
    		System.out.println("100 ÷ 0 は？");
    		// 0で割り算するので、例外が発生
    		int result = 100 / 0;
    		System.out.println("計算結果" + result);
    		//catch文例外が発生した時に実行する処理
    		//例外クラスが一致するので、例外処理が実行される
    	} catch (ArithmeticException e) {
    		System.out.println("例外が発生");
    	    //finallyブロック(例外発生の有無にかかわらず必ず実行する処理)
    	} finally {
    		System.out.println("プログラム終了");
    	}
    }
}
