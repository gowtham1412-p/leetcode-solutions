class Solution {
    public boolean sumGame(String num) {
        int ls=0,rs=0,lb=0,rb=0;
        int n=num.length();
        for(int i=0;i<n/2;i++){
            if(num.charAt(i)=='?'){
                lb++;
            }else{
                ls+=num.charAt(i)-'0';
            }}
            for(int i=n/2;i<n;i++){
            if(num.charAt(i)=='?'){
                rb++;
            }else{
                rs+=num.charAt(i)-'0';
            }
            }
            int sumdiff=ls-rs;
            int blankdiff=lb-rb;
            if(blankdiff==0){
                if(sumdiff==0){
                    return false;
                }else{
                    return true;
                }
            }else if(blankdiff%2!=0){
                return true;
            }
            else{
                return sumdiff!=(rb-lb)*9/2;
            }




        
    }
}