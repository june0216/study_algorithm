package 프로그래머스_LV1;

public class 비밀지도 {
    public static void main(String args[])
    {
        int[] arr2 = {30, 1, 21, 17, 28};
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr3 = {46, 33, 33, 22, 31, 50};
        int[] arr4 = {27, 56, 19, 14, 14, 10};

        //System.out.println(solution(5, arr1, arr2));
        System.out.println(solution(6, arr3, arr4));
    }
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++)
        {

            String s1 = Integer.toBinaryString(arr1[i]);
            String tm = "";
            if(s1.length() < n){
                while(true){
                    if(tm.length() + s1.length() == n)break;
                    tm = tm + "0";
                    System.out.println(s1 + tm);

                }
                s1 = tm + s1;
            }
            tm = "";
            String s2 = Integer.toBinaryString(arr2[i]);
            if(s2.length() < n){
                while(true){
                    if(tm.length() + s2.length() == n)break;
                    tm = tm + "0";
                }
                s2 = tm + s2;
            }
            String element = "";

            for(int t = 0; t < n; t++)
            {
                char c1 = s1.charAt(t);
                char c2 = s2.charAt(t);
                if(c1 == '0' && c2 == '0'){
                    element = element + " ";
                }
                else
                {
                    element = element + "#";
                }
            }
            answer[i] = element;

        }
        return answer;
    }
}
