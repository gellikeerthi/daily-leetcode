//ip:
// 2
// 99.99
// 1
// -99.99
// 1
//   op:
// 99.99
-99.99
    static double calculatePower(double base, long exponent) {
double ans=1;
double x=base;

if(exponent==0){
    return 1;
}
if(exponent<0){
  x=1/x;
   exponent=-exponent;
}
while(exponent>0){
    if(exponent%2==1){
        ans=ans*x;
    }
    x=x*x;
    exponent=exponent/2;
}
return ans;
    }
    
