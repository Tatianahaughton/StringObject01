public class StringDemoReplace {
    public static void main(String[] args) {
        //Replace method,
        String str="Batch 14 is good81234!@#ASAGKL ghfkjghfg";
        System.out.println(str.replace("good", "Excellent"));//replaces one string with another
        System.out.println(str);//gives original input
        System.out.println(str.replaceAll("[a-z]", "&"));//replaces all chars with that specific attribute
        System.out.println("-----------------------");

        int[] arr={10,20,30};
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
        System.out.println("------------------------");

        //int[] arr2={10,20,30};
        //System.out.println(arr2);
    }
}
