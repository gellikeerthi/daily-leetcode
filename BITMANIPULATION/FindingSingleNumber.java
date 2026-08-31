 // a^a=0
//eg:
input                               output
// 2
// [7, 3, 7, 3, 9]                  =>9
// [10, 14, 10, 18, 14, 22, 18]     =>22
static int findSingleNumber(int[] arr) {
    int n=arr.length;
   int res=0;
   for(int num:arr){
       res=res^num;
   }
   return res;
    
}

 
