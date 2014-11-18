
public class WileLoopDemo {

	public static void main(String[] args) {
		String [] friends = new String[20];
		friends[0] = "Masha";
		friends[1] = "Matilda";
		friends[2] = "Rosa";
		friends[18] = "Hillary";
		friends[19] = "Natasha";
		
		int totallElements = friends.length;
		int i = 0;
		
		while (i<totallElements){
			if (friends[i] == null) {
				i++;
				continue;
			}
			if (friends[i] == "Matilda") {
				i++;
				break;
			}
			System.out.println(friends[i]);
			i++;
		}
		

	}

}
