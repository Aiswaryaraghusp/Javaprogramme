class Product
{
int pcode;

String pname;

double price;

}

class Productprice {

public static void main(String args[])
 
{
Product pro1 = new Product();

Product pro2 = new Product();

Product pro3 = new Product();

pro1.pcode=1;

pro1.pname="samsang";

pro1.price=45000;

pro2.pcode=2;

pro2.pname="iphone";

pro2.price=67000;

pro3.pcode=3;

pro3.pname="vivo";

pro3.price=10000;

if(pro1.price<pro2.price)

{
 
if(pro1.price<pro3.price)
 
 {
  
 System.out.println("The Lowest price product is "+pro1.pname+" with price"+pro1.price);
 
 }

else
  
{
   
System.out.println("The Lowest price porduct is "+pro3.pname+" with price"+pro3.price);

  }
}

else
{
if(pro2.price<pro3.price)

{
  
 System.out.println("The Lowest price product is "+pro2.pname+" with price"+pro2.price);

}

else

{

System.out.println("The Lowest price product is "+pro3.pname+" with price"+pro3.price);

}

}

}

}

Output:
The Lowest price porduct is vivo with price10000.0



