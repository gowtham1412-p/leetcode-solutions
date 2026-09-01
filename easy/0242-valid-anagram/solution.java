            return false;
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        char chi[]=t.toCharArray();
        Arrays.sort(chi);
        for(int i=0;i<ch.length;i++){
        if(s.length()!=t.length())
            if(ch[i]!=chi[i]){
                return false;

            }
        }
        return true;

    }
