        int pro=1;
        while(n>0){
            int digit=n%10;
        }
        
    }
            sum+=digit;
            pro*=digit;
            n/=10;
        if(n%(sum+pro)==0)
           return true;
        else
           return false;   
}
