
public class Chapter07 {
	public static void main(String[] args) {
//		問題1
		int dist = 7;
		if (dist < 5) {
			System.out.println("とても近いです");
		}else if (dist <= 10) {
			System.out.println("近いです");
		}else if (dist <= 15) {
			System.out.println("遠いです");
		}
//		問題2
		String color = "red";
		switch(color) {
			case "red":
				System.out.println("赤信号です");
				break;
			case "yello":
				System.out.println("黄信号です");
				break;
			case "blue":
				System.out.println("青信号です");
				break;
			default:
				System.out.println("信号機の色ではありません");
		}
		
	}
}
