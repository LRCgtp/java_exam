import java.util.*;

public class FirstExam implements Exam {
//	private FirstExam(){
////
////	}\

	public List<Integer> getdata() {

		Random rand = new Random();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 50; i++) {
			int a=rand.nextInt(100) + 1;
			list.add(a);
		}
		for (int i = 0; i < 10; i++) {

			System.out.println(rand.nextInt(100) + 1);

		}
		return  list;
	}

	@Override
	public void controdata() {
		Map<Integer, List> map = new HashMap<>();

//		list.forEach(in-> System.out.println(in/10));
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		List<Integer> list4 = new ArrayList<>();
		List<Integer> list5 = new ArrayList<>();
		List<Integer> list6 = new ArrayList<>();
		List<Integer> list7 = new ArrayList<>();
		List<Integer> list8 = new ArrayList<>();
		List<Integer> list9 = new ArrayList<>();
		List<Integer> list0 = new ArrayList<>();

		Exam exam=SimpleFactory.getExam("first");
		for (Integer b:exam.getdata()) {

			int a=b/10;
			switch (a){
				case 1:
					list1.add(b);
					map.put(a,list1);
					break;
				case 2:
					list2.add(b);
					map.put(a,list2);
					break;
				case 3:
					list3.add(b);
					map.put(a,list3);
					break;
				case 4:
					list4.add(b);
					map.put(a,list4);
					break;
				case 5:
					list5.add(b);
					map.put(a,list5);
					break;
				case 6:
					list6.add(b);
					map.put(a,list6);
					break;
				case 7:
					list7.add(b);
					map.put(a,list7);
					break;
				case 8:
					list8.add(b);
					map.put(a,list8);
					break;
				case 9:
					list9.add(b);
					map.put(a,list9);
					break;
				case 0:
					list0.add(b);
					map.put(a,list0);
					break;
			}


		}

		for (Integer key : map.keySet()) {
			System.out.println("key= "+ key + " and value= " + map.get(key));
		}


	}

	public static void main(String[] args) {

		Exam exam=SimpleFactory.getExam("first");
		exam.controdata();
	}
	public static int[] bubbleSort(int[] list) {
		int temp = 0;
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = list.length - 1; j > i; j--) {
				if (list[j - 1] > list[j]) {
					temp = list[j - 1];
					list[j - 1] = list[j];
					list[j] = temp;
				}
			}
			System.out.format("第 %d 趟：\t", i);
		}
		return list;
	}
}
