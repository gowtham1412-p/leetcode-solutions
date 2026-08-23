            int sumdiff=ls-rs;
            int blankdiff=lb-rb;
            if(blankdiff==0){
                if(sumdiff==0){
                    return false;
                }else{
                    return true;
                }
            }else if(blankdiff%2!=0){
                return true;
            }
            else{
                int maxdiff=9*Math.abs(blankdiff)/2;
                if(Math.abs(sumdiff)==maxdiff){
                    return false;
                }else{
