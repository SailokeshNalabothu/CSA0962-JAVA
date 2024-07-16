class Armstrong{
public static void main(String Args[]){
int num=0;
int on,rem,res=0;
on=num;
while(on!=0){
rem = on % 10;
res += Math.pow(rem,3);
on /=10;
}
if(res==num)
System.out.println("Armstrong Number");
else
System.out.println("Not Armstrong Number");
}
}