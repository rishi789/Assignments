//in treeset, in your own class you have to override toString,compareto,equals methods of comparable interface
class sum3{
Treeset<Integer> ts=new Treeset<Integer>();
public int sumsk(int[] a,int x)
{
for(i=0;i<a.length();i++)
ts.add(a[i]);
while(k>0)
{
sum=sum+ts.pollFirst();
k--;
}
return sum;
}
public Static void main(String[] args)
{
Int[] a={10, 30, 50, 67, 34, 68};
int k=3;
System.out.println("the sum of first k smallest elements are"+sumsk(a,k));
}