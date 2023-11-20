package collection;

public class gendemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// generic class with string type datamember
		genclass<String>stringobj=new genclass<String>();
		stringobj.set("hello");
		System.out.println(stringobj.get());
		//generic class with integer type datamember
	    genclass<Integer>intobj=new genclass<Integer>();
		intobj.set(10);
		System.out.println(intobj.get());
		
	}

}


