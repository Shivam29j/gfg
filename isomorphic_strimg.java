 if(str1.length()!=str2.length()){

            return false;

        }

        HashMap<Character,Character>m1=new HashMap<>();

        HashMap<Character,Boolean>m2=new HashMap<>();

        if(str1.length()!=str2.length()){

            return false;

        }

        for(int i=0;i<str1.length();i++){

            char ch1=str1.charAt(i);

            char ch2=str2.charAt(i);

            

            if(m1.containsKey(ch1)== true){

                if(m1.get(ch1)!=ch2){

                    return false;

                }

            }else{

                if(m2.containsKey(ch2)==true){

                    return false;

                }else{

                    m1.put(ch1,ch2);

                    m2.put(ch2,true);

                }

            }

        }

        return true;