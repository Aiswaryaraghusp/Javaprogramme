class Publisher{
	String pname;
	Publisher(String p){
		pname=p;
	}
	void display(){
		System.out.println("Publisher name:"+pname);
	}
}
class Book extends Publisher{
	String bookname;
	Book(String p,String b){
		super(p);
		bookname=b;
	}
	void display(){
		super.display();
		System.out.println("Book name:"+bookname);
	}
}
class Literature extends Book{
	String litname;
	Literature(String p,String b,String l){
		super(p,b);
		litname=l;
	}
	void display(){
		super.display();
		System.out.println("Literature name:"+litname);
	}
}
class Fiction extends Book{
	String fname;
	Fiction(String p,String b,String f){
		super(p,b);
		fname=f;
	}
	void display(){
		super.display();
		System.out.println("Fiction name:"+fname);
	}

}
class Books{
	public static void main(String ar[]){
		Literature obl=new Literature("Universities Press","Wings of Fire","An autobiography of APJ Abdulkalam");
		Fiction obf=new Fiction("To kill a mocking bird","abc","harperlee");
		System.out.println("---------------------------------------");
		System.out.println("Literature");
		System.out.println("---------------------------------------");
		obl.display();
		System.out.println("---------------------------------------");
		System.out.println("Fiction");
		System.out.println("---------------------------------------");
		obf.display();
		
	}
}


Output:

---------------------------------------

Literature

---------------------------------------

Publisher name:Universities Press

Book name:Wings of Fire

Literature name:An autobiography of APJ Abdulkalam

---------------------------------------

Fiction

---------------------------------------

Publisher name:To kill a mocking bird

Book name:abc

Fiction name:harperlee



