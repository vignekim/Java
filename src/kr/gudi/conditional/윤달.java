package kr.gudi.conditional;

public class 윤달 {
	
	static int 윤달(int 년도) {
		int 수 = 0;
		if(년도 % 4 == 0){
			if(년도 % 100 != 0){
				수++; // 윤년
			} else if(년도 % 100 == 0){
				if(년도 % 400 == 0) {
					수++; // 윤년
				} 
			}
		} 
		if(년도 < 2019) {
			수 += 윤달(++년도);
		}
		return 수;
	}
	
	public static void main(String[] a) {
		/**********************************************************************
		 * [문제] 2000년부터 2019년까지 20년 동안 2월이 28일인 년도의 수는? 
		 * 조건 1) 4로 나누어 떨어진다. (윤년)
		 * 조건 2) 4로 나누어 떨어지고 100으로 나누어 떨어진다. (평년)
		 * 조건 3) 4로 나누어 떨어지고 100으로 나누어 떨어지고 400으로 나누어 떨어진다. (윤년)
		 **********************************************************************/
		int 전체 = 20;
		int 수 = 0;
		수 += 윤달(2000);
//		수 += 윤달(2001);
//		수 += 윤달(2002);
//		수 += 윤달(2003);
//		수 += 윤달(2004);
//		수 += 윤달(2005);
//		수 += 윤달(2006);
//		수 += 윤달(2007);
//		수 += 윤달(2008);
//		수 += 윤달(2009);
//		수 += 윤달(2010);
//		수 += 윤달(2011);
//		수 += 윤달(2012);
//		수 += 윤달(2013);
//		수 += 윤달(2014);
//		수 += 윤달(2015);
//		수 += 윤달(2016);
//		수 += 윤달(2017);
//		수 += 윤달(2018);
//		수 += 윤달(2019);
		System.out.println(전체 - 수);
	}
	
	

}
