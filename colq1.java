import java.util.*;
public class duplicate{
public Static void main(String args[]){
Iterator itr=dup.getKey().Iterator()
public int repeated;
while(itr.hasNext())
{
names n=(names)itr.next();
int key=n.hashcode();
while(itr.hasNext()){
if(key.equals(itr.next())){
cnt++;
}}
if(cnt>1)
repeated=repeated+1;
}
system.out.println("the number of names repeated are"+repeated);
Set<names> dup=new HashSet<names>()
dup.add(new names(1,"raudra"));
dup.add(new names(2,"ravi"));
dup.add(new names(3,"java"));
dup.add(new names(4,"ravula"));
dup.add(new names(2,"ravi"));
dup.add(new names(4,"ravula")); //override hashcode and equals method
System.out.println(dup);
}
}
public class names
{
public int key;
public string name;
names(int key,string name)
{
this.key=key;
this.name=name;
}
public int hashcode(){
return key;
}
public boolean equals(Object o)
{
if(!(o instance of names))
return false;
else
return this.key==(names)o.key;
}

