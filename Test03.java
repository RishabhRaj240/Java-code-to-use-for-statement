class Test03 {
	public static void main(String[] args) {
		//int[] array  int[] array
		//variable  object
        //          0  1  2  3  4
		int[] ia = {3, 4, 5, 6, 7};

		//System.out.println(ia);  //[I@372f7a8d  //classname@hashcode

        /*
        System.out.println(ia[0]);  //3
		System.out.println(ia[1]);  //4
		System.out.println(ia[2]);  //5
		System.out.println(ia[3]);  //6
		System.out.println(ia[4]);  //7
        */

        //System.out.println(ia[5]);  RE: AIOOBE
		//===========================================================

		String[] sa = { "HK", "BK", "PK", "SK", "RK" };

		//System.out.println(sa);  //[Ljava.lang.String;@2f92e0f4

        /*
        System.out.println(sa[0]);  //HK
		System.out.println(sa[1]);  //BK
		System.out.println(sa[2]);  //PK
		System.out.println(sa[3]);  //SK
		System.out.println(sa[4]);  //RK
        */

		//System.out.println(ia[5]);  RE: AIOOBE
		//==========================================================
            //start  condition    increment
		for(int i=0; i<ia.length; i++) {
			System.out.println(ia[i]);  //logic
	    }

		for(int i=0; i<sa.length; i++) {
			System.out.println(sa[i]);  //logic
	    }
		//=========================================================
		int[] ia2 = {5, 7, 'a'};

		System.out.println(java.util.Arrays.toString(ia2));

		//int[] ia3 = {5, 7, 'a', "a", true, 8L, 10.5};
	}
}
