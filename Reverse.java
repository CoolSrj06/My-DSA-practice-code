public class Reverse {
    public static void main(String[] args) {
        String s="Computer is Fun";
        String w=" ";
            String word=" ";
            int a=s.length();
            for(int i=0;i<a;i++)
            {
                char ch=s.charAt(i);
                if(i==a-1){
                    word=word+ch;
                    w=word+w;
                }
                if(ch!=' ')
                    word=word+ch;
                else
                {
                    w=" "+word+w;
                    word=" ";
                }
            }
            System.out.println(w);
        }
   }

