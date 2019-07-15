public class SimpleFactory {

	public static  Exam getExam(String name){
		Exam firstExam=new FirstExam();
		Exam secondExam=new SecondExam();
		if("first".equals(name)){
			return firstExam;
		}else if ("second".equals(name)){
			return secondExam;
		}else {
			return null;
		}
	}

}
